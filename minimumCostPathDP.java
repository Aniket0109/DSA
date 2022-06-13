import java.util.Scanner;

public class minimumCostPathDP {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                a[i][j] = sc.nextInt();
        }

        int[][] dp = new int[n][n];

        for(int i=n-1; i>=0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if(i==n-1&&j==n-1){

                    dp[i][j] = a[i][j];

                } else if(i==n-1){

                    dp[i][j] = dp[i][j+1]+a[i][j];

                } else if(j==n-1){

                    dp[i][j] = dp[i+1][j]+a[i][j];

                } else {

                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + a[i][j];

                }
            }
        }

        System.out.println(dp[0][0]);
    }
}
