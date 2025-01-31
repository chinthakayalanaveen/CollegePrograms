import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number::");
		int num = sc.nextInt();
		if (num < 0) {
			num = -1 * num;
		}
		for (int i = 0; i < num; i++) {
			count++;
		}
		System.out.println(count);

	}

}
