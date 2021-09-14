import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int n=str.nextInt();
        int i,sum=0,temp,numtemp=n,j=0;
        while(n>0){
            temp=n%10;
            n=n/10;
            j++;
        }
        n=numtemp;
        while(n>0){
            temp=n%10;
            sum=sum+(int)Math.pow(temp,j);
            n=n/10;
        }
        if(sum==numtemp)
        	System.out.println("true");
        else
            System.out.println("false");
	}
}
