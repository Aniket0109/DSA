import java.util.Scanner;

public class printStairPathDP {

    public static int countStairPaths(int n, int[] qb){

        if(n==0){
            return 1;
        } else if(n<0){
            return 0;
        }

        if(qb[n]!=0){
            return qb[n];
        }

        int n1 = countStairPaths(n-1, qb);
        int n2 = countStairPaths(n-2, qb);
        int n3 = countStairPaths(n-3, qb);
        qb[n] = n1+n2+n3;
        return n1+n2+n3;

    }

    public static int loopCount(int n){

        int[] ans = new int[n+1];
        ans[0] = 1;
        for(int i=1; i<=n; i++){

            ans[i] = ans[i-1]+(i<2?0:ans[i-2])+(i<3?0:ans[i-3]);

        }

        return ans[n];
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countStairPaths(n, new int[n+1]));
        System.out.println(loopCount(n));
    }

}
