package hashmap_treeset.find_all_anagram;

import java.util.*;

public class find_all_anagram {

    public int solution(String T, String S) {
        int answer = 0;
    
        // S�� Hashmap
        HashMap<Character,Integer> Smap = new HashMap<>();
        for (char c : S.toCharArray()) {
            Smap.put(c,Smap.getOrDefault(c, 0)+1);
        }
    
        // T�� Hashmap
        HashMap<Character,Integer> Tmap = new HashMap<>();
        char[] Tarr = T.toCharArray();
        int lt = 0, rt = S.length();
    
        // rt���� �ϴ� Hashmap�� ���� (Sliding Window)
        for (int i = 0; i < rt; i++) {
            Tmap.put(Tarr[i],Tmap.getOrDefault(Tarr[i], 0)+1);
        }
    
        while (rt <= T.length()){
            // equals�� �ϱ�
            // entrySet() �޼ҵ�� Map�� Ű(key)�� ��(value)�� ��� �����ϴ� Entry ��ü�� ����(set)�� ��ȯ
            if (Tmap.entrySet().equals(Smap.entrySet())) {
                answer++;
            }
            if (rt == T.length()) break;
            // �����ε��� +, �� ���� �ε��� -
            Tmap.put(Tarr[rt],Tmap.getOrDefault(Tarr[rt],0)+1);
    
            Tmap.put(Tarr[lt], Tmap.get(Tarr[lt]) - 1);
            if (Tmap.get(Tarr[lt]) == 0) Tmap.remove(Tarr[lt]);
            lt++;
            rt++;
        }
            
        return answer;
    }
    


    public static void main(String args[]) {

        find_all_anagram m = new find_all_anagram();
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String S = sc.next();

        System.out.println(m.solution(T,S));
        sc.close();
    }
    
}
