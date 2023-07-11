package array.peak;

import java.util.Scanner;

public class peak_not_extended_table {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // �Է¹ޱ�
                arr[i][j] = sc.nextInt();
            }
        }

        // ���츮 ��
        int answer = 0;
        
        // �����¿� ���� ���� ����
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        // ���츮 Ȯ��
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // ���츮�� true
                boolean flag = true;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    
                    // �����¿� �ѹ��� ���� �ڽź��� ũ�ų� ������ ���츮 �ƴ�
                    if (nx>=0 && ny>=0 && nx<n && ny<n && arr[nx][ny] >= arr[i][j]){
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
