public class Solution {
	public static String reverseWordWise(String input) {
        input.trim();
		int i,n=input.length();
        input = " "+input;
        String rev="",word="";
        for(i=n;i>=0;i--){
            if(input.charAt(i)==' '){
                word+=' ';
                rev+=word;
                word="";
            }else{
                word=input.charAt(i)+ word;
            }
        }
        input=rev;
        return input;
	}
}
