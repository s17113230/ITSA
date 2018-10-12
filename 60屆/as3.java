import java.util.Scanner;
public class as3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
        	int b = sc.nextInt();
        	int c = sc.nextInt();
        	int [] name = new int [b];
        	for (int i=0 ; i<b ; i++){
        		name[i] = sc.nextInt();
        	}
        	while(c>0){
        		int d = sc.nextInt();
        		int e = sc.nextInt();
        		d = d-1;
        		e = e-1;
        		long total = 0L;
        		for (int i=d ; i<=e ; i++){
        			total += name[i];
        		}
        		System.out.println(total);
        		c--;
        	}
        	a--;
        }
    }
}
