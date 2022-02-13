import java.util.Scanner;

public class elementInArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i =0; i<n; i++){

            a[i] = sc.nextInt();

        }

        int no = sc.nextInt();
        int index = -1;
        for(int i=0;i<n; i++){

            if(a[i]==no){

                index = i;
                break;

            }

        }

        System.out.println(index);
    }
}