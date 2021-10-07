public class Solution {
	public static String reverseEachWord(String str) {
        int i,j,n=str.length(),last=0;
        str=str+" ";
        String s="",word="";
        for(i=0;i<=n;i++){
            if(str.charAt(i)==' '){
                for(j=last;j<i;j++){
                    word=str.charAt(j)+word;
                }
                last=i+1;
                word=word+" ";
                s=s+word;
                word="";
            }
        }
        return s;
	}
}
