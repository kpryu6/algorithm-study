package array.flip_over_char;

import java.util.Scanner;

public class flip_over_char {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = "";

        char [] charArray = str.toCharArray();

        int left = 0;
        int right = str.length() -1;

        while(left<right) {

            // �� ������ Alphabet�� �ƴϸ�
            if(!Character.isAlphabetic(charArray[left])) left++;
            
            // �� �������� Alphabet�� �ƴϸ�
            else if (!Character.isAlphabetic(charArray[right])) right--;

            // �Ѵ� Alphabet �̸�
            else {
                char tmp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = tmp;
                left++;
                right--;
            } 
        }

        answer = String.valueOf(charArray);

        System.out.println(answer);

        sc.close();


    }


    
}

// 1) Character.isAlphabetic(char ch)??
// ch�� ���ĺ��̸� 1 ���� 