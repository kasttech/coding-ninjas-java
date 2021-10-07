public class Solution {
	public static boolean isPermutation(String str1, String str2) {
		int i,j,n1=str1.length(),n2=str2.length(),hit=0;
        if(n1!=n2)
            return false;
        for(i=0;i<n1;i++){
            hit=0;
            for(j=0;j<n2;j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    hit++;
                }
            }
            if(hit==0)
                return false;
        }return true;
	}
}
