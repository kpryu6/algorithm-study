
// replaceAll ���
package array.validated_palindrome;

import java.util.Scanner;

public class validated_palindrome {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String strClear = "";
        String answer = "NO";

        // str.toUpperCase().replaceAll("[^A-Z]", "");
        // -> str�� �빮�ڷ� �ٲ��ְ� A ~ Z ���� �ƴ� �͵��� �� ����ó��
        for (int i = 0; i < str.length(); i++) {

            if (Character.isAlphabetic(str.toCharArray()[i])) strClear += str.charAt(i); 

        }

        String strClearReverse = new StringBuilder(strClear).reverse().toString();

        if (strClear.equalsIgnoreCase(strClearReverse)) answer = "YES";

        System.out.println(answer);
        sc.close();

    }
    
}
