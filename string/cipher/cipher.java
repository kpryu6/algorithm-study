package string.cipher;

import java.util.Scanner;

public class cipher {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();
        char[] inputArray = input.toCharArray();
        char[] answer = new char[n];

        // input�� �������� �ٲٱ�
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '#') inputArray[i] = '1';
            else inputArray[i] = '0';

        }

        // 2������ �ٲ� Input �ٽ� String
        String inputTwoDecimal = String.valueOf(inputArray);

        int[] codes = new int[n];

        for (int i = 0; i < n; i++) {
            // 7���� ������ 2������ ���� 10������ ����
            codes[i] = Integer.parseInt(inputTwoDecimal.substring(7*i, 7*(i+1)),2);
            // 10������ ������ char�� ����
            answer[i] = (char) codes[i];
            System.out.print(answer[i]);
            
        }
        sc.close();

    }
    
}
