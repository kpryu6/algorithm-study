import java.util.*;

public class subset {

    static int n;
    static int[] ch;

    public void DFS(int L) {

        if (L == n+1) {
            // ch�� 1�� üũ�� �ε��� ���
            for (int i = 1; i <= n; i++) { 
                if (ch[i] == 1) System.out.print(i + " ");
            }
            System.out.println();

        }
        else {
            // ���
            ch[L] = 1;
            // ����
            DFS(L+1);
            // ��� X
            ch[L] = 0;
            // ������
            DFS(L+1);
        }

    }

    public static void main(String args[]) {

        subset T = new subset();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // ch�迭�� �ε��� ��ȣ�� ����
        ch = new int[n+1];
        T.DFS(1);
    }
    
}
