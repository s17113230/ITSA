import java.util.*;
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int [] address = new int [10000];
        	int [] content = new int [10000];
        	String a = sc.next();
        	String b = sc.next();
        	int add=0;
        	int x=0,z=0;
        	int ans=0;
        	int ansi=0;
        	String str = "";
        	for(int i=0 ; i<address.length ; i++){
        		address[i] = 0;
        		content[i] = 0;
        	}

        	for(int i=0 ; i<a.length() ; i++){
        		for(int j=0 ; j<b.length() ; j++){
        			if(i<a.length()&&j<a.length()){
        				if(a.charAt(i)==b.charAt(j)){
							x=i;
							z=j;
							while(a.charAt(x)==b.charAt(z)){
								x++;
								z++;
								if(x==a.length()){
									break;
								}
								if(z==b.length()){
									break;
								}
							}
							x--;
							z--;
							address[add] = x-i;
							content[add] = i;
							add++;
							x=0;
							z=0;
						}
        			}
        		}
        	}
        	for(int i=0 ; i<address.length ; i++){
        		if(address[i]>ans){
        			ans = address[i];
        			ansi = i;
        		}
        	}
        	str = a.substring(content[ansi],content[ansi]+address[ansi]+1);
        	System.out.println(str.length()>=2?str:"No common sequence!");
        }
    }
}
i = 0
j = 1;

x = 2
z = 3;
