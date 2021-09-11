import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		int n = str.nextInt();
		int i ,j,nextnum=1;
		for(i=1;i<=n;i++){
		    for(j=1;j<=n;j++){
		        System.out.print(nextnum);
		        nextnum = nextnum +2 ;
		        if(nextnum>=2*n)
		            nextnum = nextnum%(2*n);
		    }
		    nextnum = nextnum + 2;
		    System.out.println();
		}
	}
}
