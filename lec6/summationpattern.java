import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		int n = str.nextInt();
		int i ,j, sum = 0;
		for(i=1;i<=n;i++){
		    sum += i;
		    for(j=1;j<=i;j++){
		        Systeam.out.print(j);
		        if(j<i)
		        System.out.print("+");
		    }
		    System.out.println("=" + sum);
		}
	}
}
