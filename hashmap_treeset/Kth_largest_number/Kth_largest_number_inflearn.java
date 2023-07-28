package hashmap_treeset.Kth_largest_number;

import java.util.*;

public class Kth_largest_number_inflearn {

    public int solution(int n, int k, int[] arr){
        int answer = -1;

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        // i,j,l ��� n������ �ص���
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i]+arr[j]+arr[l]);
                    // Tset.remove()
                    // Tset.first() -> ù��° ��
                    // Tset.last() -> ������ ��
                    // Tset.size()
                    // Set�� �ߺ����Ű�, Tree�� ����(����Ʈ��)�̴�.
                }
            }
        }
        int cnt = 0;
        for (Integer x : Tset) {
            cnt++;
            if (cnt == k) return x;
        }
        return answer;

    }

    public static void main(String args[]){

        Kth_largest_number_inflearn T = new Kth_largest_number_inflearn();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
        sc.close();
    }
    
}
