import java.util.*;

public class itsa_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	int k = sc.nextInt();
        	int [][] x = new int[n][k];
        	int [][] ans = new int[n][k];
        	for(int i=0 ; i<n ; i++){
        		for(int j=0 ; j<k ; j++){
        			x[i][j] = sc.nextInt();
        			ans[i][j] = 0;
        		}
        	}
        	ans[0][0] = x[0][0];
        	for(int i=1; i<n ;i++){
        		ans[i][0] = ans[i-1][0]+x[i][0];
        	}
        	for(int i=1; i<k ;i++){
        		ans[0][i] = ans[0][i-1]+x[0][i];
        	}
        	for(int i=1 ; i<n ; i++){
				for(int j=1 ; j<k ;j++){
					if(ans[i-1][j]<ans[i][j-1]){
						ans[i][j]=ans[i-1][j]+x[i][j];
					}else{
						ans[i][j]=ans[i][j-1]+x[i][j];
					}
				}
        	}
        	System.out.println(ans[n-1][k-1]);
        }
    }
}
