package array.string_compression;

import java.util.Scanner;

public class string_compression {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // for ������ �������ڶ� ���ϱ� ���� ��,indexOutofBounds ����
        // �߸� �ƴѰ� �;��µ� ���ǵ� �̷���;;;;
        String input = sc.next() + " ";
        StringBuilder answer = new StringBuilder();

        
        int p = 1;

        for (int i = 0; i < input.length() - 1 ; i++) {

            // p ���ϱ�
            char ch = input.charAt(i);
            char chAfter = input.charAt(i+1);

            if (ch == chAfter) {
                p++;
            }
            else if (p == 1) answer.append(input.charAt(i));
            else {
                answer.append(input.charAt(i));
                answer.append(p);
                p=1;
            }

        }

        System.out.println(answer.toString());
        sc.close();

    }
    
}
