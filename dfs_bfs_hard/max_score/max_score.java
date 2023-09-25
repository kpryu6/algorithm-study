import java.util.*;

public class max_score {

    static int limit, answer = Integer.MIN_VALUE;
    static int[] scores, times;
    static int n;

    public void DFS(int L, int scoreSum, int timeSum) {

        if (timeSum > 20) return;
        // leaf ������ ���ٴ� �� �κ������� ��������ٴ°�
        if (L == n) {
            answer = Math.max(answer,scoreSum);
        }
        else {
            DFS(L+1, scoreSum+scores[L], timeSum+times[L]);
            DFS(L+1, scoreSum, timeSum);
        }

    }

    public static void main(String args[]) {

        max_score T = new max_score();
        Scanner sc = new Scanner(System.in);

        // ����
        n = sc.nextInt();
        scores = new int[n];
        // ���ѽð�
        limit = sc.nextInt();
        times = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            times[i] = sc.nextInt();
        }

        T.DFS(0, 0, 0);
        System.out.println(answer);
        sc.close();
    }

    
    
}
