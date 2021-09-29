import java.util.*;
public class Solution {  
    public static void pushZerosAtEnd(int[] arr) {
        int i,j,n=arr.length,temp;
        for(i=0;i<n;i++){
            if(arr[i]==0){
                for(j=i+1;j<n;j++){
                    if(arr[j]!=0){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }
    }
}
