import java.util.HashMap;
import java.util.Scanner;

public class longestConsecutiveSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];

        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i = 0; i < n1; i++) {

            a[i] = sc.nextInt();
            hm.put(a[i], true);

        }

        for(int val : a){

            if(hm.containsKey(val-1)){
                hm.put(val, false);
            }

        }

        int msp = 0;
        int ml = 0;

        for(int val : a){

            if(hm.get(val)){
                int tl = 1;
                int tsp = val;

                while(hm.containsKey(tsp+tl)){
                    tl++;
                }

                if(tl>ml){

                    msp = tsp;
                    ml = tl;

                }

            }
        }

        for(int i=0; i<ml; i++){

            System.out.println(msp+i);

        }
    }
}
