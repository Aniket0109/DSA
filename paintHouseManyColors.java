import java.util.Scanner;

public class paintHouseManyColors {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                arr[i][j] = sc.nextInt();
        }

        long[][] dp = new long[n][3];

//============================== O(n^3) ======================================
//        for(int j=0; j<m; j++)
//            dp[0][j] = arr[0][j];
//
//        for(int i=1; i<n; i++){
//
//            for (int j = 0; j < m; j++) {
//
//                long min = Integer.MAX_VALUE;
//                for(int k=0; k<m; k++) {
//
//                    if (k != j) {
//                        min = Math.min(dp[i - 1][k], min);
//                    }
//                }
//
//                dp[i][j] = arr[i][j] + min;
//            }
//
//        }
//        long ans = Integer.MAX_VALUE;
//
//        for(int j=0; j<m; j++)
//            ans = Math.min(dp[n-1][j], ans);
//
//        System.out.println(ans);


        long least = Integer.MAX_VALUE, sleast = Integer.MAX_VALUE;
        for(int j=0; j<m; j++) {
            dp[0][j] = arr[0][j];

            if(arr[0][j]<=least){
                sleast = least;
                least = arr[0][j];
            } else if (arr[0][j]<=sleast) {
                sleast = arr[0][j];
            }
        }

        for(int i=1; i<n; i++){

            long nleast = Integer.MAX_VALUE, nsleast = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {

                if(dp[i-1][j]==least){

                    dp[i][j] = sleast + arr[i][j];

                } else {

                    dp[i][j] = least + arr[i][j];

                }

                if(dp[i][j]<=nleast){
                    nsleast = nleast;
                    nleast = dp[i][j];
                } else if (dp[i][j]<=nsleast) {
                    nsleast = dp[i][j];
                }
            }
            least = nleast;
            sleast = nsleast;
        }
        System.out.println(least);
    }
}
