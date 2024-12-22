package list;
import java.util.Stack;
public class ValidParenethese {
	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("({[]})"));
		System.out.println(isValid("({[]})"));
		System.out.println(isValid("{[(]})"));
		System.out.println(isValid("({])"));
	}
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char [] c1 = s.toCharArray();
		System.out.println(c1);
		for(char c : c1) {
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else {
				if(stack.empty()) {
					return false;
				}
				char top = stack.pop();
				System.out.println(top);
				if(c==')' && top!='(' || c=='}' && top!='{' || c==']' && top!='[') {
					return false;
				}
			}
		}
		return stack.empty();
	}

}
