public class Solution {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int i,j,n1=arr1.length,n2=arr2.length,carry=0;
        int n3 = n1>=n2?n1+1:n2+1;
        int[] arr3=new int[n3];
        int k=n3-1;
        i=n1-1;
        j=n2-1;
        while(i>=0||j>=0){
            if(i>=0 && j>=0){
                arr3[k]=(arr1[i] + arr2[j] + carry)%10 ;
                carry = (arr1[i] + arr2[j] + carry)/10 ;
                k--;
            }else
                if(i<0 && j>=0){
                arr3[k]=(arr2[j] + carry)%10 ;
                carry = (arr2[j] + carry)/10 ;
                k--;
            }else
                if(i>=0 && j<0){
                arr3[k]=(arr1[i] + carry)%10 ;
                carry = (arr1[i] + carry)/10 ;
				k--;
                }
            i--;
            j--;
        }
        if(carry!=0)
            arr3[k]=carry;
        for(i=0;i<n3;i++){
            output[i]=arr3[i];
        }
    }
}
