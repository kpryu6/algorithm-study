package array.extract_numbers;

import java.util.Scanner;

public class extract_numbers {
    
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String numbers = "";
        

        // �Է¹��� ���ڿ����� ���ڸ� ����
        for (char x : input.toCharArray()) {

            if (Character.isDigit(x)) numbers += x;
            
        }

        int realNumbers = Integer.parseInt(numbers);

        System.out.println(realNumbers);
     
        sc.close();
    }
}
