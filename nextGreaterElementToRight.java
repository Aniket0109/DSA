import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElementToRight {

    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Stack<Integer> st = new Stack<>();

        for( int i=0; i<n; i++){

            a[i] = sc.nextInt();

        }

        int[] nge = new int[n];

        st.push(a[n-1]);
        nge[n-1] = -1;

        for(int i= n-2; i>=0; i--){

            while(st.size()>0 && a[i]>=st.peek()){

                st.pop();

            }

            if (st.size()==0){

                nge[i] = -1;

            } else {

                nge[i] = st.peek();

            }

            st.push(a[i]);

        }

        for (int val : nge){

            System.out.println(val);

        }
    }
}
