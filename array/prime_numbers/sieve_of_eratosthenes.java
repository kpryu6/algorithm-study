
// �����佺�׳׽��� ü
package array.prime_numbers;

import java.util.Scanner;
// import java.util.Arrays;


public class sieve_of_eratosthenes {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numbers = new int[n+1];
        // �迭 0���� �� ä��� but �ٷ� �� �ڵ�� ��� 0���� �ʱ�ȭ �ڵ����� ������
        // Arrays.fill(numbers,0);
        int answer = 0;
        
        for (int i = 2; i <= n; i++) {
            // �Ҽ� ã�� (0�̸� �Ҽ�)
            if (numbers[i] == 0) {
                answer++;
                // i�� �Ҽ��� i�� ��� ��� �Ҽ��� �ƴϹǷ� ���� (1�� �����)
                for (int j = i; j <= n; j = j + i){
                    numbers[j] = 1;
                }
            }
        }

        System.out.println(answer);
        sc.close();
    }
    
}
