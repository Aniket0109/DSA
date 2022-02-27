import java.util.*;

public class mergeOverlappingIntervals {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] startTime = new int[n];
        int[] endTime = new int[n];

        for(int i=0; i<n; i++){

            startTime[i] = sc.nextInt();
            endTime[i] = sc.nextInt();

        }
        Arrays.sort(startTime);
        Arrays.sort(endTime);
        Stack<Integer> st = new Stack<>();
        st.push(startTime[0]);
        st.push(endTime[0]);
        for (int i=1; i<n; i++){

            if (st.peek() <= startTime[i]) {

                st.push(startTime[i]);
                st.push(endTime[i]);

            }
            st.pop();
            st.push(endTime[i]);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        while(st.size()>0){

            arr.add(st.pop());

        }
        Collections.sort(arr);

        for(int i=0; i<arr.size(); i+=2){

            System.out.println(arr.get(i)+" "+arr.get(i+1));

        }
    }
}
