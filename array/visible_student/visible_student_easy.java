package array.visible_student;

import java.util.Scanner;

public class visible_student_easy {

    public int solution(int n, int[] arr) {
        int answer = 1;

        // i�� ���� �ٲ��� �ʰ� max�� �����߳�.. �̷��� ���� for�� �ȵ��Ƶ���
        int max = arr[0];

        for (int i = 1; i < n; i++) {

            if (max < arr[i]) {
                max = arr[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String args[]) {

        visible_student_easy T = new visible_student_easy();

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
