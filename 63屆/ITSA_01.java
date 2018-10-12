import java.util.*;

public class ITSA_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
        	int d = sc.nextInt();
			int e = sc.nextInt();

			int count=0;
			if(count==0){
				if((d==1 && e>=21) || (d==2 && e<=18)){
					System.out.println("Aquarius");
					count++;
				}
				else if((d==2 && e>=19) || (d==3 && e<=20)){
					System.out.println("Pisces");
					count++;
				}
				else if((d==3 && e>=21) || (d==4 && e<=20)){
					System.out.println("Aries");
					count++;
				}
				else if((d==4 && e>=21) || (d==5 && e<=21)){
					System.out.println("Taurus");
					count++;
				}
				else if((d==5 && e>=22) || (d==6 && e<=21)){
					System.out.println("Gemini");
					count++;
				}
				else if((d==6 && e>=22) || (d==7 && e<=22)){
					System.out.println("Cancer");
					count++;
				}
				else if((d==7 && e>=23) || (d==8 && e<=23)){
					System.out.println("Leo");
					count++;
				}
				else if((d==8 && e>=24) || (d==9 && e<=23)){
					System.out.println("Virgo");
					count++;
				}
				else if((d==9 && e>=24) || (d==10 && e<=23)){
					System.out.println("Libra");
					count++;
				}
				else if((d==10 && e>=24) || (d==11 && e<=22)){
					System.out.println("Scorpio");
					count++;
				}
				else if((d==11 && e>=23) || (d==12 && e<=21)){
					System.out.println("Sagittarius");
					count++;
				}
				else if((d==12 && e>=22) || (d==1 && e<=20)){
					System.out.println("Capricorn");
					count++;
				}
			}
        	a--;
        }
    }
}
