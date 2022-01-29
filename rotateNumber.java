import java.util.Scanner;

public class rotateNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k = sc.nextInt();

        int n1 = n;
        int count = 0;

        while(n>0){

            count++;
            n/=10;

        }

        if(k<0){

            while(k<0){

                k+=count;

            }

        } else {

            k %=count;

        }

        System.out.println((n1%((int)Math.pow(10,k)))+""+(n1/((int)Math.pow(10,k))));

    }
}
