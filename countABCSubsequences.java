import java.util.Scanner;

public class countABCSubsequences {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int a = 0, ab = 0, abc = 0;

        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);
            if (c == 'a') {

                a = 2*a + 1;

            } else if(c == 'b'){

                ab = 2*ab + a;

            } else if(c == 'c'){

                abc = 2*abc + ab;

            }
        }

        System.out.println(abc);

    }
}
