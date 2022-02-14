import java.util.Scanner;

public class differenceOfTwoArrays {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];

        for(int i=0;i<n1; i++){

            a[i] = sc.nextInt();

        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];

        for(int i=0;i<n2; i++){

            b[i] = sc.nextInt();

        }

//        int[] diff = new int[n2];

        int c = 0;

        int i = n1-1;
        int j = n2-1;
//        int k  = diff.length - 1;

        while(j>=0){

            if(i>=0){

                if(b[j]>=a[i]){

                    b[j] = b[j] - a[i]+c;
                    c = 0;

                } else {

                    b[j] = 10 + b[j] - a[i]+c;
                    c = -1;

                }
            }
            i--;
            j--;
        }

        int m = 1;
        if (c==-1){

            while(b[n2-n1-m] == 0){

                b[n2-n1-m] = 9;
                m++;

            }
            b[n2-n1-m] -= 1;

        }
        int count = 0;

        for (int k : b) {

            if (k == 0) {

                count++;

            } else {

                break;

            }
        }

        for (int x = count; x<b.length; x++){

            System.out.print(b[x]);

        }

    }
}
