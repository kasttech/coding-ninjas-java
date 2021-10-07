import java.util.*;
public class Solution {
	public static char highestOccuringChar(String str) {
		int i,n=str.length(),max=0,maxi=0;
        char ch=' ';
        int[] c1=new int[26];
        for(i=0;i<n;i++){
            c1[(int)str.charAt(i)-97]++;
        }
        for(i=0;i<26;i++){
            if(c1[i]>max){
                max=c1[i];
                maxi=i;
            }
        }
        //System.out.println(Arrays.toString(c1));
        return (char)(maxi+97);
	}
}
