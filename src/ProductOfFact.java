import java.util.Scanner;

public class ProductOfFact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" is::"+fact);

	}

}
