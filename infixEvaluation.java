import java.util.Scanner;
import java.util.Stack;

public class infixEvaluation {

    public static int precedence(char operator){

        if(operator=='+'){

            return 1;

        } else if (operator=='-'){

            return 1;

        } else if(operator=='*'){

            return 2;

        } else {

            return 2;

        }
    }

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
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

            if(ch=='('){

                operators.push(ch);

            } else if(Character.isDigit(ch)){

                operands.push(ch-'0');

            } else if(ch==')'){

                while (operators.peek() !='('){

                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int operatorValue = operation(v1, v2, operator);
                    operands.push((operatorValue));
                }
                operators.pop();
            } else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){

                while (operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())){

                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int operatorValue = operation(v1, v2, operator);
                    operands.push((operatorValue));
                }

                operators.push(ch);
            }
        }

        while (operators.size() !=0){

            char operator = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();

            int operatorValue = operation(v1, v2, operator);
            operands.push((operatorValue));
        }

        System.out.println(operands.peek());
    }
}
