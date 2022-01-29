import java.util.Scanner;

public class benjaminBulbs {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(1);

        for (int i=2; i*i<=n;i++){

            System.out.println(i*i);

        }
    }
}