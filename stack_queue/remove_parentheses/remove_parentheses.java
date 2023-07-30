
import java.util.*;

public class remove_parentheses {

    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == ')') {
                // '(' ������ ����
                while (stack.peek() != '(') {
                    if (!stack.isEmpty()) stack.pop();
                }
                // '(' ����
                if (!stack.isEmpty()) stack.pop();
            }
            else stack.push(x);
        }

        return stack.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }

    public static void main(String args[]){
        remove_parentheses T = new remove_parentheses();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(T.solution(s));
        sc.close();
    }

}
// stream()
// �÷���(Collection)�� �迭(Array) ���� ������ �ҽ��� �ٷ�µ� ������ API�̸� ��Ʈ���� ������ ���Ҹ� ���������� ó���ϸ�, ���� ó���� �����ϴ�.

// collect()
// ��Ʈ���� �� ���Ҹ� �ϳ��� ��� �����̳ʿ� �����ϴ� ���� �����̴�.
// �� �� ��� �����̳ʴ� Supplier, Accumulator, Combiner �� ���� �������̽��� ������ ��ü�� ���ǵ˴ϴ�.