import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        int f0 = 0;
        int f1 = 1;
        int sum;

        for (int i=0; i<n; i++){

            System.out.println(f0);
            sum = f0+f1;
            f0 = f1;
            f1 = sum;
        }
    }
}
