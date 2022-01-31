import java.util.Scanner;

public class pattern15 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n/2, no = 1;

        for(int i=1; i<=n; i++){

            for( int j=1; j<=sp; j++){

                System.out.print("\t");

            }

            for(int j=1; j<=no; j++){

                if(i>n/2+1){
                    
                    System.out.print((n+1-i)+(j-1)+"\t");

                } else {

                    System.out.print(i+(j-1)+"\t");

                }

            }

            if(i<=n/2){

                sp--;
                no+=2;

            } else {

                sp++;
                no-=2;

            }

            System.out.println();

        }
    }
}
