import java.util.Scanner;

public class spanOfAnArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        a[0] = sc.nextInt();
        int max = a[0], min = a[0];

        for(int i=1; i<n; i++){

            a[i] = sc.nextInt();

            if(a[i]>max){

                max = a[i];

            }

            if(a[i]<min){

                min = a[i];

            }

        }

        System.out.println(max-min);

    }
}
