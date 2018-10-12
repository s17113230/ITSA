import java.util.*;
public class ITSA_text01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
        	int [][] b = new int [3][3];
        	int count =0 ;
        	boolean win = false;
        	for(int i=0 ; i<3 ; i++){
        		for(int j=0 ; j<3 ; j++){
        			b[i][j] = sc.nextInt();
        		}
        	}

        	for(int i=0 ; i<3 ; i++){                 //橫的
        		for(int j=0 ; j<3 ; j++){
        			for(int k=0 ; k<3 ; k++){
        				if(b[i][j] == b[i][k]){
        					count++;
        				}
        			}
        			if(count == 3){
        				win = true;
        				break;
        			}
        			count=0;
        		}
        	}

        	for(int i=0 ; i<1 ; i++){                 //直的
        		for(int j=0 ; j<3 ; j++){
        			for(int k=0 ; k<3 ; k++){
        				if(b[i][j] == b[k][j]){
        					count++;
        				}
        			}
        			if(count == 3){
        				win = true;
        				break;
        			}
        			count=0;
        		}
        	}

			for(int i=0 ; i<=2 ; i++){                 //斜的
				if(i==2){
					break;
				}
				if(b[i][i] == b[i+1][i+1]){
					count++;
				}
				if(count == 2){
        			win = true;
        			break;
        		}
        	}
        	count=0;

			for(int i=0 ; i<=2 ; i++){                 //斜的
				if(i==2){
					break;
				}
				if(b[i][2-i] == b[i+1][2-i-1]){
					count++;
				}
				if(count == 2){
        			win = true;
        			break;
        		}
        	}
        	count=0;


        	if(win == false)
        		System.out.println("False");
        	else
        		System.out.println("True");

        	a--;
        }
    }
}
