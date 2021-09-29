import java.util.*;
public class Solution {  
    public static void pushZerosAtEnd(int[] arr) {
        int i,j,n=arr.length,temp,count=0,lastind=0;
        for(i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }else{
                arr[lastind++]=arr[i];
            }
        }
        for(i=lastind;i<n;i++){
            arr[i]=0;
        }
    }
}
