import java.util.Scanner;
public class Solution
{
	public static void main(String[] args) {
		int i,j,n,count,evecount=1;
		Scanner str = new Scanner(System.in);
		n = str.nextInt();
		for(i=1;i<=n;i++){
		    count = i;
		    for(j=n;j>=1;j--){
		        if(j-i>0){
		            System.out.print(" ");
		        }else
		        System.out.print(count++);
		    }
		    for(j=1;j<=i;j++){
		        if(i-j>0)
		        System.out.print(evecount--);
		    }
		    evecount = 2*i;
		    System.out.println();
		}
	}
}
