import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		int i,j,n;
		Scanner str = new Scanner(System.in);
		n = str.nextInt();
		int mid =(int)(n+1)/2;
		for(i=1;i<=mid;i++){
		    for(j=mid;j>=1;j--){
		        if(j-i>0){
		            System.out.print(" ");
		        }else
		        System.out.print("*");
		    }
		    for(j=i;j>1;j--){
		        System.out.print("*");
		    }
		    System.out.println();
		 }
		 
		 for(i=1;i<=n-mid;i++){
		    for(j=1;j<=mid;j++){
		        if(j-i<=0)
		            System.out.print(" ");
		        else 
		            System.out.print("*");
		    }
		    for(j=n-mid;j>=1;j--){
		        if(j-i>0){
		            System.out.print("*");
		        }else
		        System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
