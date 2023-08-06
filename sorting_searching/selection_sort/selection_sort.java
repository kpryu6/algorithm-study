package sorting_searching.selection_sort;

import java.util.*;

// ���� ����(Selection Sort)�� �־��� ����Ʈ���� �ּڰ��� ã�� �� �տ� ��ġ�� ���� ��ü�ϰ�, 
// �� �������� ���� ���� ã�� �� ��° ��ġ�� ���� ��ü�ϴ� ������ �ݺ��Ͽ� �����ϴ� �˰���
public class selection_sort {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
