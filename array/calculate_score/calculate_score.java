package array.calculate_score;

import java.util.Scanner;

public class calculate_score {

    public int solution(int n, int[] arr) {

        // �� ����
        int answer = 0;
       
        for (int i = 0; i < n; i ++) {
            // ����
            int plus = 0;

            // arr[i]�� 1�̸� ���� �ε��� ���鼭 ��� 1�̸� plus++
            if (arr[i] == 1) {
                while (arr[i] == 1) {
                    i++; // �ε��� ����
                    plus++; // ������
                    // answer�� plus �����ϱ� 
                    answer += plus;
                    // i�� ������ �ε������� Ŀ���� ������
                    if (i == n) break;
                }
            }
            else {
                // arr[i]�� 0�̸� ���� �ε����� �Ѿ��
                continue;
            }
        }

        return answer;
    }

    public static void main(String args[]) {

        calculate_score T = new calculate_score();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,arr));

        sc.close();

    }
    
}
