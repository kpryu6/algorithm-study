// ���� ���������� ��ȿ����

// �ѹ� �湮�� ���� �ٽ� �湮�ϸ� �ȵ�
import java.util.*;
public class path_finding_adjacency_matrix {

    static int answer = 0;
    // check �迭
    static int[] ch;
    // ���� 1~n
    static int n;
    static int[][] graph;

    // ��Ʈ��ŷ�ϸ鼭 ch[v] = 0���� �����ߵ�..
    public void DFS(int v) {

        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] != 1) {
                    ch[i] = 1;
                    DFS(i);
                    // DFS ���������� �� ���� check�迭 0���� ���ֱ�
                    ch[i] = 0;
                }
            }
        }
    }


    public static void main(String args[]) {

        path_finding_adjacency_matrix T = new path_finding_adjacency_matrix();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        graph = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            graph[sc.nextInt()][sc.nextInt()] = 1;
        }

        ch = new int[n+1];

        // 1���� ����
        ch[1] = 1; 
        T.DFS(1);
        System.out.println(answer);


       sc.close();
    }
    
}
