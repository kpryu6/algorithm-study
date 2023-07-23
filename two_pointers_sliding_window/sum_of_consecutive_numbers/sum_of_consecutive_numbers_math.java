
// ������ ���
// ���� 15�� 7+8 ó�� 2���� �����ٰ� ����.
// �ϳ����� 1��, �ٸ� �ϳ����� 2�� �Ҵ�����. (���ӵ� �ڿ���)
// 15 - (1 + 2) = 12
// 12�� �� 2���� ������ ������ �������� �� ���� 1�� 2�� ���Ѵ�
// 1+6 = 7, 2+6 = 8

package two_pointers_sliding_window.sum_of_consecutive_numbers;

import java.util.Scanner;

public class sum_of_consecutive_numbers_math {

    public int solution(int n){
        // cnt : ��� ������
        int answer = 0, cnt = 1;
        n--;

        while (n>0) {
            cnt++;
            n = n - cnt;
            if (n%cnt == 0) answer++;
        }

        return answer;
    }

    public static void main(String args[]) {

        sum_of_consecutive_numbers_math T = new sum_of_consecutive_numbers_math();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
        sc.close();
    }
    
}
