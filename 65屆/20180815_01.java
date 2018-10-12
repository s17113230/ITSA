import java.util.Scanner;
public class 20180815_01{
	public static void main(String [] argv){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
		String s=sc.next();
		String s1="";
		for(int i=s.length()-1;i>=0;i--){
			s1+=s.charAt(i);
		}
		if(s.equals(s1))
			System.out.println("YES");
		else
			System.out.println("NO");
		}
	}
}