public class Rightrotation {
	static void arRR(int[] x) {
		int len=x.length;
		int arrLen=len-1;
		int t=x[arrLen];
		for(int i=arrLen;i>=1;i--) {
			x[i]=x[i-1];
		}
		x[0]=t;
		//System.out.println("\nAfter rotation");
		for(int i=0;i<=arrLen;i++) {
			System.out.print(+x[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		/*
		 * Right rotation
		 * 10 20 30 40 50
		 * 50 10 20 30 40  
		 * 40 50 10 20 30 
		 * 30 40 50 10 20 
		 */
		int num[]= {10,20,30,40,50};
		int arrLen=num.length;
		System.out.println("Before rotation");
		for(int i=0;i<=arrLen-1;i++) {
			System.out.print(num[i]+"  ");
		}
		System.out.println("\nAfter rotation");
		arRR(num);
		arRR(num);
		arRR(num);
		arRR(num);
	}

}
