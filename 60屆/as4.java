import java.util.Scanner;
public class as4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
		String b = sc.nextLine();
        while(a>0){
        	String c = sc.nextLine();
        	char [] name = new char[c.length()];
        	int [] d = new int [c.length()];
        	for (int i=0 ; i<c.length() ; i++){
        		name[i]=c.charAt(i);
        	}
        	String y = "";
        	y += name[0];
        	d[0] = Integer.parseInt(y);
        	String x = "";
        	x += name[2];
        	d[2] = Integer.parseInt(x);
        	String z = "";
        	z += name[4];
        	d[4] = Integer.parseInt(z);
        	String m = "";
        	m += name[6];
        	d[6] = Integer.parseInt(m);
			int a1 = d[0] * d[6];
			int a2 = d[2] * d[6];
			int a3 = d[4] * d[2];
			int a4 = d[6] * d[2];
			a1 = a1 + a3;
			for (int i=2;i<100;i++){
				if ((a1 % i ==0) && (a2 % i ==0)){
					a1 = a1 / i;
					a2 = a2 / i;
					i--;
				}
			}
			System.out.println(a1+"/"+a2);

        	a--;
        }
    }
}
