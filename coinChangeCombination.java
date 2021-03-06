import java.util.*;
public class coinChangeCombination {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){

            arr[i] = sc.nextInt();

        }

        int target = sc.nextInt();

        int[] dp = new int[target+1];
        dp[0] = 1;

        for(int coin : arr){
            for(int amt = coin; amt <dp.length; amt++){
                dp[amt] += dp[amt - coin];
            }
        }
        System.out.println(dp[target]);
    }
}
