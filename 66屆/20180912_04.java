import java.util.*;

public class test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
        	char [] check = {'I','V','X','L','C','D','M'};
        	int [] money = {1,5,10,50,100,500,1000};
	        int sum = 0;
	        int sum1 = 0;

			for (int i=0 ; i<c.length ; i++){
				for (int j=0 ; j<check.length ; j++){
					if (i < c.length-1){
						if (j < check.length-1){
							if (c[i] == 'I' || c[i] == 'X' || c[i] == 'C' || c[i] == 'M'){
								if (c[i] == check[j] && c[i+1] == check[j+1]){
									sum += money[j+1] - money[j];
									i++;
									break;
								}
							}
						}
						if (j < check.length-2){
							if (c[i] == 'I' || c[i] == 'X' || c[i] == 'C' || c[i] == 'M'){
								if (c[i] == check[j] && c[i+1] == check[j+2]){
									sum += money[j+2] - money[j];
									i++;
									break;
								}
							}
						}
					}
					if (c[i] == check[j]){
						sum += money[j];
					}
					else{
						sum += 0;
					}
				}
			}
			for (int i=0 ; i<d.length ; i++){
				for (int j=0 ; j<check.length ; j++){
					if (i < d.length-1){
						if (j < check.length-1){
							if (d[i] == 'I' || d[i] == 'X' || d[i] == 'C' || d[i] == 'M'){
								if (d[i] == check[j] && d[i+1] == check[j+1]){
									sum1 += money[j+1] - money[j];
									i++;
									break;
								}
							}
						}
						if (j < check.length-2){
							if (d[i] == 'I' || d[i] == 'X' || d[i] == 'C' || d[i] == 'M'){
								if (d[i] == check[j] && d[i+1] == check[j+2]){
									sum1 += money[j+2] - money[j];
									i++;
									break;
								}
							}
						}
					}
					if (d[i] == check[j]){
						sum1 += money[j];
					}
				}
			}
			int total = 0;
			if (sum - sum1 > 0)
				total = sum - sum1;
			else
				total = sum1 - sum;
			if (total > 0){
				while(total > 0){
					for (int i = money.length-1 ; i>=0 ;i--){
						if (total >= money[i]){
							if (total<1000 && total >= 900){
								System.out.print("CM");
								total -= 900;
								break;
							}
							else if(total < 500 && total >= 400){
								System.out.print("CD");
								total -= 400;
								break;
							}
							else if (total < 100 && total >= 90){
								System.out.print("XC");
								total -= 90;
								break;
							}
							else if(total < 50 && total >= 40){
								System.out.print("XL");
								total -= 40;
								break;
							}
							else if (total < 10 && total >= 9){
								System.out.print("IX");
								total -= 9;
								break;
							}
							else if(total < 5 && total >= 4){
								System.out.print("IV");
								total -= 4;
								break;
							}
							System.out.print(check[i]);
							total -= money[i];
							break;
						}
					}
				}
				System.out.println("");
			}
			else
				System.out.println("ZERO");
			a--;
        }
    }
}