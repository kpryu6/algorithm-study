package array.extract_numbers;

import java.util.Scanner;

public class extract_numbers_askii {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int answer = 0;

        for (char x : input.toCharArray()) {

            // x�� '0' ���� '9'�����̸� (���ڹ���)
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }

        System.out.println(answer);
        sc.close();


    }
}
