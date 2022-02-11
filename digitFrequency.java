import java.util.Scanner;

public class digitFrequency {

    public static int frequency(int x, int d){

        int f = 0;

        while(x>0){

            if(x%10==d){

                f++;

            }

            x/=10;

        }

        return f;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), digit = sc.nextInt();

        System.out.println(frequency(n,digit));

    }
}
