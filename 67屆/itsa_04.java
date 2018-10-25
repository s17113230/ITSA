import java.util.*;

public class itsa_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  		while(sc.hasNext()){
  			int n = sc.nextInt();
  			int s = sc.nextInt()-1;
  			int x = s+1;
  			String str = sc.next();
  			String [][]qu = new String[n][n];
  			String ans="";
  			for(int i=0 ; i<n ;i++){
  				for(int j=0 ; j<n ;j++){
  					qu[i][j] = sc.next();
  				}
  			}
  			for(int i=0 ; i<str.length() ; i++){
  				for(int j=0 ; j<n ; j++){
					if(qu[s][j].equals(str.substring(i,i+1))){
						ans+=String.valueOf(j+1);
						s = j;
						break;
					}
  				}
  			}
  			System.out.println(x+ans);
  		}
    }
}
