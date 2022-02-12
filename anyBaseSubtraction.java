import java.util.Scanner;

public class anyBaseSubtraction {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(), n1 = sc.nextInt(), n2 = sc.nextInt();
        int c = 0, ans = 0;
        int p =1;
        while(n2>0){

            int d1 = n1%10, d2 = n2%10;
            if(d1<d2){

                ans+=(d1-d2+b)*p;
                n1=n1/10-1;

            } else {

                ans+=(d1-d2)*p;
                n1/=10;

            }

            c++;
            p*=10;
            n2=n2/10;

        }

        ans += (int) Math.pow(10,c)*(n1);

        System.out.println(ans);

    }
}
