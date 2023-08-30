import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

public class leftView {
    Node root;

    static void Leftview(Node roots) {
        if (roots == null)
            return;

        Queue<Node> q = new LinkedList<Node>();

        q.add(roots);
        while (q.isEmpty() == false) {
            int count = q.size();

            for (int i = 0; i < count; i++) {
                Node curr = q.poll();

                if (i == 0) // for right ke liye i==count-1 rahega
                    System.out.print(curr.data + " ");

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7

        leftView tree = new leftView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(7);
        tree.root.right.left = new Node(6);

        System.out.println("Left vew of Binary tree : ");
        tree.Leftview(tree.root);

    }

}
