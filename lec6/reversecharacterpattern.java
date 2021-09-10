import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n,i,j,count=1;
		char ch ,ch2;
        Scanner str = new Scanner(System.in);
        n = str.nextInt();
        ch = (char)('A' + n -1) ;
        for(i=1;i<=n;i++){
            for(j=0;j<count;j++){
                System.out.print((char)(ch+j));
            }
            System.out.println();
            count++;
            ch--;
        }
	}
}
