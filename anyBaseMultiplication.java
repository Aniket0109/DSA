import java.util.Scanner;

public class anyBaseMultiplication {

    public static int getAddition(int b, int n1, int n2){

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

        return ans;
    }

    public static int productWithSingleDigit(int b, int n1, int d2){

        int rv = 0, c = 0, p = 1;

        while(n1>0||c>0){

            int d1 = n1%10;
            n1/=10;

            int d = d1*d2+c;

            c = d/b;
            d = d%b;

            rv += d*p;
            p *=10;

        }

        return rv;
    }

    public static int product(int b, int n1, int n2){

        int rv = 0;
        int p =1;
        while(n2>0){

            int d2 = n2%10;
            n2 /= 10;

            int singleProduct = productWithSingleDigit(b,n1,d2);

            rv += getAddition(b,rv,singleProduct*p);

            p*=10;

        }

        return rv;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(), n1 = sc.nextInt(), n2 = sc.nextInt();

        System.out.println(product(b, n1, n2));
    }
}
