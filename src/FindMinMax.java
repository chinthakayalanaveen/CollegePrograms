import java.util.Scanner;

public class FindMinMax {

	public static void main(String[] args) {
		int n[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		n=new int[size];
		System.out.println("enter "+size+" Elements");
		for(int i=0;i<size;i++) {
			int num=sc.nextInt();
			n[i]=num;
		}
		int max=n[0];
		int min=n[0];
		for(int i=0;i<size;i++) {
			if(n[i]>max) {
				max=n[i];	
			}
			if(n[i]<min) {
				min=n[i];
			}
		}
		System.out.println("max---->"+max);
		System.out.println("min--->"+min);
	}

}
