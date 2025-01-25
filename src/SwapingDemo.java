
public class SwapingDemo {

	public static void main(String[] args) {
		int a=100,b=200;
		int t;
		System.out.println("before swapping");
		System.out.println("a--->"+a);
		System.out.println("b--->"+b);
		t=a;
		a=b;
		b=t;
		
		System.out.println("after swapping");
		System.out.println("a--->"+a);
		System.out.println("b--->"+b);

	}

}
