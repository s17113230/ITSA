import java.util.*;
public class f2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a>0){
			int [] money = {1,5,10,50};
			int [] time = new int [4];
			String x = sc.next();
			String [] y = x.split("[,;\\s]+");
			int b = Integer.parseInt(y[0]);
			int c = Integer.parseInt(y[1]);
			int d = Integer.parseInt(y[2]);
			int sum = 0;
			if (c==1)
				c=17;
			else
				c=25;
			a--;
			b-=c*d;
			for (int i=money.length-1 ; i>=0 ; i--){
				while (b>=money[i]){
					b -= money[i];
					time[i]++;
				}
			}
			for (int i=0 ; i<money.length ; i++){
				if(time[i]>0){
					if(sum>0){
						System.out.print(",");
						sum--;
					}
					System.out.print("Coin "+money[i]+":"+time[i]);
					sum++;
				}
			}
			System.out.println("");
		}
    }
}
