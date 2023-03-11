package test;

public class Main {
    public static void main(String[] args) {

        /**
         * Given a balanced expression that contains opening and closing parenthesis.
         * Our equation is balanced when there is an odd number of closing brackets against one opening bracket.
         * You can use Stack class from Java using:
         * import java.util.Stack;
         */
        System.out.println(isBalanced("(a+y)+z")); // true
        System.out.println(isBalanced("{{((x+b)}")); // false
        System.out.println(isBalanced("({x)))}}}")); // wrong
        System.out.println(isBalanced("({x}}})))")); // true
        System.out.println(isBalanced("[[{{((y-w)}")); // false
    }

    public static boolean isBalanced(String expression){
        int length = expression.length();
        char nextChar = ' ';
        ArrayStack<Character> stack = new ArrayStack<Character>();
        for (int i = 0; i < length; i++){
            nextChar = expression.charAt(i);
            if(nextChar == '(' || nextChar == '{' || nextChar == '['){
                stack.push(nextChar);
            } else if (nextChar == ')' || nextChar == '}' || nextChar == ']'){
                if(stack.isEmpty()){
                    return false;
                }

                int closingBracketsCounter = 1;
                while(length > i + 1 && expression.charAt(i + 1) == nextChar){
                    closingBracketsCounter++;
                    i++;
                }

                if(closingBracketsCounter > 1 && closingBracketsCounter % 2 == 0){
                    return false;
                }

                if(!isPair(stack.pop(), nextChar)){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static boolean isPair(char ch1, char ch2){
        if(ch1 == '{'){
            return ch2 == '}';
        }else if(ch1 == '('){
            return ch2 == ')';
        }else if(ch1 == '['){
            return ch2 == ']';
        }
        return false;
    }

}