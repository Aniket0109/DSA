import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {

    public static boolean checkCondition(Stack<Character> st, char c){

        if(st.size()==0){

            return false;

        } else if(st.peek()!=c){

            return false;

        } else {

            st.pop();
            return true;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);

            if((c=='(')||(c=='{')||(c=='[')){

                st.push(c);

            } else if(c==')') {

                boolean val = checkCondition(st,'(');
                if(!val){

                    System.out.println(false);
                    return;

                }

            }else if(c=='}'){

                boolean val = checkCondition(st,'{');
                if(!val){

                    System.out.println(false);
                    return;

                }

            } else if(c==']'){

                boolean val = checkCondition(st,'[');
                if(!val){

                    System.out.println(false);
                    return;

                }
            }
        }
        System.out.println(st.size() == 0);
    }
}
