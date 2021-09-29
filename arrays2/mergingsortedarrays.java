public class Solution {  
    public static int[] merge(int arr1[], int arr2[]) {
    	int i=0,j=0,n1=arr1.length,n2=arr2.length,temp=0;
        int ns=n1+n2;
        int [] arr3=new int[ns];
        while(n1>0&&n2>0){
            if(arr1[i]<=arr2[j]){
                arr3[temp++]=arr1[i];
                i++;
                n1--;
            }else{
                arr3[temp++]=arr2[j];
                j++;
                n2--;
            }
        }
        if(n1>0){
            while(temp<ns){
                arr3[temp++]=arr1[i++];
            }
        }else 
        if(n2>0){
            while(temp<ns){
                arr3[temp++]=arr2[j++];
            }
        }
        return arr3;
    }

}
