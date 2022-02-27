import java.util.Scanner;
import java.util.Stack;

public class prefixEvaluationAndConversion {

    public static int operation(int val1, int val2, char operation){

        if(operation=='+'){

            return val1+val2;

        } else if(operation=='-'){

            return val1-val2;

        } else if(operation=='*'){

            return val1*val2;

        } else {

            return val1/val2;

        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Integer> value = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for(int i=s.length()-1; i>=0; i--){

            char ch = s.charAt(i);
            if(Character.isDigit(ch)){

                value.push(ch-'0');
                infix.push(String.valueOf(ch));
                postfix.push(String.valueOf(ch));

            } else {

                int val1 = value.pop();
                int val2 = value.pop();
                int operatedValue = operation(val1, val2, ch);
                value.push(operatedValue);

                String val1Infix = infix.pop();
                String val2Infix = infix.pop();
                String valueInfix = "("+val1Infix+ch+val2Infix+")";
                infix.push(valueInfix);

                String val1Postfix = postfix.pop();
                String val2Postfix = postfix.pop();
                String valuePostfix = val1Postfix+val2Postfix+ch;
                postfix.push(valuePostfix);

            }
        }

        System.out.println(infix.peek());
        System.out.println(value.peek());
        System.out.println(postfix.peek());
    }
}
