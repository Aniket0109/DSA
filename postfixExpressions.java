import java.util.Scanner;
import java.util.Stack;

public class postfixExpressions {

    public static int operation(int v1, int v2, char operator){

        if(operator=='+'){

            return v1+v2;

        } else if (operator=='-'){

            return v1-v2;

        } else if(operator=='*'){

            return v1*v2;

        } else {

            return v1/v2;

        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Integer> value = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();

        for (int i=0; i<s.length(); i++){

            char ch = s.charAt(i);
            if(Character.isDigit(ch)){

                value.push(ch-'0');
                infix.push(String.valueOf(ch));
                prefix.push(String.valueOf(ch));

            } else {

                int val2 = value.pop();
                int val1 = value.pop();
                int operatedValue = operation(val1, val2, ch);
                value.push(operatedValue);

                String val2Infix = infix.pop();
                String val1Infix = infix.pop();
                String valueInfix = "("+val1Infix+ ch + val2Infix+")";
                infix.push(valueInfix);

                String val2Prefix = prefix.pop();
                String val1Prefix = prefix.pop();
                String valuePrefix = String.valueOf(ch).concat(val1Prefix).concat(val2Prefix);
                prefix.push(valuePrefix);

            }
        }

        System.out.println(infix.peek());
        System.out.println(value.peek());
        System.out.println("Prefix: "+prefix.peek());
    }
}
