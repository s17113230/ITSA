import java.util.Scanner;

public class ITSA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int x = 0; x <=count; x++) {
			String s = sc.nextLine();
			int b[] = new int[s.length()];
			char a[] = new char[s.length()];
			for (int i = 0; i < s.length(); i++) {
				a[i] = s.charAt(i);
			}
			for (int i = 0; i < a.length;i++) {
				for (int j = 0; j < a.length;j++) {
					if (a[i] == a[j]) {
						b[i]++;
					}
				}
			}
			for (int i = 0; i < b.length;i++) {
				for (int j = 0; j < b.length;j++) {
					if (b[i] < b[j]) {
						b[i]=0;
					}
				}
			}
			for(int i=0;i<b.length;i++) {
				if(b[i]>0) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
