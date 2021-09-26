import java.util.Scanner;
public class Solution {
	public static void main (String[] args) {
    
        int startvalue =0 ,endvalue=0 ,stepsize=0;
        Scanner str = new Scanner(System.in);
        int start=str.nextInt();
        int end=str.nextInt();
        int step=str.nextInt();
        Solution.printFahrenheitTable(start, end, step);
        
    }
    public static void printFahrenheitTable(int startvalue,int endvalue,int stepsize){
        int looptimes = (endvalue-startvalue)/stepsize;
        for(int i = startvalue ; i<=endvalue;i=i+stepsize){
            System.out.print(i+" ");
            System.out.println((((i-32)*5)/9)+"\n");
        }
    }
}
