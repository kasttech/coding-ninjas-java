import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int i,j,n;
		Scanner str = new Scanner(System.in);
		n = str.nextInt();
		for(i=1;i<=n;i++){
		    for(j=n;j>=1;j--){
		        if(j-i>0){
		            System.out.print(" ");
		        }else
		        System.out.print(i-j+1);
		    }
		    for(j=i;j>1;j--){
		        System.out.print(j-1);
		    }
		    System.out.println();
		}
	}
}
