public class Solution {
	public static void findLargest(int mat[][]){
		int maxr=Integer.MIN_VALUE,maxc=Integer.MIN_VALUE,i,j,ind_r=0,ind_c=0,sum=0;
        int rows=mat.length;
        //checking length before cols because mat[0] will be out of index if rows = 0 
        if(mat.length==0){
            System.out.println("row "+ind_r+" "+maxr);
            return;
        }
        int cols=mat[0].length;
        //summing rowwise
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
            	sum+=mat[i][j]; 
            }
            if(sum>maxr){
                maxr=sum;
                ind_r=i;
            }
            sum=0;
        }
        //summing column wise
        for(i=0;i<cols;i++){
            for(j=0;j<rows;j++){
                sum+=mat[j][i];
            }
            if(sum>maxc){
                maxc=sum;
                ind_c=i;
            }
            sum=0;
        }
        if(maxr>=maxc)
            System.out.println("row "+ind_r+" "+maxr);
        else
            System.out.println("column "+ind_c+" "+maxc);
	}
}
