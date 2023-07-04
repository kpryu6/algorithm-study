package array.char_distance;

import java.util.Scanner;

public class char_distance_easy {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] inputs = input.split(" ");
        String str = inputs[0];
        char ch = inputs[1].charAt(0);

        // ������ ch�� ���� ������ �Ÿ��� �������� e�� ���� ������ �Ÿ��� ���ؼ� ���ϱ�
        char[] strArray = str.toCharArray();
        int n = str.length();
        int p = 1000;

        // ������ �Ÿ��� �����ϴ� int �迭
        int[] intArr = new int[n];

        // ������ ch�κ��� ������ �Ÿ�
        for (int i = 0; i < n; i++) {
            
            if (strArray[i] == ch) {

                p = 0;
            }
            intArr[i] = p;
            p++;
        }

        /*  for (int x : intArr) {
            System.out.print(x + " ");
        }
        System.out.println(); */


        // ������ ch�κ��� ������ �Ÿ�
        for (int i = n-1; i >= 0; i--) {
            
            if (strArray[i] == ch) p = 0;
            
            intArr[i] = Math.min(intArr[i],p);
            
            p++;
        }

         for (int x : intArr) {
            System.out.print(x + " ");
        }
        sc.close();

    }
    
}
