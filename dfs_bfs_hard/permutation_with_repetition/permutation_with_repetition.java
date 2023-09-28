package dfs_bfs_hard.permutation_with_repetition;
import java.util.*;

public class permutation_with_repetition {

    static int[] pm;
    static int n,m;

    public void DFS(int L) {

        // Leaf ��� ���� ����ϱ�
        if (L == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(pm[i] + " ");
            }
            System.out.println();
        }
        else {
            // �� ������ pm�� �ε�����
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L+1);
            }

        }

    }
    public static void main(String args[]) {

        permutation_with_repetition T = new permutation_with_repetition();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        // Level ������ �迭
        pm = new int[m];

        T.DFS(0);
        sc.close();
        
    }
    
}
