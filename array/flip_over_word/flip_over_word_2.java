package array.flip_over_word;

import java.util.Scanner;

public class flip_over_word_2 {

    public static void main (String args []) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // ���� �ܾ�� �ѹ��� �迭�� ���� �� �־���..
        String [] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next(); // ���� ���� ������ �� �ձ��� �޾ƿ�
        }

        // ** NEW ** //
        // ���� �ڸ� �ٲٱ� toCharArray ���
        for (String x : str) {
            char [] charArray = x.toCharArray();
            int left = 0;
            int right = x.length()-1;
            while (left < right) { // study�� ���
                char tmp = charArray[left]; // tmp = s
                charArray[left] = charArray[right]; // ytudy
                charArray[right] = tmp; // ytuds
                left++;
                right--;
            }
            String answer = String.valueOf(charArray);
            System.out.println(answer);
        }
        sc.close();

    }
    
}

/*
1) StringBuilder

���� ��� String ��ü �ΰ��� ���ϸ� ���ο� ��ü�� �����Ǿ� ��ü�� 3���� �ȴ�. ��ü�� ���ѻ����� �����ϱ� ���� ���� ����� �� ��� toString()�� ����.

?

2) valueOf()

String tmp = String.valueOf(s);
char s�� String���� �ٲپ� tmp�� ����
���� ���� ���ڿ��� ��ȯ �� ��ȯ


3)StringBuilder.reverse()

���ڸ� �ϳ� �� �������ʰ� �״�� ������

 */
