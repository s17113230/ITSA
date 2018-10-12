import java.util.*;

public class ITSA_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
        	String b = sc.next();

        	boolean check=false;

        	if(b.length()%2==0){
        		for(int i=0 ; i<b.length() ; i+=2){
        			if(b.charAt(i)!='('){
        				check = false;
        			}
        			else {
		        		check=true;
		        	}
        		}
        		for(int i=1 ; i<b.length() ; i+=2){
        			if(b.charAt(i)!=')'){
        				check = false;
        			}
        			else {
		        		check=true;
		        	}
        		}
        	}
        	System.out.println(check?"Yes":"No");
        	a--;
        }
    }
}
