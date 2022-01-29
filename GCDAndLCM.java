import java.util.Scanner;

public class GCDAndLCM {

    public static void main(String[] args){

        Scanner sc = new Scanner((System.in));
        int n1 = sc.nextInt(),n2 = sc.nextInt();
        int On1 = n1, On2 = n2;

        while (n1%n2 != 0){

            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;

        }

        int gcd = n2;
        int lcm = (On1*On2)/gcd;

        System.out.println(gcd + "\n" +lcm);
    }
}