package array.reversed_primes;

import java.util.Scanner;

public class reversed_primes {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // StringBuilder�� �Է¹��ڸ��� reverse
        StringBuilder[] arrReverse = new StringBuilder[n];
        for (int i = 0 ; i < n; i++) {
            arrReverse[i] = new StringBuilder(sc.next()).reverse();
        }

        // 23 55 26 02 052 073 002 03 001

        // primes�� arrReverse �ֱ�
        int[] primes = new int[n];
        for (int i = 0 ; i < n; i++) {
            // Integer.parseInt(String) �̱� ������ toString ����
            primes[i] = Integer.parseInt(arrReverse[i].toString());
        }
        
        // 23 55 26 2 52 73 2 3 1

        // ȿ�� �����䵥? �Ф�
        
        for (int i = 0; i < n; i++) {
            // ������ 0���� �ʱ�ȭ
            int rest = 0;

            // ����� 1�� �ڱ��ڽŹۿ� ������ �Ҽ�
            // But �ݴ�� 2���� �ڱ��ڽ� �������� �ؼ� �������°� ������ �Ҽ� ��� �ص���. -> reversed_primes_easy.java ����
            for (int j = 1 ; j <= primes[i]; j++) {
                if (primes[i] % j == 0) rest++;
            }
            if (rest == 2) System.out.print(primes[i] + " ");

        }
        
        sc.close();

    }
    
}
