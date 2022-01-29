import java.util.Scanner;

public class pattern4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=n; i>0; i--){

            int space=n-i;
            while(space-->0){

                System.out.print("\t");

            }

            for (int j=1; j<=i;j++){

                System.out.print("*\t");

            }

            System.out.println();

        }
    }
}
