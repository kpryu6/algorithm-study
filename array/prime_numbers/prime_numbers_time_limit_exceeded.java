
// Time Limit Exceeded
package array.prime_numbers;

import java.util.Scanner;

public class prime_numbers_time_limit_exceeded {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        // �Ҽ��� 1�� �ڽ� ����� �������� 0�� �ƴ�

        for (int i = 2; i <= n; i++) {

            // �������� 0�϶� ����
            int rest = 0;

            for (int j = 1; j <= i; j++) {
                
                if (i%j == 0) rest++;
            }

            // �Ҽ��� �������� 0�϶��� 2��
            if (rest == 2) answer++;
        }

        System.out.println(answer);
        sc.close();

    }
    
}
