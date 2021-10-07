public class Solution {
	public static void printSubstrings(String str) {
		int i,j,n=str.length();
        for(i=0;i<n;i++){
            for(j=i;j<=n;j++){
            	System.out.println(str.substring(i,j));
            }
        }
	}
}
