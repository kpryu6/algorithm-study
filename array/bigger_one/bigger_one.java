package array.bigger_one;

import java.util.ArrayList;
import java.util.Scanner;

public class bigger_one {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
    
        // N��
        int n = Integer.parseInt(sc.nextLine());
        // N���� ����
        String[] str = sc.nextLine().split(" ");
        int[] answer = new int[n];
        
        for (int i = 0; i < n-1; i++) {

            // �ڿ��� ũ��
            if (Integer.parseInt(str[i]) < Integer.parseInt(str[i+1])) {

                answer[i] = (Integer.valueOf(str[i+1]));
            }
        }

        // ù��°�� ������ ���
        System.out.print(str[0]);

        // ������ ���
        for (int x : answer) {

            // 0�̸� �Ѿ��
            if(x==0) continue;
            System.out.print(" " + x);
            
        }
        
        sc.close();

    }
    
}


// Integer.parseInt()�� int�� ����
// Integer.valueOf()�� Integer ��ü�� ����