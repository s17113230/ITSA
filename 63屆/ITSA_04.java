import java.util.*;

public class ITSA_04 {

    public static int NumberOfSticks;
    public static int[] Stick;
    public static int Sum, Target;
    public static boolean[] Visited;
    public static boolean OK;

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        NumberOfSticks = Input.nextInt();
        Sum = Target = 0;
        Stick = new int[NumberOfSticks + 1];
        Visited = new boolean[NumberOfSticks + 1];
        for(int i = 0; i < NumberOfSticks; i++) {
            Stick[i] = Input.nextInt();
            Sum += Stick[i];
        }
        Target = Sum / 4;
        if(Sum % 4 != 0) {
            System.out.println("no");
            continue;
        }
        OK = false;
        BackTrack(0, 0, 0);
        System.out.println(OK ? "yes" : "no");

    }
    public static void BackTrack(int Current, int Start, int Sum) {
        if(OK == true) return;
        if(Current == 3) {
            OK = true;
            return;
        }
        if(Sum > Target) return;
        if(Sum == Target) BackTrack(Current + 1, 0, 0);
        for(int i = Start; i < NumberOfSticks; i++) {
            if(!Visited[i]) {  //¹w³]false
                Visited[i] = true;
                BackTrack(Current, i, Sum + Stick[i]);
                Visited[i] = false;
            }
        }
    }

}