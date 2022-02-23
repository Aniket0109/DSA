import java.util.Scanner;
import java.util.Stack;

public class largestAreaHistogram {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i=0; i<n; i++){

            a[i] = sc.nextInt();

        }
        int[] rightBoundary = new int[n];

        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        rightBoundary[n-1] = n;

        for (int i = n-2; i>=0; i--){

            while (st.size()>0&& a[i]<=a[st.peek()]){

                st.pop();

            }

            if(st.size()==0){

                rightBoundary[i] = n;

            } else {

                rightBoundary[i] = st.peek();

            }

            st.push(i);

        }

        st.clear();

        int[] leftBoundary = new int[n];
        st.push(0);
        leftBoundary[0] = -1;

        for (int i = 1; i<n; i++){

            while (st.size()>0&& a[i]<=a[st.peek()]){

                st.pop();

            }

            if(st.size()==0){

                leftBoundary[i] = -1;

            } else {

                leftBoundary[i] = st.peek();

            }

            st.push(i);

        }

        int maxArea = 0;

        for(int i=0; i<n; i++){

            int width = (rightBoundary[i]-leftBoundary[i]-1);
            int area = a[i]*width;

            if(area>maxArea){

                maxArea = area;

            }
        }

        System.out.println(maxArea);

    }
}
