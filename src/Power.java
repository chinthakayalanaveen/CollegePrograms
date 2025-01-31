import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int m=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int p=sc.nextInt();
		for(int i=1;i<=5;i++) {
			
		System.out.print(n+" ");
		n=n*n;
		}
		System.out.println(n);
	}

}
