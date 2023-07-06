package array.visible_student;

import java.util.*;


public class visible_student {

    public int solution(int n, int[] arr){
        
        int answer = 0;
        int max = Integer.MIN_VALUE;

        // 148�� max�� ��� ��������?
        // ���� index ���� �� * �տ� �ֵ� �� �˻��ؼ�* �ڱ⺸�� ū�� ������ �Ⱥ��̴°Ű� �ڱ⺸�� �� ������ �ڱ� ���̴°Ű�
        outerLoop:
        for (int i = 0; i < n; i++) {

            max = arr[i];

            for (int j = 0; j < i; j++) {
                // �տ� �ִ� �͵��߿� � ���� �� ū ���
                if (max <= arr[j]){
                    max = arr[j];
                    // �տ� �ϳ��� ũ�� �Ⱥ��̴ϱ� �׳� �ٷ� continue
                    continue outerLoop;
                }
                // �ڱⰡ �� ū ���� �ƹ� ��������
            }

            // for���� continue ������ ���� ���� ��츸 answer ����
            answer++;

        }

        return answer;
    }


    public static void main(String args[]){

        visible_student T = new visible_student();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];

        for(int i = 0; i < n; i++) {

            heights[i] = sc.nextInt();
        
        }
        System.out.println(T.solution(n,heights));
        sc.close();
    
    }

   
}
