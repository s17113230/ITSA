import java.text.DecimalFormat;
import java.util.*;

public class 20180815_02{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fx sa = new fx();
		while (sc.hasNext()) {
			int x = sc.nextInt();
			if(sa.fxtest(x)==-1) {
				continue;
			}else if(x==1){
				System.out.println("4.00000");
			}else {
				DecimalFormat df = new DecimalFormat("#.#####");
				String s = df.format(sa.fxtest(x));
				System.out.println(s);
			}
			
		}
	}
}

class fx {
	double fxtest(double x) {
		if (x == 0) {
			return -1;
		} else if (x == 1) {
			return 4;
		} else {
			if(x%2==0) {
				return fxtest(x-1)-(4/(x+(x-1)));
			}else {
				return fxtest(x-1)+(4/(x+(x-1)));
			}
			
		}

	}
}