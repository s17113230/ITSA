import java.util.Scanner;
public class 20180815_04{
	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
			int aa = a;
			int count1 = 0;
			int count2 = 0;
			int table[] = new int[n];
			for (int i = 0; i < n; i++) {
				table[i] = i+1;
			}
			for (int i = a - 1; i < n; i++) {
				if (table[i] != 0) {
					count1++;
				}
				if (count1 == b) {
					count2++;
					if (count2 == n) {
						System.out.println(table[i]);
						break;
					} else {
						System.out.print(table[i] + " ");
						table[i] = 0;
						count1 = 0;
					}
				}
				if (i == n - 1) {
					i = -1;
				}
			}
		}
	}
}