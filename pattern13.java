import java.util.Scanner;

public class pattern13 {

    public static int factorial(int n){

        if(n==0){

            return 1;

        } else {

            int fact = 1;
            for (int i = 1; i <= n; i++) {

                fact *= i;

            }

            return fact;

        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++){

            for (int j=0; j<=i; j++){

                int ans = factorial(i)/(factorial(j)*factorial(i-j));
                System.out.print(ans+"\t");

            }
            System.out.println();
        }
    }
}
