package array.delete_duplicated_word;

import java.util.Scanner;

public class delete_duplicated_word_easy {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = "";

        for (int i = 0; i < str.length(); i++) {

            // i == str.indexOf(str.charAt(i)) �̸� �ߺ����ڴ� ������ ���ŵ�
            if (i == str.indexOf(str.charAt(i))) answer += str.charAt(i);

        }

        System.out.println(answer);
        sc.close();


    }
    
}
