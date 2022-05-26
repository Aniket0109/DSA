import java.util.PriorityQueue;
import java.util.Scanner;

public class sortANearlySortedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
            pq.add(a[i]);
        }

        while(pq.size()>0){

            System.out.println(pq.remove());
        }
    }
}
