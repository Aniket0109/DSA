import java.util.Scanner;

public class pattern6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int st = n/2+1,sp=1;
        for (int i=1; i<=n; i++){

            for(int j=0; j<st; j++){

                System.out.print("*\t");

            }

            for(int j=0; j<sp; j++){

                System.out.print("\t");

            }

            for(int j=0; j<st; j++){

                System.out.print("*\t");

            }
            if(i<n/2+1){

                st--;
                sp+=2;

            } else {

                st++;
                sp-=2;

            }
            System.out.println();
        }
    }
}
