public class Solution {
	public static String removeConsecutiveDuplicates(String str) {
		int i,j,n=str.length();
        String s="";
        if(n==1)
            return str;
        for(i=1;i<n;i++){
            if(str.charAt(i-1)==str.charAt(i))
                continue;
            else
                s=s+str.charAt(i-1);
        }
        s=s+str.charAt(n-1);
        return s;
	}
}
