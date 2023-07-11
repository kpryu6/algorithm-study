package array.peak;

import java.util.Scanner;

public class peak {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        for (int i = 0; i < n+2; i++) {
            for (int j = 0; j < n+2; j++) {
                // ��ü 0�����
                arr[i][j] = 0;
            }
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                // �Է¹ޱ�
                arr[i][j] = sc.nextInt();
            }
        }

        // -----�����ڸ� 0���� ä��� �ϼ�-------

        // ���츮 ��
        int answer = 0;
        
        // ���츮 Ȯ��
         for (int i = 1; i < n+1; i++) {
            int max = 0;
            for (int j = 1; j < n+1; j++) {
                // ���� ���� ������ ���츮�� �ƴϱ⶧���� break
                max = Math.max(arr[i][j],arr[i-1][j]); // ��
                if (arr[i][j] == arr[i-1][j]) continue;
                max = Math.max(max,arr[i+1][j]); // ��
                if (arr[i][j] == arr[i+1][j]) continue;
                max = Math.max(max,arr[i][j-1]); // ��
                if (arr[i][j] == arr[i][j-1]) continue;
                max = Math.max(max,arr[i][j+1]); // ��
                if (arr[i][j] == arr[i][j+1]) continue;

                if (max == arr[i][j]) answer++;
            }
        }

        System.out.println(answer);
        


        sc.close();
    }
    
}
