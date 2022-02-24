import java.util.Scanner;
import java.util.Stack;

public class slidingWindowMaximum {

    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){

            a[i] = sc.nextInt();

        }

        int k = sc.nextInt();

        int[] greater = new int[n];
        Stack<Integer> st = new Stack<>();
        greater[n-1] = n;
        st.push(n-1);

        for(int i=n-1; i>=0; i--){

            while(st.size()>0&&a[i]>=a[st.peek()]){

                st.pop();

            }

            if(st.size()==0){

                greater[i] = n;

            } else {

                greater[i] = st.peek();

            }

            st.push(i);

        }

        int j=0;

        for(int i=0; i< greater.length-k;i++){

            if(j<i){

                j=i;

            }

            while (greater[j]<(i+k)){

                j = greater[j];

            }

            System.out.println(a[j]);

        }

    }
}