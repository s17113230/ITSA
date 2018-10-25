import java.util.*;

public class itsa_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int [] x = new int[4];
        	for(int i=0 ; i<4 ; i++){
        		x[i] = sc.nextInt();
        	}

        	int sum=0,ans=0,count=0,new_sum=0;

        	if(x[0]==x[1]&&x[1]==x[2]&&x[2]==x[3]){
        		System.out.println("WIN");
        	}else if((x[0]!=x[1]&&x[0]!=x[2]&&x[0]!=x[3]&&x[1]!=x[2]&&x[1]!=x[3]&&x[2]!=x[3])||(x[0]==x[1]&&x[1]==x[2])||(x[0]==x[1]&&x[1]==x[3])||(x[0]==x[2]&&x[2]==x[3])||(x[1]==x[2]&&x[2]==x[3])){
        		System.out.println("R");
        	}else{
				for(int i=0 ; i<4 ; i++){
					for(int j=3 ; j>i ; j--){
						if(x[i] == x[j]){
							if(count==0){
								sum += x[j]+x[j];
								if(j==3 && i==0){
									new_sum += x[1]+x[2];
								}else if(j==2 && i==0){
									new_sum += x[1]+x[3];
								}else if(j==1 && i==0){
									new_sum += x[2]+x[3];
								}else if(j==3 && i==1){
									new_sum += x[0]+x[2];
								}else if(j==2 && i==1){
									new_sum += x[0]+x[3];
								}else if(j==3 && i==2){
									new_sum += x[0]+x[1];
								}
								count++;
							}else{
								ans += x[j]+x[j];
								count++;
							}
						}
					}
				}
				if(count==1){
					System.out.println(new_sum);
				}
				if(count==2){
					System.out.println(sum>ans?sum:ans);
				}
        	}
        }
    }
}
