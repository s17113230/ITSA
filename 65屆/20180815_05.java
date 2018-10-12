import java.util.*;
import java.lang.Math;

public class 20180815_05 {
    public static void main(String[] args) {
    	int a = 6;
    	Scanner sc= new Scanner(System.in);
    	while(a>0){
    		int roll = sc.nextInt();
    		int count = sc.nextInt();
    		int child = 0;
	    	int point = roll*6;
	    	int [][]comb = new int[roll+1][point+1];
			if(roll == 0 && count==0){
				break;
			}
	    	int i,j,k;
			comb[1][1]=1;
			comb[1][2]=1;
			comb[1][3]=1;
			comb[1][4]=1;
			comb[1][5]=1;
			comb[1][6]=1;
	        for(i=2; i<=roll ; i++){
	        	for(j=i;j<=i*6;j++){
	        		for(k=j-6;k<j;k++){
						if(k<0)continue;
						comb[i][j] += comb[i-1][k];
	        		}
	        	}
	        }

	        for(int x=roll ; x<comb.length;x++){
	        	for(int z=0 ; z<comb[x].length;z++){
	        		if(comb[x][z]>0 && z>=count){
						child += comb[x][z];
	        		}
	        	}
	        }
	        System.out.println(yu(child,(int)Math.pow(6,roll)));
	        a--;

    	}
    }


	static int GCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return a % b == 0 ? b : GCD(b, a % b);
	}

	public static String yu(int a, int b) {

		String ans = "";
		if (a / b == 1) {
			return "1";
		}else if(a==0){
			return "0";
		} else {
			int GDD = GCD(a, b);
			a = a / GDD;
			b = b / GDD;
			if (a > b) {
				ans+=a;
				return ans;
			} else {
				return a + "/" + b;
			}
		}
	}
}
