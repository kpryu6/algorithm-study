package string.palindrome;

import java.util.Scanner;

class Main {
    public String solution(String str) {

        String answer = "NO";

        // ����� �Ȱ����� ȸ�� ���ڿ�
        String strReverse = new StringBuilder(str).reverse().toString();

        // ��ҹ��� ����
        if (str.equalsIgnoreCase(strReverse)) answer = "YES";

        return answer;

    }
}

public class palindrome_1 { 

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Main T = new Main();

        System.out.println(T.solution(str));   
        sc.close();
    }
    
}
