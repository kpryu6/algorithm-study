package array.char_distance;

import java.util.Scanner;

public class char_distance {

    public static void main (String arg[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] inputs = input.split(" ");

        String str = inputs[0];
        char ch = inputs[1].charAt(0);

        

        // index�� ǥ�����ֱ� ���� intArray
        int [] intArr = new int[str.length()];
        
        // str �ȿ� �ִ� ch�� ��
        int n = 0;
        
        for (int i = 0; i < str.length(); i++) {

            // ch�� ���� ���ڸ� ���� ���� 0���� �ʱ�ȭ
            if (str.charAt(i) == ch) {
                intArr[i] = 0; n++;
            }
            else {
                intArr[i] = 1;
            }
            // �������� ���� index ����
            // 0�� ����ִ� �迭�� �ε����� ��� �����ұ�?
        }
        // n = 3

        // intArr���� 0�� ���� index�� targetIndex�� ����
        int[] targetIndex = new int[n];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {

            if (intArr[i] == 0) {
                targetIndex[index] = i; index++;
            }
            
        }

      
        int[] subtractIndex = new int[n];

        for (int i = 0; i < str.length(); i++) {

            int tmp = 100;

            // index ���� �迭�� �����
            for (int j = 0; j < n; j++){

               subtractIndex[j] = Math.abs(i-targetIndex[j]);
            
            }

            //  �� index�� ���� �ּҰ� ���ϱ�
            for (int j = 0; j < n; j++){

                
                while ( tmp > subtractIndex[j]) {
                    tmp = subtractIndex[j];
                }
            }
            // intArr�� �Ҵ�
            intArr[i] = tmp;
            
        }

            for (int x : intArr) {
            System.out.print(x + " ");
            }

      
        sc.close();
    }
    
}
