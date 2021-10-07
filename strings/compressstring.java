public class Solution {
	public static String getCompressedString(String str) {
		int i,j,n=str.length(),count=0;
        String s="";
        if(n==1)
            return str;
        for(i=1;i<n;i++){
            if(str.charAt(i-1)==str.charAt(i)){
                count++;
                continue;
            }
            else{
                count++;
                s=s+str.charAt(i-1);
                if(count>1)
                	s=s+Integer.toString(count);
            }
            count=0;
        }
        s=s+str.charAt(n-1);
        if(count>1){
            s=s+Integer.toString(count+1);
        }
        return s;
	}
}
