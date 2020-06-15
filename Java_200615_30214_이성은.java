package Java_200615_30214_이성은;

public class Java_200615_30214_이성은 {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print(5-j);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=5, i>0, i--) {
			for (int j=0, j<i, j++) {
				System.out.print(5-j);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<5; i++) {
			for (int j=0; j< 2-(i/2); j++) {
				System.out.print(' ');
			}
			for (int k=0; k<i+1; k++) {
				System.out.print(k+1);
			}
			System.out.println();
		}
	}
}
