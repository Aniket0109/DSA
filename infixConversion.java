import java.util.Scanner;
import java.util.Stack;

public class infixConversion {

    public static int precedence(char operator){

        if(operator =='+'){

            return 1;

        } else if(operator =='-'){

            return 1;

        } else if(operator =='*'){

            return 2;

        } else {

            return 2;

        }
    }

    public static void process(Stack<String> prefix, Stack<Character> operators, Stack<String> postfix){

        String val2 = prefix.pop();
        String operator = String.valueOf(operators.pop());
        String val1 = prefix.pop();
        String operatedValue = operator.concat(val1).concat(val2);
        prefix.push(operatedValue);

        String val2Post = postfix.pop();
        String val1Post = postfix.pop();
        String operatedValuePost = val1Post.concat(val2Post).concat(operator);
        postfix.push(operatedValuePost);

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

            if(ch=='('){

                operators.push(ch);

            } else if(Character.isDigit(ch)||Character.isAlphabetic(ch)){

                prefix.push(String.valueOf(ch));
                postfix.push(String.valueOf(ch));

            } else if(ch==')'){

                while(operators.peek()!='('){

                    process(prefix,operators,postfix);

                }

                operators.pop();

            } else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){

                while (operators.size()>0 && operators.peek()!='(' && precedence(ch)<=precedence(operators.peek())){

                    process(prefix,operators,postfix);

                }

                operators.push(ch);

            }
        }

        while (operators.size()!=0){

            process(prefix,operators,postfix);

        }

        System.out.println("Prefix: "+prefix.peek()+"\n"+"Postfix: "+postfix.peek());
    }
}
