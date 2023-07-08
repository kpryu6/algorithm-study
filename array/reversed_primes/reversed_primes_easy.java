package array.reversed_primes;

import java.util.Scanner;
import java.util.ArrayList;

public class reversed_primes_easy {

    // �Ҽ� ã�� �˰���
    public boolean isPrime(int num) {
        // 1�� �Ҽ� �ƴ�
        if (num == 1) return false;
        // 1�� �ڱ� �ڽ����θ� ���������°� �Ҽ��ϱ� �ٸ� ���ڷε� �������� �Ҽ��� �ƴ�
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        // ���� �յ� �ٲٱ� �˰���
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String args[]) {

        reversed_primes_easy T = new reversed_primes_easy();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n,arr)) System.out.print(x + " ");
        sc.close();
    }
    
}
