import java.util.Scanner;

public class pythagoreanTriplets {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int  h = Math.max(a,Math.max(b,c));

        if(h==c){

            if((Math.pow(c,2)) ==(Math.pow(a,2)+Math.pow(b,2))){

                System.out.println("true");

            } else {

                System.out.println("false");

            }
        } else if(h==b){

            if((Math.pow(b,2)) ==(Math.pow(a,2)+Math.pow(c,2))){

                System.out.println("true");

            } else {

                System.out.println("false");

            }

        } else {

            if((Math.pow(a,2)) ==(Math.pow(c,2)+Math.pow(b,2))){

                System.out.println("true");

            } else {

                System.out.println("false");

            }
        }
    }
}
