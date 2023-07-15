package two_pointers_sliding_window.find_common_elements;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class find_common_elements {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // arr1,arr2 ����
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // arr �����ϴ� �˰���
        /*
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }
        */

        ArrayList<Integer> list = new ArrayList<>();

        // p1�� p2�� ������ �ε���
        int p1 = 0, p2 = 0;

        // �ƹ� �����̳� ������ ������Ҵ� �� �̻� ���� �Ŵϱ� �� ������ �ʿ� x
        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) p1++;
            else if (arr1[p1] > arr2[p2]) p2++;
            else if (arr1[p1] == arr2[p2]) {
                list.add(arr1[p1]);
                p1++;
                p2++;
            }
        }
        for (int x : list) System.out.print(x + " ");
        sc.close();

    }
    
}
