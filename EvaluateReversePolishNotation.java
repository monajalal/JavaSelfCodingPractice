/**
 * Created by mona on 5/26/16.
 */
import java.util.Arrays;
import java.util.Stack;
import java.util.HashSet;
public class EvaluateReversePolishNotation {
    //["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
    public static int evaluateReversePolishNotation(String[] tokens) throws ArithmeticException {
        Stack<Integer> stk = new Stack<>();
        HashSet<String> ops = new HashSet<>(Arrays.asList("+","-","*","/"));
        for (int i=0; i<tokens.length; i++) {
            if (!ops.contains(tokens[i])) {
                stk.push(Integer.parseInt(tokens[i]));
            }
            else {
                int secondOperand = stk.pop();
                int firstOperand = stk.pop();
                switch (tokens[i]) {
                    case "+":
                        stk.push(firstOperand+secondOperand);
                        break;
                    case "-":
                        stk.push(firstOperand-secondOperand);
                        break;
                    case "*":
                        stk.push(firstOperand*secondOperand);
                        break;
                    case "/":
                        if (secondOperand == 0) {
                            throw new ArithmeticException("Second operand can't be zero in division");
                        }
                        stk.push(firstOperand/secondOperand);
                        break;
                    default:
                        break;
                }
            }
        }
        return stk.pop();
    }

    public static void main(String[] args) {
      String[] revPolishNotations ={"2","1", "+", "3", "*"};
        System.out.println(evaluateReversePolishNotation(revPolishNotations));
    }
}
