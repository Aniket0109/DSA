import java.util.Scanner;

public class digitsOfNo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n;
        int count = 0;

        while(n>0){

            count++;
            n/=10;

        }

        int digit;
        while(count-1>=0){

            digit = n1/(int)Math.pow(10,count-1);
            n1 = n1 - digit*((int)Math.pow(10,count-1));
            System.out.println(digit);
            count--;
        }

    }
}
