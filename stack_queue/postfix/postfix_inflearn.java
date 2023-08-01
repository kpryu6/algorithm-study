package stack_queue.postfix;
import java.util.*;

public class postfix_inflearn{

    public int solution(String s){

        Stack<Integer> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            // '0' �� 48��
            // '5'�� �ְ������ 5�� �� // 53 - 48
            if(Character.isDigit(x)) stack.push(x-48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();

                if (x == '+') stack.push(lt+rt);
                else if (x == '-') stack.push(lt-rt);
                else if (x == '*') stack.push(lt*rt);
                else if (x == '/') stack.push(lt/rt);
            }
        }
        return stack.get(0);
    }

    public static void main(String args[]){

        postfix_inflearn T = new postfix_inflearn();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
        sc.close();
    }
}

