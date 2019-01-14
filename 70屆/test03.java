import java.util.*;

public class test03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,M;
        int one_i,one_end;
        int two_x,two_y;
        int three_x,three_y;
        int count=0;
        int temp_count=0;
        int three_count=0;
        while(sc.hasNext()){
            count=0;
            temp_count=0;
            three_count=0;
            one_i=0;
            one_end=0;
            two_x=0;
            two_y=0;
            three_x=0;
            three_y=0;
            N = sc.nextInt();
            M = sc.nextInt();
            if(N*N==M){
                count++;
            }else if(M==1){
                count++;
            }else {
                one_i = N / 2 - M + 1 < 0 ? 0 : N / 2 - M + 1;
                one_end = N / 2 + M - 1 > N - 1 ? N - 1 : N / 2 + M - 1;
                for (; one_i + M - 1 <= one_end; one_i++) {
                    count++;
                }
                count *= 2;

                if (M == 1 || M == 4 || M == 9 || M == 16) {
                    two_x = N / 2 - M / 2 + 1 < 0 ? 0 : N / 2 - M / 2 + 1;
                    two_y = N / 2 + M / 2 - 1 > N - 1 ? N - 1 : N / 2 + M / 2 - 1;
                    for (; two_x + Math.sqrt(M) - 1 <= two_y; two_x++) {
                        temp_count++;
                    }
                    count += temp_count * temp_count;
                } else if(M%2==0){
                    two_x = N / 2 - M / 2 + 1 < 0 ? 0 : N / 2 - M / 2 + 1;
                    two_y = N / 2 + M / 2 - 1 > N - 1 ? N - 1 : N / 2 + M / 2 - 1;
                    three_x = N / 2 - M / 2 + 2 < 0 ? 0 : N / 2 - M / 2 + 2;
                    three_y = N / 2 + M / 2 - 2 > N - 1 ? N - 1 : N / 2 + M / 2 - 2;
//                    System.out.println(two_x+" "+two_y);
//                    System.out.println(three_x+" "+three_y);
                    for (; two_x + M / 2 - 1 <= two_y; two_x++) {
                        temp_count++;
                    }
                    count += temp_count * 2 * 2;
                }
            }
            System.out.println(count);
        }
    }
}


//import java.util.*;
//public class test03{
//    public static void main(String[] argv){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int ans=0;
//            if((a-1)/2>=b-1)
//                ans=ans+(b*2);
//            else if(a-b>0)
//                ans+=((a-b+1)*2);
//            if((b==4||b==6||b==8||b==10||b==12||b==14||b==16||b==18||b==20)&&(a-1)/2>=b/2-1){
//                if(b==4)
//                    ans+=4;
//                else
//                    ans+=(b*2);
//            }
//            else if((b==4||b==6||b==8||b==10||b==12||b==14||b==16||b==18||b==20)&&a-(b/2)>0){
//                ans+=((a-(b/2)+1)*4);
//            }
//            if((b==9||b==12||b==15||b==18)&&(a-1)/2>=b/3-1){
//                if(b==9)
//                    ans+=9;
//                else
//                    ans+=(b*2);
//            }
//            else if((b==9||b==12||b==15||b==18)&&a-(b/3)>0)
//                ans+=((a-(b/3)+1)*6);
//            if((b==16||b==20)&(a-1)/2>=b/4-1){
//                if(b==16)
//                    ans+=16;
//                else
//                    ans+=(b*2);
//            }
//            else if((b==16||b==20)&&a-(b/4)>0){
//                ans+=((a-(b/4)+1)*8);
//            }
//            System.out.println(ans);
//
//        }
//    }
//}

//import java.util.*;
//public class test03{
//    public static void main(String[] argv){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int ans=0;
//            if((a-1)/2>=b-1)
//                ans=ans+(b*2);
//            else if(a-b>=0)
//                ans+=((a-b+1)*2);
//            if((b==4||b==6||b==8||b==10||b==12||b==14||b==16||b==18||b==20)&&(a-1)/2>=b/2-1){
//                if(b==4)
//                    ans+=4;
//                else
//                    ans+=(b*2);
//            }
//            else if((b==4||b==6||b==8||b==10||b==12||b==14||b==16||b==18||b==20)&&a-(b/2)>=0){
//                ans+=((a-(b/2)+1)*4);
//            }
//            if((b==9||b==12||b==15||b==18)&&(a-1)/2>=b/3-1){
//                if(b==9)
//                    ans+=9;
//                else
//                    ans+=(b*2);
//            }
//            else if((b==9||b==12||b==15||b==18)&&a-(b/3)>=0)
//                ans+=((a-(b/3)+1)*6);
//            if((b==16||b==20)&(a-1)/2>=b/4-1){
//                if(b==16)
//                    ans+=16;
//                else
//                    ans+=(b*2);
//            }
//            else if((b==16||b==20)&&a-(b/4)>=0){
//                ans+=((a-(b/4)+1)*8);
//            }
//            System.out.println(ans);
//        }
//    }
//}