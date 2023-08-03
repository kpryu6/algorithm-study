package stack_queue.rescue_princess;

import java.util.*;

public class rescue_princess {

    public int solution (int n, int k) {

        Queue<Integer> Q = new LinkedList();
        // ���� �־��ְ�
        for (int i = 1; i <= n; i++) Q.offer(i);

        while(!Q.isEmpty()) {
            // k-1 ���� ���ְ� �ڷ� �ֱ�
            for (int i = 1; i < k; i++) Q.offer(Q.poll());
            // k��°�� ����
            Q.poll();
            // �ϳ� �������� �װ� ����
            if (Q.size() == 1) break;
        }

        return Q.poll();
    }

    public static void main(String args[]){

        rescue_princess T = new rescue_princess();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(T.solution(n,k));
        sc.close();


    }
    
}
