import java.util.Scanner;

public class countBinaryStrings {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oldCountZeroes = 1;
        int oldCountOnes = 1;

        if(n<2){

            System.out.println("Digits too small");

        } else {

            for(int i=2; i<=n; i++) {
                int newCountZeroes = oldCountOnes;
                int newCountOnes = oldCountOnes + oldCountZeroes;

                oldCountZeroes = newCountZeroes;
                oldCountOnes = newCountOnes;
            }
            System.out.println(oldCountZeroes+oldCountOnes);

        }
    }
}
