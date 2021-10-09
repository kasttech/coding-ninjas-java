public class Solution {
	public static void rowWiseSum(int[][] mat) {
        if(mat.length==0)
            return ;
        int rows=mat.length,col=mat[0].length;
        int i=0,j=0,sum=0;
        for(i=0;i<rows;i++){
            for(j=0;j<col;j++){
                sum+=mat[i][j];
            }
            System.out.print(sum+" ");
            sum=0;
        }
	}
}
