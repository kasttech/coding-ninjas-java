import java.util.Arrays;
public class Solution {
    public static int findTriplet(int[] arr, int x) {
    	int i,j,k,total=0,n=arr.length,repeated=0;
        Arrays.sort(arr);
        for(i=0;i<n-2;i++){
            for(j=i+1;j<n-1;j++){
                for(k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        total++;
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    	}
                	}
            	}
        	}
        return total;
        }
    }
