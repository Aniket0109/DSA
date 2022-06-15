import java.util.Scanner;

public class arrangeBuildings {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<2){

            System.out.println("Place Building anywhere");

        } else {

            int oldCountBuilding = 1;
            int oldCountSpaces = 1;

            for(int i=2; i<=n; i++){

                int newCountBuilding = oldCountSpaces;
                int newCountSpaces = oldCountSpaces+oldCountBuilding;

                oldCountBuilding = newCountBuilding;
                oldCountSpaces = newCountSpaces;

            }
            int ans = oldCountBuilding+oldCountSpaces;
            System.out.println(ans*ans);
        }
    }
}
