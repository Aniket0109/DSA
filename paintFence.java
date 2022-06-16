import java.util.Scanner;

public class paintFence {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();

        long same = k;
        long diff = (long) k *(k-1);
        long total = same+diff;

        for(int i=3; i<=n; i++){

            same = diff;
            diff = total*(k-1);
            total = same + diff;

        }

        System.out.println(total);
    }
}
