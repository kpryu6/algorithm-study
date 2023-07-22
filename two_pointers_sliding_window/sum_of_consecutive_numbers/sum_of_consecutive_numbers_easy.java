package two_pointers_sliding_window.sum_of_consecutive_numbers;

import java.util.Scanner;

public class sum_of_consecutive_numbers_easy{

    public int solution(int n) {
        int answer = 0;
        int lt = 0, sum = 0;
        int m = n/2 + 1;
        int[] arr = new int[m];
        // 1���� 8���� ����
        for (int i = 0; i < m; i++) arr[i] = i+1;

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }

    public static void main(String args[]) {

        sum_of_consecutive_numbers_easy T = new sum_of_consecutive_numbers_easy();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
        sc.close();

    }
}