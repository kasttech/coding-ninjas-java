import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
    	Scanner str= new Scanner(System.in);
        int n = str.nextInt();
        int loop1lines = n;
        int loop2lines = n-1;
        int i ,j,count = 1;
        
        System.out.println("*");
        for(i=1;i<=loop1lines;i++){
            System.out.print("*");
            for(j=1;j<=2*i-1;j++){
                if(j<=i){
                    System.out.print(j);
                }else
                System.out.print(2*i-j);
            }
            System.out.print("*\n");
        }
        for(i=loop2lines;i>=1;i--){
            System.out.print("*");
            for(j=1;j<=2*i-1;j++){
                if(j<=i){
                    System.out.print(j);
                }else
                System.out.print(2*i-j);
            }
            System.out.print("*\n");
        }
        System.out.println("*");
    }
}
