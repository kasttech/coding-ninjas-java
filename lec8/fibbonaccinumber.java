
public class Solution {
	public static boolean checkMember(int n){
        int i=0,j=1,temp,k;
        if(n==0)
            return true;
        for(k=0;k<=n;k++){
            temp=i+j;
            if(temp==n){
            	return true;
            }
            i=j;
            j=temp;
        }
        return false;
	}
}
