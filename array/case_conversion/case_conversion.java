package array.case_conversion;

import java.util.Scanner;

public class case_conversion {
    
    public static void main(String[] args) {

        // �Է¹��� ���ڿ��� �ٲ� ������ ������ ���� ���� �ִ� �͵� �����ϱ�
        String answer = "";

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char [] strArray = str.toCharArray();

        for (char x : strArray) {
            
            // if (x>=97 && x<=122)
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            }
            else answer += Character.toLowerCase(x);

        }

        System.out.println(answer);
        sc.close();

    }
}

/* 
 * Character.isLowerCase(char ch) -> �ҹ��ڴ�? �˷��ִ� �޼ҵ�
 * ASKII �ڵ�� �빮�ڴ� 65~90 �ҹ��ڴ� 97~122 -> �ҹ��� -32 = �빮��
 */
