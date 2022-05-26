import java.util.PriorityQueue;
import java.util.Scanner;

public class kthLargestElementsInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
            pq.add(a[i]);
        }
        int k = sc.nextInt();

        for(int i=0; i<n; i++){

            if(i<n-k){
                pq.remove();
            } else {
                System.out.println(pq.remove());
            }
        }
    }
}
