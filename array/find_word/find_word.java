//fn + f5�� compile

package array.find_word;

import java.util.Scanner;

public class find_word {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);

        // Ư�� word�� ã�� ���� �Է¹��� (���ڿ� & ����) �빮�ڷ� �ٲٱ�
        String upperStr = str.toUpperCase();
        char upperCh = Character.toUpperCase(ch); // ** ���ڸ� �빮�ڷ� �ٲ��� **

        int answer = 0;
        
        // upperStr�� �迭�� ������ֱ�
        for (char x : upperStr.toCharArray()) {

            if (x == upperCh) answer ++;
        }

        System.out.println(answer);

        sc.close();
    }
}

    /*  
    * charAt(int index) -> ���ڿ����� �ε����� ���� ���ڸ� ������
    * toCharArray() -> ���ڿ��� �迭�� �������
    * Character.toUpperCase(char ch) -> ���ڸ� �빮�ڷιٲ��� // �޼ҵ� ���� �ʿ����.
    */
    
