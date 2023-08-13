package sorting_searching.choosing_stable;

import java.util.*;

public class choosing_stable {

    // �� ���� 
    public int count (int[] arr, int distance) {

        int cnt = 1;
        int ep = arr[0];

        for (int x : arr) {
            // �Ÿ��� �Ǹ� �� ����
            if (x - ep >= distance) {
                ep = x;
                cnt++;
            }
        }

        return cnt;
    }

    public int solution (int n, int m, int[] arr) {

        int answer = 0;
        // �Ÿ��� �ּҰ� lt
        int lt = 1;
        // �Ÿ��� �ִ밪 rt
        int rt = Arrays.stream(arr).max().getAsInt();

        // ����
        Arrays.sort(arr);

        while (lt <= rt) {

            int mid = (lt + rt) / 2;

            if (count(arr,mid) >= m) {
                answer = mid;
                lt = mid + 1;
            }
            else rt = mid - 1;

        }
        return answer;

    }

    public static void main(String args[]) {

        choosing_stable T = new choosing_stable();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
        sc.close();
    }
    
}
