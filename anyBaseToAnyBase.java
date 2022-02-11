import java.util.Scanner;

public class anyBaseToAnyBase {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b1 = sc.nextInt(), b2 = sc.nextInt();

        int ans1 = 0;
        int p = 1;

        while(n>0){

            ans1+=(n%10)*p;
            p*=b1;
            n/=10;

        }

        int ans = 0;
        int p1 = 1;

        while(ans1>0){

            ans += (ans1%b2)*p1;
            p1*=10;
            ans1/=b2;

        }

        System.out.println(ans);

    }
}
