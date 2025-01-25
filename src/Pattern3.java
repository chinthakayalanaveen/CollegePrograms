
public class Pattern3 {

	public static void main(String[] args) {
		/*  5 5 5 5 5
		 *   4 4 4 4
		 *    3 3 3
		 *     2 2 
		 *      1 
		 */
		for(int r=5,sp=10;r>=1;r--) {
			for(int k=sp;k>1;k--) {
				System.out.print(" ");
			}
			sp=sp+2;
			for(int c=1;c<=r;c++) {
				System.out.print(r+"  ");
			}
			System.out.println(" ");
		}
	}

}

