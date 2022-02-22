import java.util.Scanner;
import java.util.Stack;

public class stockSpan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i=0; i<n; i++){

            a[i] = sc.nextInt();

        }

        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        st.push(0);
        span[0] = 1;

        for (int i=1; i<n; i++){

            while( st.size()>0 && a[i] > a[st.peek()]){

                st.pop();

            }

            if(st.size()==0){

                span[i] = i+1;

            } else {

                span[i] = i - st.peek();

            }
            st.push(i);
        }


//----------------------------------OR-------------------------------------
/*        for(int i=0; i<n; i++){
//
//            for (int j=0; j<i; j++){
//
//                if(a[j]>a[i]){
//
//                    span[i] = i-j;
//
//                }
//            }
//
//        }
//
//        for(int i=0; i<n; i++){
//
//            if(span[i]==0){
//
//                span[i] = i+1;
//
//            }
//        } */

        for(int val : span){

            System.out.println(val);

        }
    }
}