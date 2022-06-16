import java.util.Scanner;

public class maximumSumNonAdjacent {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inc = 0, exc = 0;

        int[] arr = new int[n];

        for(int i=0; i<n; i++){

            arr[i] = sc.nextInt();
            int var = exc;
            exc = Math.max(inc, exc);
            inc = arr[i]+var;

        }

        System.out.println(Math.max(inc, exc));

    }
}
