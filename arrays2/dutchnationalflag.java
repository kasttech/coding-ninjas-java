public class Solution {
    public static void sort012(int[] arr){
    	int i=1,j,n=arr.length,low=0,mid=0,hi=n-1,temp=0;
        while(mid<=hi){
            if(arr[mid]==0){
               // swap(arr[low],arr[mid]);
                temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }else
            if(arr[mid]==1){
                mid++;
            }else
            if(arr[mid]==2){
                //swap(arr[mid], arr[hi]);
                temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
    }
}