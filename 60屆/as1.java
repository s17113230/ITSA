import java.util.*;
public class as1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0 ; i<a ; i++){
        	int b = sc.nextInt();
        	if (b%400==0){
        		System.out.println("Bissextile Year");
        	}
			else if (b%100==0){
				System.out.println("Common Year");
			}
        	else if (b%4==0){
        		System.out.println("Bissextile Year");
        	}
        	else{
        		System.out.println("Common Year");
        	}
        }
    }
}
