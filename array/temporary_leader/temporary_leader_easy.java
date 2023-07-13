package array.temporary_leader;

/* 
�� 1�� �л��� ���� ���� �� �л��� ī���� �� �� 3�� �л��� 1�� �л��� 1�г⶧�� 2�г⶧ ���� ���� 
   �� �� �ߴ��� 3�� �л��� �� ���� ī�����ؾ� �մϴ�.
   => �ٸ� �л��� �ѹ��̶� ���� �� ������ �� ���ķ� ���� �� �߾ ī��Ʈ X
*/
import java.util.Scanner;

public class temporary_leader_easy {

    public int solution(int n, int[][] arr) {

        int answer = 0;
        int max = Integer.MIN_VALUE;
        // i = 1 -> 1�г� �� ���� �� �� �л���
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                for (int k = 1; k <= 5; k++) {
                    // i�� �л��� k�г�� j�� �л��� k�г��� ���� ��
                    if (arr[i][k] == arr[j][k]) {
                        // cnt�� �ִ� 4�ڳ� �׷�
                        cnt++;
                        break;
                }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String args[]) {

        temporary_leader_easy T = new temporary_leader_easy();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println(T.solution(n,arr));
        sc.close();
    }
    
}
