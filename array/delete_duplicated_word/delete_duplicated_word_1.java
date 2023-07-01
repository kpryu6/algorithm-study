package array.delete_duplicated_word;

import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;


public class delete_duplicated_word_1 {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // LinkedHashSet�� ����Ͽ� �ߺ��� �����ϰ� ������ ����
        Set <Character> uniqueChar = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            uniqueChar.add(c);
        }

        StringBuilder result = new StringBuilder();

        for (char c : uniqueChar) {
            result.append(c);
        }

        System.out.println(result.toString());
        sc.close();
    }
    
}
