package array.peak;

import java.util.Scanner;

public class peak_easy {

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
        
        // �����¿� ���� ���� ����
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        // ���츮 Ȯ��
         for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                // ���츮�� true
                boolean flag = true;

                for (int k = 0; k < 4; k++) {
                    // �����¿� �ѹ��� ���� �ڽź��� ũ�ų� ������ ���츮 �ƴ�
                    if (arr[i + dx[k]][j + dy[k]] >= arr[i][j] ){
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

        System.out.println(answer);
        


        sc.close();
    }
    
}
