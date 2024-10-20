import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class ValidParenthesis{
    public static boolean validParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> parenthesisPairs = new HashMap<>();
        parenthesisPairs.put(')', '(');
        parenthesisPairs.put(']', '[');
        parenthesisPairs.put('}', '{');

        for (int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            if (parenthesisPairs.containsKey(currentChar)){
                if (stack.isEmpty() || !Objects.equals(stack.pop(), parenthesisPairs.get(currentChar))){
                    return false;
                } 
            } else if (parenthesisPairs.containsValue(currentChar)){
                stack.push(currentChar);
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "{pasan}]";
        if (validParenthesis(str)){
            System.out.println(str + " is a valid parenthesis");
        } else {
            System.out.println(str + " is not a valid parenthesis");
        }
    }
}