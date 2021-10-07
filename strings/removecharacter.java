public class Solution {
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		int i,n=str.length();
        String s="";
        for(i=0;i<n;i++){
            if(str.charAt(i)!=ch)
                s=s+str.charAt(i);
            else
                continue;
                
        }
        return s;
	}
}
