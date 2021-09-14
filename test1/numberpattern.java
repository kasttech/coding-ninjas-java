import java.util.Scanner;
public class runner {
	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
        int n=str.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=n;j>=1;j--){
                if(j==i){
                    System.out.print("*");
                }else
                    System.out.print(j);
            }
            System.out.println();
        }

	}
}
