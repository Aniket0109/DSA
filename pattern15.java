import java.util.Scanner;

public class pattern15 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n/2, no = 1;
        int val = 1;

        for(int i=1; i<=n; i++){

            for( int j=1; j<=sp; j++){

                System.out.print("\t");

            }

            int currentVal = val;
            for(int j=1; j<=no; j++){

                System.out.print(currentVal +"\t");

                if(j<=no/2) {
                    currentVal++;
                } else {
                    currentVal--;
                }
            }

            if(i<=n/2){

                sp--;
                no+=2;
                val++;

            } else {

                sp++;
                no-=2;
                val--;

            }

            System.out.println();

        }
    }
}
