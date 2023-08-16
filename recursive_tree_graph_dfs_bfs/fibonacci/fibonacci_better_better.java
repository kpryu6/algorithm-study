
import java.util.*;

public class fibonacci_better_better {

    // ��ʹ� ������������ ���� ������ for������ ������ ������.
    // �޸������̼�
    static int[] fibo;
    public int DFS(int n) {

        if (fibo[n] > 0) return fibo[n];    // ��� �ϳ� ����
        // Ʈ���� �������� ������� �ٽ� ��;��ϰ� ���ʿ��� ���Ѱ��� �����.
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }

    public static void main(String args[]) {

        fibonacci_better_better T = new fibonacci_better_better();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n+1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
        sc.close();
    }
    
}
