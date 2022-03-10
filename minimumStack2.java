import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class minimumStack2 {

    public static class minimumStack{

        Stack<Integer> data;
        int min;

        public minimumStack(){

            data = new Stack<>();

        }

        int size(){

            return data.size();

        }

        int pop(){

            if(data.size()==0){

                System.out.println("Stack Underflow");
                return -1;

            } else {

                if(data.peek()>=min){

                    return data.pop();

                } else {

                    int ov = min;
                    min = 2*min - data.peek();
                    return ov;

                }
            }

        }

        int top(){

            if(data.size()==0){

                System.out.println("Stack Underflow");
                return -1;

            } else {

                if(data.peek()>=min){

                    return data.peek();

                } else {

                    return min;

                }
            }
        }

        void push(int val){

            if(data.size()==0){

                data.push(val);
                min = val;

            } else if(val>=min){

                data.push(val);

            } else {

                data.push(val+val-min);

            }

        }

        int minimum(){

            if(size()==0){

                System.out.println("Stack Underflow");
                return -1;

            } else {

                return min;
            }
        }

    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        minimumStack st = new minimumStack();

        String str = br.readLine();
        while(!str.equals("quit")){

            if(str.startsWith("push")){

                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);

            } else if(str.startsWith("pop")){

                int val = st.pop();
                if(val!=-1){

                    System.out.println(val);

                }

            } else if(str.startsWith("top")){

                int val = st.top();
                if(val!=-1){

                    System.out.println(val);

                }
            } else if(str.startsWith("size")){

                System.out.println(st.size());

            } else if(str.startsWith("minimum")){

                System.out.println(st.minimum());

            }
            str = br.readLine();
        }
    }
}
