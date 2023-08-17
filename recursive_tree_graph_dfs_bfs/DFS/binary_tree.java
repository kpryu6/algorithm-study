package recursive_tree_graph_dfs_bfs.DFS;

    // �θ� ����
    /*
     * ������ȸ : �� �� ��
     * ������ȸ : �� �� ��
     * ������ȸ : �� �� ��
     */

// ��� class
class Node {
    int data;
    Node lt, rt;
    public Node(int data) {
        this.data = data;
        rt = lt = null;
    }
} 

public class binary_tree {

    Node root;

    // Pre-order traversal (���� ��ȸ)
    public void PreDFS(Node root) {
        if (root == null) return;
        else {
            System.out.print(root.data + " ");
            PreDFS(root.lt);
            PreDFS(root.rt);
        }

    }

    // In-order traversal (���� ��ȸ)
    public void IDFS(Node root) {
        if (root == null) return;
        else {
            IDFS(root.lt);
            System.out.print(root.data + " ");
            IDFS(root.rt);
        }

    }

    // Post-order traversal (���� ��ȸ)
    public void PostDFS(Node root) {
        if (root == null) return;
        else {
            PostDFS(root.lt);
            PostDFS(root.rt);
            System.out.print(root.data + " ");
        }

    }

    public static void main(String args[]) {

        // Tree �����
        binary_tree T = new binary_tree();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        
        // ���� ��ȸ
        T.PreDFS(T.root);
        System.out.println();

        // ���� ��ȸ
        T.IDFS(T.root);
        System.out.println();

        // ���� ��ȸ
        T.PostDFS(T.root);
        System.out.println();
    }
    
}
