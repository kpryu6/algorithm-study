

// �̰� ������!!!!!!!! (This code is error)

package string.delete_duplicated_word;

import java.util.Scanner;

public class delete_duplicated_word_ERROR {

    public static void main( String args [] ) {

        Scanner sc = new Scanner(System.in);

        // �Է¹��� ���ڿ�
        String str = sc.next();

        // ���ڿ� ���ڹ迭�� �����
        char[] charArray = str.toCharArray();

        for (char x : charArray) {

            // x �������� ������ x�� ���� ���� ã�Ƽ� ����
            for (int i = str.indexOf(x) + 1; i < str.length(); i++) {
                
                if (x == charArray[i]) {
                    
                    // ** �̷��� �ϸ� �����ϴ°� �ƴϰ� null������ �ٲ��ִ°Ŷ� ���� **
                    charArray[i] = '\0';

                }
            }
            
        }

        for (int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }

        
        sc.close();
        

    }
    
}
