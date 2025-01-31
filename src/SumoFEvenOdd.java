
public class SumoFEvenOdd {

	public static void main(String[] args) {
		int e=0,o=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				e=e+i;
				//System.out.print(i+" ");
			}
			 if(i%2==1) {
				o=o+i;
			// System.out.println(i);
				
			}
			
		}
		System.out.println(e);
		System.out.println(o);

	}

}
