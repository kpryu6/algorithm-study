
// O(n)
package two_pointers_sliding_window.maximum_sales;

import java.util.Scanner;

public class maximum_sales_sliding_window {
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
        
        // Sliding Window ��� ��� : �� ���� �ϳ��� ��Ҹ� �߰��ϰ� �����Ͽ� ���� ���� ����
        // ó�� m�� ���� ���ϰ� �״������ʹ� m+1��° ���ϰ� ù��°�� ���� �̷� ���
        // sum�� 1 2 3 �־����� �״����� 2 3 4 �״����� 3 4 5

        int sum = 0;
        // history[0] + history[1] + history[2]
        for (int i = 0; i < m; i ++) {
            sum += history[i];
        }

        // max�� ó�� 3�� ������
        int max = sum;

        for (int i = m; i < n; i ++) {
            sum += history[i] - history[i-m];
            max = Math.max(max,sum);
        }
        
        System.out.println(max);
        sc.close();
    }
    
}
