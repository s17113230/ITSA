import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class test04
{
    static int temp = 0;
    static ArrayList<String> str ;
    // dp[i][j] is going to store true if sum j is
    // possible with array elements from 0 to i.
    static boolean[][] dp;

    static void display(ArrayList<Integer> v)
    {
        str.add(String.valueOf(v));
        System.out.println("str: "+str);
        System.out.println("v: "+v);
    }

    // A recursive function to print all subsets with the
    // help of dp[][]. Vector p[] stores current subset.
    static void printSubsetsRec(int arr[], int i, int sum,
                                ArrayList<Integer> p)
    {
        // If we reached end and sum is non-zero. We print
        // p[] only if arr[0] is equal to sun OR dp[0][sum]
        // is true.
        if (i == 0 && sum != 0 && dp[0][sum])
        {
            p.add(arr[i]);
            display(p);
            p.clear();
            return;
        }

        // If sum becomes 0
        if (i == 0 && sum == 0)
        {
            display(p);
            p.clear();
            return;
        }

        // If given sum can be achieved after ignoring
        // current element.
        if (dp[i-1][sum])
        {
            // Create a new vector to store path
            ArrayList<Integer> b = new ArrayList<>();
            b.addAll(p);
            printSubsetsRec(arr, i-1, sum, b);
        }

        // If given sum can be achieved after considering
        // current element.
        if (sum >= arr[i] && dp[i-1][sum-arr[i]])
        {
            p.add(arr[i]);
            printSubsetsRec(arr, i-1, sum-arr[i], p);
        }
    }

    // Prints all subsets of arr[0..n-1] with sum 0.
    static void printAllSubsets(int arr[], int n, int sum)
    {
        if (n == 0 || sum < 0)
            return;

        // Sum 0 can always be achieved with 0 elements
        dp = new boolean[n][sum + 1];
        for (int i=0; i<n; ++i)
        {
            dp[i][0] = true;
        }

        // Sum arr[0] can be achieved with single element
        if (arr[0] <= sum)
            dp[0][arr[0]] = true;

        // Fill rest of the entries in dp[][]
        for (int i = 1; i < n; ++i)
            for (int j = 0; j < sum + 1; ++j)
                dp[i][j] = (arr[i] <= j) ? (dp[i-1][j] ||
                        dp[i-1][j-arr[i]])
                        : dp[i - 1][j];
        if (dp[n-1][sum] == false)
        {
            return;
        }

        // Now recursively traverse dp[][] to find all
        // paths from dp[n-1][sum]
        ArrayList<Integer> p = new ArrayList<>();
        printSubsetsRec(arr, n-1, sum, p);
    }

    //Driver Program to test above functions
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int x,y;
        while(sc.hasNext()){
            n = sc.nextInt();
            while(n>0){
                str = new ArrayList<>();
                x=sc.nextInt();
                y=sc.nextInt();
                int arr[] = new int[x];
                int count[] = new int[y];
                for(int i=0 ; i<x ; i++){
                    arr[i] = sc.nextInt();
                }
                for(int i=0 ; i<y ; i++){
                    count[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                int n_num = arr.length;
                int sum = 2;
                for(int i=0 ; i<count.length ; i++){
                   printAllSubsets(arr, n_num, count[i]);
                }

                ArrayList<String> lst = new ArrayList<>();
                for (int i = 0; i < str.size(); i++)
                {
                    if (lst.contains(str.get(i)))
                        continue;
                    lst.add(str.get(i));
                }
                System.out.println(lst.size());
                n--;
            }
        }
    }
}



