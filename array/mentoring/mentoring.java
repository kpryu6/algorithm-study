package array.mentoring;

import java.util.Scanner;

public class mentoring {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        
        // i�� j�� �л���ȣ
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // �� �׽�Ʈ���� i,j ¦���� ���� ��Ƽ�� �� �� �ִ���
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                // �׽�Ʈ ������ ������(��� �׽�Ʈ) ���� ��Ƽ ����
                if (cnt == m) answer++;
            }
        }

        System.out.println(answer);
        sc.close();
    }
    
}


// list.size() -> list�� ��� ��
// list.get(0).get(0)
// => [[3,4],[1,2]] ���� 3