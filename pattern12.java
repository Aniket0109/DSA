import java.util.Scanner;

public class pattern12 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a =0, b=1;
        for (int i=0; i<n; i++){

            for(int j =0; j<=i; j++){

                System.out.print(a+"\t");
                int sum = a+b;
                a = b;
                b = sum;

            }
            System.out.println();
        }
    }
}
