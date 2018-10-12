import java.util.*;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	String [] a = new String[5];
        	int x = 0;
        	double ans=0,num=0;
        	char symbol;
        	for(int i=0 ; i<5 ; i++){
        		a[i] = sc.next();
        		if(a[i].charAt(0)=='x'){
        			x=i;
        		}
        	}

        	if(x==0){
        		num = Double.parseDouble(a[2]);
        		ans = Double.parseDouble(a[4]);
        		symbol = a[1].charAt(0);
				if(symbol=='+'){
					System.out.printf("%.1f",ans-num);
					System.out.println();
				}
				if(symbol=='-'){
					System.out.printf("%.1f",ans+num);
					System.out.println();
				}
				if(symbol=='*'){
					System.out.printf("%.1f",ans/num);
					System.out.println();
				}
				if(symbol=='/'){
					System.out.printf("%.1f",ans*num);
					System.out.println();
				}
        	}

        	if(x==2){
				num = Double.parseDouble(a[0]);
        		ans = Double.parseDouble(a[4]);
        		symbol = a[1].charAt(0);
				if(symbol=='+'){
					System.out.printf("%.1f",ans-num);
					System.out.println();
				}
				if(symbol=='-'){
					System.out.printf("%.1f",num-ans);
					System.out.println();
				}
				if(symbol=='*'){
					System.out.printf("%.1f",ans/num);
					System.out.println();
				}
				if(symbol=='/'){
					System.out.printf("%.1f",num/ans);
					System.out.println();
				}
        	}

        	if(x==4){
				num = Double.parseDouble(a[0]);
        		ans = Double.parseDouble(a[2]);
        		symbol = a[1].charAt(0);
				if(symbol=='+'){
					System.out.printf("%.1f",num+ans);
					System.out.println();
				}
				if(symbol=='-'){
					System.out.printf("%.1f",num-ans);
					System.out.println();
				}
				if(symbol=='*'){
					System.out.printf("%.1f",num*ans);
					System.out.println();
				}
				if(symbol=='/'){
					System.out.printf("%.1f",num/ans);
					System.out.println();
				}
        	}
        }
    }
}
