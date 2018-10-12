import java.util.*;

public class f1 {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while (a>0){
			int money = sc.nextInt();
			int people = sc.nextInt();
			int b = sc.nextInt();
			int [] pay = new int [b];
			for (int i = 0 ; i<=pay.length-1 ; i++){
				pay[i] = sc.nextInt();
			}
			int temp;

			for (int i = 0 ;i < pay.length-1;i++){
				for (int j = 0 ; j<pay.length-1-i;j++){
					if (pay[j] > pay[j+1]){
						temp = pay[j];
						pay[j] = pay[j+1];
						pay[j+1] = temp;
					}
				}
			}

			int sum = 0;

			for (int i  = 0 ;i < people ; i++){
				sum += pay[i];
			}
			if(sum <= money){
				System.out.println(sum);
			}
			else {
				System.out.println("Impossible");
			}
			a--;
		}
    }
}
