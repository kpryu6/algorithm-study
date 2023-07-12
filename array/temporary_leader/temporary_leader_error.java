package array.temporary_leader;

import java.util.Scanner;

public class temporary_leader_error {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // �� �л��� ���� �� ���� count
        int[] cnt = new int[n];

        // *************** �� �κи� �ٸ� *********************

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == k) continue; // ���� �л��̸� �ǳʶٱ�
                    if (arr[i][j] == arr[k][j]) cnt[i]++; // ���� ���� �л��� �����ϸ� �� ��ȣ�� �л��� cnt ++
                }
            }
        }
        // ����� �Ȱ��ٴµ� ���� �����͸� ��������� ����� �̻����� 
        // ��??

        // *************** �� �κи� �ٸ� *********************

        int max = Integer.MIN_VALUE;

        // cnt�� ���� ū ��� ���
        for (int i = 0; i < n; i++) {
            max = Math.max(max,cnt[i]);
        }

        // ���� ��� ���� ���� ��ȣ�� �̾ƾ� ��
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (cnt[i] == max) {
                // index�ϱ� +1
                min = Math.min(min,i+1);
            }
        }
        System.out.println(min);

        sc.close();
    }
    
}
