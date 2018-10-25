import java.util.*;

public class itsa_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int [] x = new int[n];
			int count=0;
			for(int i=0 ; i<n ; i++){
				x[i] = sc.nextInt();
			}
			for(int i=0 ; i<n ; i++){
				for(int j=n-1 ; j>i ; j--){
					count = can(x[i],x[j],k) == true?++count:count;
				}
			}
			if(count>0)System.out.println("YES");
			else System.out.println("NO");
        }
    }
    public static int mod(int a, int b){
    	return b>0 ? mod(b,a%b) : a;
    }

    public static boolean can (int a, int b , int k){
    	int ans;
    	ans = mod(a,b);
    	if(k%ans == 0 )return true;
    	else return false;
    }
}
