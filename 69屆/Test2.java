import java.util.*;

public class Test2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int woman_num = sc.nextInt();
            while(woman_num>0){
                int woman_class_eng = sc.nextInt();
                String woman_class_str = sc.next();
                while(true){
                    int count=0;
                    int type = sc.nextInt();
                    if(type==1){
                        String class_temp_1 = sc.next();
                        String class_temp_2 = sc.next();
                        String str = "";
                        for(int i=0 ; i<woman_class_str.length() ; i++){
                            if(class_temp_1.charAt(0) == woman_class_str.charAt(i) || class_temp_2.charAt(0) == woman_class_str.charAt(i)){
                                str += (i+1)+" ";
                                count++;
                            }
                        }
                        if(count>0)
                        System.out.println(str.trim());
                    }else if(type==2){
                        int class_temp_1 = sc.nextInt();
                        int class_temp_2 = sc.nextInt();
                        String str = "";
                        for(int i=class_temp_1 ; i<=class_temp_2 ; i++){
                            str += i+" ";
                            count++;
                        }
                        if(count>0)
                        System.out.println(str.trim());
                    }else if(type==3){
                        int class_temp_1 = sc.nextInt();
                        int class_temp_2 = sc.nextInt();
                        String class_temp_3 = sc.next();
                        String str ="";
                        for(int i=0 ; i<woman_class_str.length() ; i++){
                            if(i>=class_temp_1 && i<=class_temp_2){
                                str += i+" ";
                                count++;
                            }else if(class_temp_3.charAt(0) == woman_class_str.charAt(i)){
                                str += (i+1)+" ";
                                count++;
                            }
                        }
                        if(count>0)
                        System.out.println(str.trim());
                    }else{break;}
                }
                woman_num--;
            }
        }
    }
}
