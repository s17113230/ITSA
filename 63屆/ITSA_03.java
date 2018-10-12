import java.util.*;
import java.text.DecimalFormat;

public class ITSA_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        do{
        	double height = sc.nextDouble();
        	double weight = sc.nextDouble();
        	double age = sc.nextDouble();
			int count = sc.nextInt();

        	double hat = weight / height * 41.2;
        	double coat = weight * height / 634.4;
        	double pants = weight * 0.4;

			if(age>22){
				if(age%5==0){
					for(int i=30 ; i<age ; i+=5){
						coat +=0.15;
					}
				}else if(age%5!=0){
					for(int i=30 ; i<age-5 ; i+=5){
						coat +=0.15;
					}
				}
				if(age%2==0){
					for(int i=28 ; i<age ; i+=2){
						pants += 0.25;
					}
				}else if (age%2!=0){
					for(int i=28 ; i<age-2 ; i+=2){
						pants += 0.25;
					}
				}
			}

			DecimalFormat df=new DecimalFormat("0.00");
			String h = df.format(hat);
			String c = df.format(coat);
			String p = df.format(pants);

			System.out.println(h + " " + c + " " + p);


			if(count<0){
				check = true;
			}
        }while(!check);
    }
}
