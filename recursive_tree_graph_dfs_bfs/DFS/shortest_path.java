class Node {
    int data;
    Node lt,rt;
    public Node (int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class shortest_path{

    public int DFS(int L, Node root) {

        if (root == null) return 0;
        else {
            // �ڽ��� ������
            if (root.lt == null && root.rt == null) return L;
            // �ڽ��� 2�� �ִٰ� ����
            else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));

        }

    } 

    

    public static void main(String args[]) {

        shortest_path T = new shortest_path();
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(T.DFS(0,root));
    }
    
}
