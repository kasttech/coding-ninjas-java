public class Solution {  
    public static void rotate(int[] arr, int d) {
		int i,j,temp,n=arr.length;
        for(i=1;i<=d;i++){
            temp=arr[0];
            for(j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
    }
}
