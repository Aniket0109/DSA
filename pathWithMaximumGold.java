import java.util.Scanner;

public class pathWithMaximumGold {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] gold = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                gold[i][j] = sc.nextInt();
        }

        int[][] maxGold = new int[n][m];

        for(int j=m-1; j>=0; j--){
            for(int i=n-1;i>=0;i--){
                if(j==m-1){
                    maxGold[i][j] = gold[i][j];
                } else if(i==0){
                    maxGold[i][j] = gold[i][j] + Math.max(maxGold[i+1][j+1],maxGold[i][j+1]);
                } else if(i==n-1){
                    maxGold[i][j] = gold[i][j] + Math.max(maxGold[i-1][j+1],maxGold[i][j+1]);
                } else {
                    maxGold[i][j] = gold[i][j] + Math.max(Math.max(maxGold[i+1][j+1],maxGold[i][j+1]),maxGold[i-1][j+1]);
                }
            }
        }
        int max = maxGold[0][0];
        for(int i=1; i<n;i++){
            if(max<maxGold[i][0]){
                max = maxGold[i][0];
            }
        }
        System.out.println(max);
    }
}
