import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
        int n=str.nextInt();
        int i,num,temp=0,prev,change=0;
        boolean strictinc = true;
        for(i=1;i<=n;i++){
        	num = str.nextInt();
            prev = temp;
            temp = num;
            if(prev<num){
                strictinc = true;
                continue;
            }else {
                strictinc = false;
                change++;
            }
            if(prev==num){
                System.out.println("false");
                return;
            }
        }
        if(strictinc==true&&change<=1)
            System.out.println("true");
        else
            System.out.println("false");

	}
}
