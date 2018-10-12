import java.util.*;
import java.text.DecimalFormat;

public class f1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a>0){
        	int b = sc.nextInt();
        	int [] c = {0,120,330,500,700};
        	double [] d = {2.1,3.02,4.39,4.97,5.63};
        	double [] e = {2.1,2.68,3.61,4.01,4.5};
        	double sum = 0;
        	double nsum = 0;
        	int i = c.length-1;
        	while(i>0){
        		if(c[i] < b){
        			break;
        		}
        		i--;
        	}
        	while(i >= 0){
        		sum += (b-c[i]) * d[i];
        		nsum += (b-c[i]) * e[i];
        		b = c[i];
        		i--;
        	}
        	DecimalFormat df=new DecimalFormat("0.00");
			String s=df.format(sum);
			String n=df.format(nsum);
        	System.out.println("Summer months:"+s);
        	System.out.println("Non-Summer months:"+n);
        	a--;
        }
    }
}