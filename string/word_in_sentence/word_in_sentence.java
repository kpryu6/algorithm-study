package string.word_in_sentence;

import java.util.Scanner;

public class word_in_sentence {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // ������ �������� �Ѵܾ ����
        String [] wordArray = str.split(" ");

        String answer = "";

        int m = 0;
        for (String word : wordArray) {

            int len = word.length();

            if (len > m) {
                m = len;
                answer = word;
            }
        }

        System.out.println(answer);
        sc.close();

    }
    
}
