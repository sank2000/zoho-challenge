import java.util.Stack;

public class Program4 {

  public static boolean isBinary(Character ch) {
    if (ch == '+' || ch == '-' || ch == '/' || ch == '*')
      return true;
    return false;
  }

  public static void main(String[] args) {
    Stack<Character> stack = new Stack<Character>();

    String input = "(a*b*c";
    // String input = "(a+b)(a-b)";
    // String input = "(ab)(ab+)";
    // String input = "((a+b)";
    boolean isValid = true;

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '(') {
        stack.add(input.charAt(i));
      } else if (isBinary(input.charAt(i))) {
        if (Character.isAlphabetic(stack.peek()) && Character.isAlphabetic(input.charAt(i + 1))) {
          stack.pop();
          if ((i + 2 < input.length() && !isBinary(input.charAt(i + 2))) || i + 2 >= input.length())
            i++;
        } else {
          isValid = false;
          break;
        }
      } else if (input.charAt(i) == ')') {
        if (stack.peek() == '(') {
          stack.pop();
        } else {
          isValid = false;
          break;
        }
      } else {
        if (stack.empty()) {
          stack.push(input.charAt(i));
        } else if (!Character.isAlphabetic(stack.peek())) {
          stack.push(input.charAt(i));
        } else {
          isValid = false;
          break;
        }
      }
    }

    if (!stack.isEmpty())
      isValid = false;

    if (isValid) {
      System.out.println("Valid");
    } else {
      System.out.println("Not Valid");
    }

  }
}
