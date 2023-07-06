package string.word_in_sentence;

import java.util.Scanner;

public class word_in_sentence1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = "";

        int m = 0;
        // index�� ��Ƽ� �����
        int pos;
        // pos�� ������ �߰� ���ϸ� -1 ����
        // * ������ �ܾ� �ڿ� ������ ������ ������ �ܾ �۾����ֱ�
        while ((pos = str.indexOf(" ")) != -1) {

            String word = str.substring(0, pos);
            int len = word.length();

            if (len > m) { //len >= m �ϸ� ���� ������ �ܾ� �� �ڿ� �ܾ ���̵�
                m = len;
                answer = word;
            }

            str = str.substring(pos+1);
            
        }
        // * ������ �ܾ�
        if (str.length() > m) answer = str;

        System.out.println(answer);
        sc.close();

    }
    
}

/*

2) indexOf(String str)

int pos = str.indexOf(" ");

���ڿ��� ������ index ���� �Ҵ�

?

3) substring(int a, int b)

String word = str.substring(0,pos);

str�� �ε��� a���� b������ word�� �Ҵ�

--> substring(int a) �ϸ� str�� �ε��� a���� ������ word�� �Ҵ�
 */