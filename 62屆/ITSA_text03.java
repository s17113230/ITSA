import java.util.*;
public class ITSA_text03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
        	String b = sc.next();
        	String c = sc.next();
        	char [] d = new char[4];
        	char [] e = new char[4];
        	b.getChars(0,b.length(),d,0);
        	c.getChars(0,c.length(),e,0);
        	a--;

        	int aco = 0;
        	int bco = 0;

        	for(int i=0 ; i<4 ; i++){
        		for(int j=0 ; j<4 ; j++){
        			if(i==j){
	        			if(d[i] == e[j]){
	        				aco++;
	        				j++;
	        			}
        			}else{
        				if(d[i] == e[j]){
        					bco++;
        				}
        			}

        		}
        	}
        	System.out.println(aco+"a"+bco+"b");
        }
    }
}
