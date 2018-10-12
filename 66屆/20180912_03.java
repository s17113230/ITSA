import java.util.*;

public class test03 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0 ; i<a ; i++){
			int x = 0;
			String b = sc.next();
			System.out.println("Tokens found:");
			for(int j=0 ; j<b.length() ; j++){
				if(b.charAt(j)==',' || b.charAt(j)==':' || b.charAt(j)==';'){
					System.out.println(b.substring(x,j));
					x = j+1;
				}
			}
			System.out.println(b.substring(x,b.length()));
		}
    }
}
