package array.maximum_sum_of_grid;

import java.util.Scanner;

public class maximum_sum_of_grid {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] arr = new int [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // �� �ʱ�ȭ
        int[] rowSum = new int[n];

        // �� �ִ밪
        int rowMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += arr[i][j];
            }
            if (rowMax < rowSum[i]) rowMax = rowSum[i];
        }


        // �� �ʱ�ȭ
        int[] columnSum = new int[n];

        // �� �ִ밪
        int columnMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                columnSum[i] += arr[j][i];
            }
            if (columnMax < columnSum[i]) columnMax = columnSum[i];
        }


        // �� �밢�� �ʱ�ȭ
        int[] crossSum = new int[2];
        // X �κ��� \
        for (int i = 0; i < n; i++) {
            crossSum[0] += arr[i][i];
        }
        // X �κ��� /
        for (int i = 0; i < n; i++) {
            int j = n - 1;
            crossSum[1] += arr[i][j];
            j--;
        }
        // �� �밢�� �߿� ū ��
        int crossMax = crossSum[0] < crossSum[1] ? crossSum[1] : crossSum[0];

        // ������ Max ���� ���ؼ� ū��
        int finalMax = (rowMax > columnMax) ? (rowMax > crossMax ? rowMax : crossMax) : (columnMax > crossMax ? columnMax : crossMax);


        System.out.println(finalMax);

        sc.close();
    
    }

    
}
