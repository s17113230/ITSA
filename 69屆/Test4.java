import java.util.*;

public class Test4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            while(num>0) {
                String str = sc.next();
                int i = 0;
                while (true) {
                    if (str.charAt(i) == 'a') {
                        str = str.substring(0, i+1) + new StringBuffer(str.substring(i + 1, str.length())).reverse();
                    } else if (str.charAt(i) == 'b') {
                        str += str.substring(i+1,str.length());
                    } else if(str.charAt(i)=='c'){
                        str = "" + new StringBuffer(str).delete(i+1,i+3);
                    }
                    if (i >= str.length() - 1) break;
                    i++;
                }
                System.out.println(str);
                num--;
            }
        }
    }
}
