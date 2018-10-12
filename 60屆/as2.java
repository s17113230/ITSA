import java.util.Scanner;
public class as2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
		String b = sc.nextLine();
        while(a>0){
        	String c = sc.nextLine();
        	char [] name = new char[c.length()];
        	for (int i=0 ; i<c.length() ; i++){
        		name[i]=c.charAt(i);
        	}
        	for (int i=name.length-1 ; i>=0 ; i--){
        		System.out.print(name[i]);
        	}
        	System.out.println("");
        	a--;
        }
    }
}
