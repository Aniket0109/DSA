import java.util.Scanner;

public class barChart {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = a[0] = sc.nextInt();

        for(int i=1; i<n; i++){

            a[i] = sc.nextInt();

            if(a[i]>max){

                max = a[i];

            }

        }

        for(int i=1; i<=max;i++){

            for(int j=1; j<=n; j++){

                if(i<=max-a[j-1]){

                    System.out.print("\t");

                } else {

                    System.out.print("*\t");

                }

            }
            System.out.println();
        }
    }
}
