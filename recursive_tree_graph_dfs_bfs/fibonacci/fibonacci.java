
import java.util.*;

public class fibonacci {

    // �̷����ϸ� �ʹ� �����ɷ��� �����÷ο� �߻�
    // n��° ���� ��
    public int DFS(int n) {

        if (n == 1 || n == 2) return 1;
        else return DFS(n-2) + DFS(n-1);
    }

    public static void main(String args[]) {

        fibonacci T = new fibonacci();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(T.DFS(i) + " ");
        }
        sc.close();
    }
    
}
