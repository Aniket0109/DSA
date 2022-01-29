import java.util.Scanner;

public class inverseNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int[] a = new int[count];

        int digit,loopCount=1,no=0;
        while(n>0){

            digit = n%10;
            n /=10;

//            a[digit-1] = loopCount;

            no+=loopCount*((int)Math.pow(10,digit-1));
            loopCount++;

        }

        System.out.println(no);

//        for(int i = a.length-1; i>=0; i--){
//
//            System.out.print(a[i]);
//
//        }
    }
}
