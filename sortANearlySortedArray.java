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
//            pq.add(a[i]);
        }
        int k = sc.nextInt();

        for(int i=0; i<=k; i++){

            pq.add(a[i]);

        }

        for(int i = k+1; i< a.length; i++){

            System.out.println(pq.remove());
            pq.add(a[i]);

        }

        while(pq.size()>0){

            System.out.println(pq.remove());

        }
    }
}
