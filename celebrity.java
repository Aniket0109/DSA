import java.util.Scanner;
import java.util.Stack;

public class celebrity {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        for(int i=0; i<n; i++){

            for (int j=0; j<n; j++){

                a[i][j] = sc.nextInt();

            }
        }

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){

            st.push(i);

        }

        while(st.size()>=2){

            int i = st.pop();
            int j = st.pop();

            if(a[i][j]==1){

                st.push(j);

            } else {

                st.push(i);

            }
        }

        int celebrity = st.peek();

        for(int i=0; i<n; i++){

            if(i!=celebrity) {
                if (a[celebrity][i] == 1 || a[i][celebrity] == 0) {

                    System.out.println("NONE");
                    return;

                }
            }
        }

        System.out.println(celebrity);
    }
}
