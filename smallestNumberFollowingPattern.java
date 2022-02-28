import java.util.ArrayList;
import java.util.Scanner;

public class smallestNumberFollowingPattern {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0);

        for(int i=0;i<s.length(); i++){

            char ch = s.charAt(i);
            if(ch=='i'){

                arr.add(i+1);

            }
        }
        arr.add(s.length()+1);

        for(int i=1; i<arr.size(); i++){

            for(int j=arr.get(i);j>arr.get(i-1); j--){

                System.out.print(j);
            }
        }
        System.out.println();
    }
}
