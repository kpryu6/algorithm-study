package array.ranking;

// ���� �����ΰ�? ���� 
// �ߺ��� ��� �ذ��� ���ΰ�?
import java.util.Scanner;

public class ranking {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ** arr�� ���鼭 �ٷιٷ� ����� ������. **

        // ����� �����ϴ� �迭
        int[] ranking = new int[n];

        for (int i = 0; i < n; i++) {
            // ���
            int rank = 1;

            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) rank++;
            }
            ranking[i] = rank;
        }

        for (int x : ranking) System.out.print(x + " ");

        sc.close();
    }
    
}
