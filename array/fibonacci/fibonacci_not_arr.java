package array.fibonacci;

import java.util.Scanner;

public class fibonacci_not_arr {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b = 1, c;

        // 첫번째, 두번째 고정 출력
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();

    }
    
}
