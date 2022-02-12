import java.util.Scanner;

public class anyBaseAddition {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(), n1 = sc.nextInt(), n2 = sc.nextInt();
        int ans = 0;
        int rem =0,count=0;
        int p=1;

        while((n1>0)&&(n2>0)){

            count++;
            ans += (((n1%10)+(n2%10)+rem)%b)*p;
            rem = ((n1%10)+(n2%10)+rem)/b;
            p*=10;
            n1/=10;
            n2/=10;

        }

        ans += (int) Math.pow(10,count)*(rem+n1+n2);
        System.out.println(ans);

    }
}
