
import java.util.*;

public class crane_doll_grabber {

    public int solution (int n, int[][] arr, int m, int[] moves) {
        int answer = 0;
        // �ٱ���
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j][moves[i] - 1] != 0) {
                    // ������ 0�̸� �ƹ��͵� ���� ���̹Ƿ� break
                    if (arr[n-1][moves[i]-1] == 0) break;
                    // ������ �ߴµ� ���ÿ� �� ������ �����Ŷ� ������ ����
                    if ((!stack.isEmpty()) && (stack.peek() == arr[j][moves[i] - 1])) {
                        arr[j][moves[i] - 1] = 0;
                        stack.pop();
                        answer += 2;
                        break;
                        
                    }
                    else {
                       stack.push(arr[j][moves[i] - 1]);
                        arr[j][moves[i] - 1] = 0;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }

    public static void main(String args[]) {

        crane_doll_grabber T = new crane_doll_grabber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr,m,moves));
        sc.close();
    }
    
}
