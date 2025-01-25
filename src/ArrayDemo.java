
public class ArrayDemo {

	public static void main(String[] args) {
		//Arrays
		//int a1,a2,a3....a100;
		/*int[]a;
		a=new int[1000];
		a[0]=100;
		a[1]=200;
		a[999]=2121;
		int a[]=new int[5]
		*/
		int a[]=new int[5];
		int v=100;
		for(int i=0;i<=4;i++) {
			a[i]=v;
			v=v+100;
		}
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
		

	}

}
