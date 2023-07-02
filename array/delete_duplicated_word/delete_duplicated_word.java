

// �ùٸ� �ߺ� ���� ������ �����ϱ� ���� StringBuilder�� ���
package array.delete_duplicated_word;

import java.util.Scanner;

public class delete_duplicated_word {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // String�� �Һ� Ŭ�����̱� ������ �������ۿ��� StringBuilder ����
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            // sb�� currentChar�� ������
            if (sb.indexOf(String.valueOf(currentChar)) == -1) {
                
                sb.append(currentChar);
                
            }
        }
        
        String answer = sb.toString();
        System.out.println(answer);

        sc.close();
    }
    
}

// indexOf�� ���ڿ����� �ش� ���ڸ� �˻��� �� ù��°�� �߰ߵǴ� index�� ����
// str = "goog" -> str.indexOf('g') -> 0