package array.cipher;

import java.util.Scanner;

class Main {
    public String solution(int n, String s) {

        String answer = "";

        for (int i = 0; i < n; i++) {
            // substring���� ¥���� �ٷ� replace�� �ٲ��ֱ�
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            // 2������ �Ѿ�� tmp�� parseInt
            int num = Integer.parseInt(tmp, 2);
            // num�� char�� �ٲٱ�
            answer += (char) num;
            // �ڸ� �������� ������(������) �Ҵ�
            s = s.substring(7);
        }

        return answer;
    }

}

public class cipher_easy {

    public static void main(String args[]) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(T.solution(n, str));

        sc.close();
    }
    
}
