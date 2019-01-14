import java.util.*;

public class test02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pi = "3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196442881097566593344612847564823378678316527120190914564856692";
        int k,n,num;
        while(sc.hasNext()){
            k = sc.nextInt();
            while(k>0){
                n = sc.nextInt();
                for(int i=0 ; i<n ; i++){
                    num = sc.nextInt();
                    System.out.println(pi.charAt(1+num));
                }
                k--;
            }
        }
    }
}
