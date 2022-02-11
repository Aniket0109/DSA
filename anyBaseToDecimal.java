import java.util.Scanner;

public class anyBaseToDecimal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),b = sc.nextInt();

        int ans = 0;
        int p =1;
        while(n>0){

            ans+=(n%10)*p;
            p*=b;

            n/=10;
        }

        System.out.println(ans);

    }
}