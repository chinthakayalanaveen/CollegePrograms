
public class PrimeNov1 {

	public static void main(String[] args) {
		int num=31,count=0;
		for(int i=num;i>=1;i--) {
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("prime");
		else
			System.out.println("not a prime");
	}

}
