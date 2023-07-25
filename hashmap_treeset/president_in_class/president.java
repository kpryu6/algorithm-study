package hashmap_treeset.president_in_class;

import java.util.Scanner;
import java.util.HashMap;

public class president {

    public char solution(int n, char[] arr ) {

        char answer = 0;
        int max = Integer.MIN_VALUE;

        HashMap<Character,Integer> map = new HashMap<>();
        for (char x : arr) {
            // map�� x�� value ���� ������ ��������, �ƴϸ� 0 +1���� put
            // Ű�� ���� �� ����ϴ� �ſ� �߿��� map.getOrDefault()
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Ű�� �����ϴ��� ���� ��
        // System.out.println(map.containsKey('A'));

        // map�� ũ��(key�� ����)
        // System.out.println(map.size());

        // Ư�� Ű �����ϸ鼭 �� Ư��Ű�� value�� return
        // System.out.println(map.remove('A'));

        // map ���
        for (char key : map.keySet()) {
            // System.out.println(key + " " + map.get(key));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;

    }

    public static void main(String args[]) {

        president T = new president();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();

        char[] arr = input.toCharArray();
        System.out.println(T.solution(n,arr));
        sc.close();
    }
    
}
