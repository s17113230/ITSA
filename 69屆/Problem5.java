import java.util.Scanner;


public class Problem5 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int i=0; i<testCase; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int allResult = (int) Math.pow(2, M);
            String [] arrayAllResult = new String[allResult];
            String binaryString = "";
            String tmp = "%0" + M + "s";

            //宣告2^M大小的二進制陣列
            for(int j=0; j<allResult; j++){
                binaryString = Integer.toBinaryString(j);
                String tmpFormat = "%0" + M + "d";
                binaryString = String.format(tmpFormat,  Long.parseLong(binaryString));
                arrayAllResult[j] = binaryString;
            }

            int count = 0; //符合Lock幾次
            for(int NTimes=0; NTimes<N; NTimes++){
                int countLockLight = sc.nextInt(); //Lock裡面有幾個燈
                int tmpLockLight; //接Lock裡的燈
                int arrayLockLight[] = new int[M];

                //初始化arrayLockLight為-1的陣列
                for(int init=0; init<M; init++){
                    arrayLockLight[init] = -1;
                }
                //放入arrayLockLight陣列
                for(int k=0; k<countLockLight; k++){
                    tmpLockLight = sc.nextInt(); //接到後轉int
                    //正為1負為0
                    if(tmpLockLight < 0)
                        arrayLockLight[(tmpLockLight*-1)-1] = 0;
                    else
                        arrayLockLight[tmpLockLight-1] = 1;

                }

                //建立以Lock燈的開關的正規表示法
                String regularFormat = "";
                for(int l=0; l<arrayLockLight.length; l++){
                    if(arrayLockLight[l]==-1)
                        regularFormat += "\\d";
                    else if(arrayLockLight[l]==0)
                        regularFormat += "[0]";
                    else
                        regularFormat += "[1]";
                }


                //判斷是否符合正規表示法
                for(int m=0; m<allResult; m++){
                    if(arrayAllResult[m].matches(regularFormat)) {
                        count++;
                        arrayAllResult[m] = "#"; //判斷過符合正規表示法的替換成#，以免重複計算
                    }
                }
            }
            System.out.println(allResult - count);
        }
    }
}
