import java.util.Scanner;

public class zeroOneKnapsack {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] priceToWeight = new int[2][n];

        for(int i=0; i<2; i++)
            for(int j=0; j<n; j++)
                priceToWeight[i][j] = sc.nextInt();

        int limit = sc.nextInt();

        int[][] dp = new int[n+1][limit+1];

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(j>=priceToWeight[1][i-1]) {
                    int remCap = j - priceToWeight[1][i-1];

                    dp[i][j] = Math.max(dp[i - 1][remCap] + priceToWeight[0][i - 1], dp[i - 1][j]);
                } else
                    dp[i][j] = dp[i-1][j];
            }
        }

        System.out.println(dp[n][limit]);
    }
}
