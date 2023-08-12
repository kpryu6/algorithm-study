import java.util.*;

// ���� �˰���
// Ư�� ���� ���� ������ ���� �ִ�

// Scanner�� ������ �ֳ�.. �Է��� �������� ���� -> �ذ�
public class music_video {

    public boolean canAnswer (int n, int m, int[] arr, int mid) {
        
        int sum = 0;
        int count = 1;
        boolean answer = true;

        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > mid) {
                count++;
                sum = arr[i];
            }
            else sum += arr[i];
        }

        if (count > m) answer = false;
            
        return answer;
        
    }

    public int solution (int n, int m, int[] arr) {
        // lt : arr�� �ִ� �� (���忡 �� �� �ִ� �ּҰ�)
        // rt : arr �� (���忡 �� �� �ִ� �ִ밪)
        int answer = 0;
        // max() ���� �ϸ� OptionalInt ���� ����ȯ
        int lt = Arrays.stream(arr).max().getAsInt();
        // Arrays.stream(arr) �� IntStream (int�� ��Ҹ� ������ ��Ʈ��)
        int rt = Arrays.stream(arr).sum();
        for (int i = 0; i < n; i++) rt += arr[i];

        while (lt <= rt) {

            int mid = (lt + rt)/2;
            // if (lt == rt) answer = mid;
            // �̰� ������ Scanner ���ѷ��� ������
            // �ؿ� if���� ���ļ�!
            if (canAnswer(n, m, arr, mid)) {
                answer = mid;
                rt = mid - 1;
            }
            else lt = mid + 1;

        }
        return answer;
    }

    public static void main(String args[]) {

        music_video T = new music_video();
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

// �̺� �˻��� ��� �ϴٺ��� lt�� rt���� Ŀ����