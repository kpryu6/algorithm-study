// time limit exceeded
// O(n^2)
package two_pointers_sliding_window.maximum_sales;

import java.util.Scanner;

public class maximum_sales_time_Limit_Exceeded {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // n�� ���� ������
        int n = sc.nextInt();
        // ���ӵ� m��
        int m = sc.nextInt();

        int[] history = new int[n];
        for (int i = 0; i < n; i++) {
            history[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n - (m - 1); i++) {
            int sum = 0;
            // j�� �ִ� n�̴ϱ�
            for (int j = i; j < m + i; j++) {
                sum += history[j];
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
        sc.close();
    }

    
}
