package hashmap_treeset.types_of_revenue;

import java.util.*;

public class types_of_revenue {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int lt=0, rt = k-1;

        // k-1�� ���� ���� ����
        for (int i = 0; i < rt; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for (int i = rt; i < n; i++) {
            // k��° ����
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);

            // ù��° k���� key��
            answer.add(map.size());

            // ����ģ lt�� key�� ������(�翬�� �ִ°Ŷ� contains ���ص���) value �ϳ� �ٿ��ֱ�
            if (map.containsKey(arr[lt])) {
                map.put(arr[lt], map.get(arr[lt]) -1);
                // value�� 0�̸� ����
                if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            }
            lt++;
            /* 
            for (Integer key : map.keySet()) {
                System.out.println(key + " " + map.get(key));
            }
            System.out.println();
            */
            
        }
        return answer;
    }

    public static void main(String args[]) {

        types_of_revenue T = new types_of_revenue();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (Integer x : T.solution(n, k, arr)) {
            System.out.print(x+ " ");
        }
        
        sc.close();
    
    }
    
}


// ��.. Python�̶� �򰥷��� ArrayList append�ϴٰ� �� �־ȵ��� ����;;
// ArrayList�� add!!!!!!