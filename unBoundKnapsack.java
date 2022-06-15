import java.util.Scanner;

public class unBoundKnapsack {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] priceToWeight = new int[2][n];

        for(int i=0; i<2; i++)
            for(int j=0; j<n; j++)
                priceToWeight[i][j] = sc.nextInt();

        int limit = sc.nextInt();

        int[] dp = new int[limit+1];

        for(int i=1; i<dp.length; i++){
            int max = 0;
            for(int weight=0; weight<n; weight++){

                if(i>=priceToWeight[1][weight]){
                    int val = dp[i-priceToWeight[1][weight]] + priceToWeight[0][weight];

                    if(val>max){
                        max = val;
                    }
                }
                dp[i] = max;
            }
        }
        System.out.println(dp[limit]);
    }
}
