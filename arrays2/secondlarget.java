public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	int i,temp=Integer.MIN_VALUE,templ=Integer.MIN_VALUE,n=arr.length;
        for(i=0;i<n;i++){
            if(arr[i]>temp){
                templ=temp;
                temp=arr[i];
            }else
                if(arr[i]>templ&&arr[i]!=temp){
                    templ=arr[i];
                }
      //      System.out.println(arr[i]+" "+templ+" "+temp );
        }
    	return templ;
    }

}
