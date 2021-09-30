import java.util.*;
public class Solution {  
    public static void rotate(int[] arr, int d) {
		int i,j,temp1=0,temp2=0,n=arr.length,start=n-1,count=d;
        i=n-1;
        boolean flag=false;
        while(count>0){
            for(i=start;i-d>=0;i=i-d){
                if(flag==false){
                    temp1=arr[i-d];
                	arr[i-d]=arr[i];
                }else{
                    flag=true;
                    temp2=arr[i-d];
                    arr[i-d]=temp1;
                    temp1=temp2;
                }
                System.out.println(Arrays.toString(arr));
            }
            arr[n-d+i]=temp1;
            System.out.println(temp1+" to "+ arr[n-d+i]);
            count--;
            flag=false;
            start--;
        }
    }
}

