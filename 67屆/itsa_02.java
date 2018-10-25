import java.util.*;

public class itsa_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int n = sc.nextInt();
	        int count=0;
	        int sum=0;
	        for(int i=1 ; i<=n ; i++){
	        	count++;
	        	sum+=i;
	        	if(sum==n)break;
	        	else if(sum>=n){
	        		count--;
	        		break;
	        	}
	        }
	        System.out.println(count);
        }
    }
}
