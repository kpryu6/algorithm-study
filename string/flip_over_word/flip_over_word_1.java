package string.flip_over_word;

import java.util.Scanner;

public class flip_over_word_1 {

    public static void main (String args []) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // ���� �ܾ�� �ѹ��� �迭�� ���� �� �־���..
        String [] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next(); // ���� ���� ������ �� �ձ��� �޾ƿ�
        }

        // ** NEW ** //
        // StringBuilder�� �̿��� ��ü ���� ����
        for (String x : str) {
            String wordReverse = new StringBuilder(x).reverse().toString();
            System.out.println(wordReverse);
        }
        
        sc.close();

    }
    
}
