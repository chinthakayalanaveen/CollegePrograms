import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		int n = 0, n1 = 1;
		int n2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = sc.nextInt();
		System.out.print(n + " " + n1 + " ");
		for (int i = 1; i < (num-1); i++) {
			n2 = n + n1;
			n = n1;
			n1 = n2;
			System.out.print(" " + n2 + " ");
		}

	}

}
