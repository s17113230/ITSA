import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			int count2 = sc.nextInt();
			int a[] = new int[count2];
			int sum[] = new int[count2];
			for (int j = 0; j < a.length; j++) {
				a[j] = sc.nextInt();
			}
			int sum2 = 0;
			for (int j = 0; j < a.length; j++) {
				sum2 += a[j];
				if (sum2 <= 0) {
					sum2 = 0;
					sum[j] += sum2;
				} else {
					sum[j] += sum2;
				}
			}
			int max = 0;
			for (int x = 0; x < sum.length; x++) {
				if (max < sum[x]) {
					max = sum[x];
				}
			}
			System.out.println(max);
		}
	}
}
