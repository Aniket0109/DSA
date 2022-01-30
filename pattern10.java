import java.util.Scanner;

public class pattern10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp1 = n/2, sp2 = 0;

        for(int i =1; i<=n; i++){

            for (int j = 1; j<=sp1; j++){

                System.out.print("\t");

            }
            System.out.print("*");

            int count = 0;
            for (int j = 1; j<=sp2; j++){

                count++;
                System.out.print("\t");

            }

            if(count>0) {
                System.out.print("*");
            }

            if(i<=n/2){

                sp1--;
                sp2+=2;

            } else {

                sp1++;
                sp2-=2;

            }

            System.out.println();
        }
    }
}
