package two_pointers_sliding_window.merge_arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class merge_arrays_easy {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        // �Է¹ޱ�
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> arrList = new ArrayList<>();

        // ������ �ε���
        int p1 = 0, p2 = 0;

        // �ε����� �ϳ��� �÷����� list�� add
        while (p1<n1 && p2<n2) {
            if (arr1[p1] < arr2[p2]) {
                arrList.add(arr1[p1++]);
            }
            else {
                arrList.add(arr2[p2++]);
            }
        }
        // add ���� ������ add
        while (p1 < n1) arrList.add(arr1[p1++]);
        while (p2 < n2) arrList.add(arr2[p2++]);
        
        for (Integer x : arrList) System.out.print(x + " ");
        sc.close();
    }
    
}
