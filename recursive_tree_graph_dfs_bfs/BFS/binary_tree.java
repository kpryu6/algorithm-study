package recursive_tree_graph_dfs_bfs.BFS;

import java.util.*;

// ���� Ž�� (Queue ���)
// 1 / 2 3 / 4 5 6 7

class Node {
    int data;
    Node rt, lt;
    public Node (int data) {
        this.data = data;
        lt = rt = null;
    }
}
public class binary_tree {

    Node root;
    public void BFS(Node root) {

        if (root == null) return;
        else {
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            // Level
            int L = 0;

            while (!Q.isEmpty()) {
                // size ������ϰ� for���� �״�� Q.size() �ߴ��� ��������
                /*
                 * ���� ���, ť�� ��� 2���� ������� ��, ť�� ������� 2�Դϴ�. 
                 * ������ ù ��° ��带 �����鼭 �� �ڽ� ������ ť�� ������, ť�� ������� 3�� �˴ϴ�. 
                 * �� ���¿��� �ݺ����� �ٽ� ����Ǹ�, ť�� ����� 3�� �Ǿ������ ������ ����ġ ���� ����� ������ �˴ϴ�.
                 */
                int size = Q.size();

                System.out.print("Level " + L + " : ");

                for (int i = 0; i < size; i++) {
                    Node cur = Q.poll();
                    System.out.print(cur.data + " ");
                    if (cur.lt != null) Q.offer(cur.lt);
                    if (cur.rt != null) Q.offer(cur.rt);
                }

                L++;
                System.out.println();
            }

        }

    }

    public static void main(String args[]) {

        binary_tree T = new binary_tree();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.BFS(T.root);
    }
    
}
