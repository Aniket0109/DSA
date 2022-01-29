import java.util.Scanner;

public class primeInBetween {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), h = sc.nextInt();

        for (int i=l; i<=h;i++){

            int count =0;
            for (int j=2; j*j<=i;j++){

                if(i%j==0){
                    count++;
                    break;
                }
            }

            if(count==0){

                System.out.println(i);

            }
        }
    }
}
