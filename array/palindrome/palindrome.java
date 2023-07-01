package array.palindrome;

import java.util.Scanner;

public class palindrome {

    public static void main( String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // ��ҹ��� ���� ���ϹǷ� ��ü�� �빮�ڷ� ���ֱ�
        char[] charArray = str.toUpperCase().toCharArray();

        int left = 0;
        int right = str.length() - 1;
        
        while(left < right) {

            // left ���ڿ� right ���ڰ� ������
            if ((charArray[left] == charArray[right])) {
                left++;
                right--;
            }

            else {
                System.out.println("NO"); 
                break;
            }
         }
            
        if ((left >= right)) System.out.println("YES");
        sc.close();

    }
    
}
