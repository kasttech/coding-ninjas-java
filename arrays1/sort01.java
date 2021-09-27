public class Solution {  
    public static void sortZeroesAndOne(int[] arr) {
    	int i,j,lastswap=0,n=arr.length,temp;
        	for(i=0;i<n;i++){
                if(arr[i]==0){
                    temp=arr[lastswap];
                    arr[lastswap]=arr[i];
                    lastswap++;
                    arr[i]=temp;
                }
            }
    }
}
