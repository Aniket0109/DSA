import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class highestFrequencyCharacter {

    public static void main(String[] args){

        Scanner sc = new Scanner((System.in));
        String s = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length();i++){

            if(hm.get(s.charAt(i))!=null) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }

        Set<Character> keys = hm.keySet();
        int max = Integer.MIN_VALUE;
        char ans = s.charAt(0);
        for(char key : keys){

            int val = hm.get(key);
            if(max<val){
                ans = key;
            }
            max = Math.max(val, max);

        }

        System.out.println(ans);

    }

}
