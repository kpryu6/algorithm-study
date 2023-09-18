import java.util.*;
public class equal_sum_subset {

    static String answer = "NO";
    static int n, total = 0;
    static int[] arr;
    boolean flag = false;

    public void DFS(int L, int sum) {

        if (flag) return;
        if (sum > total/2) return;
        if (L == n) {
            if (sum == (total-sum)) {
                answer = "YES";
                // �� ã������ ���ÿ� �����ִ� DFS�� �� return
                flag = true;
            }
        }
        else {
            // �� ������ ����
            DFS(L+1, sum+arr[L]);
            DFS(L+1, sum);
        }
    }

    public static void main(String args[]) {

        equal_sum_subset T = new equal_sum_subset();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        T.DFS(0,0);
        System.out.println(answer);
        sc.close();
    }

    
}
