public class Solution {
	public static boolean isPermutation(String str1, String str2) {
        int count1[] = new int [128];
        int count2[] = new int [128];
        int i,j1,j2;
        int n1=str1.length(),n2=str2.length();
        char ch1,ch2;
        if(n1!=n2)
            return false;
        for(i=0;i<n1;i++){
            j1=str1.charAt(i);
            j2=str2.charAt(i);
            count1[j1]++;
            count2[j2]++;
        }
        for(i=0;i<128;i++){
            if(count1[i]!=count2[i])
                return false;
        }
        return true;
  }
}
