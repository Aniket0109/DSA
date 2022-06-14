import java.util.*;
public class coinChangePermutation {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){

            arr[i] = sc.nextInt();

        }

        int amt = sc.nextInt();

        int[] dp = new int[amt+1];
        dp[0] = 1;

        for(int j=1; j<dp.length; j++){
            for(int coin : arr){
                if(coin<=j) {
                    dp[j] += dp[j - coin];
                }
            }
        }

        System.out.println(dp[amt]);
    }
}
