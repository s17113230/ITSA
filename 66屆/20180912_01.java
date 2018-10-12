import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int i, j;
			boolean boo = false;
			String N = sc.nextLine();
			String[] arrays = N.split(" ");
			String[] array = new String[arrays.length];
			int a[] = new int[arrays.length];
			int b[] = new int[arrays.length];
			for (i = 0; i < arrays.length; i++) {
				array[i] = arrays[i];
			}
			for (i = 0; i < arrays.length; i++) {
				a[i] = Integer.parseInt(array[i]);
				if (i >= 1) {
					for (j = 0; j <= i; j++) {
						if (a[i] == a[j]) {
							b[i]++;
						}
					}
				}
			}
			for (i = 0; i < b.length; i++) {
				if (b[i] > (arrays.length / 2) || arrays.length==1) {
					System.out.println(arrays[i]);
					boo = false;
					break;
				}
				if (i == b.length - 1) {
					if (boo == false) {
						System.out.println("NO");
					}
				}
			}
		}
	}
}
