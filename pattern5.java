import java.util.Scanner;

public class pattern5 {

    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<=(n/2+1); i++){

            int d = (n/2-i);
            while(d>=0){

                System.out.print("\t");
                d--;

            }

            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print("*\t");

            }

            System.out.println();

        }

        for (int i = 1; i<=(n/2); i++){

            int d = i;
            while(d>0){

                System.out.print("\t");
                d--;

            }

            for (int j = n-(2 * i);j>0; j--) {

                System.out.print("*\t");

            }

            System.out.println();

        }
    }
}
