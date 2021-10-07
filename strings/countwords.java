public class Solution {
	public static int countWords(String str) {	
        if(str.length()==1&&str.charAt(0)==' ')
            return 0;
        if(str.length()==0)
            return 0;
        int words = 0;
        str= str + " ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ')
            	words++;
        }
        return words;
    }
}
