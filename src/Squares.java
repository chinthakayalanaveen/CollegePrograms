import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int n=1,s=0;
        for(int i=1;i<=num;i++) {
            n=i*i;
            s+=n;
        //System.out.print(n+" ");
       // System.out.print(s+" ");
        
        }
        System.out.print(s);
	}

}
