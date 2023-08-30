
import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class spiraltraversal {

    Node root;

    static void spiralpattern(Node roots) {
        if (roots == null)
            return;

        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        s1.push(roots);
        while (!s1.empty() || !s2.empty()) {
            while (!s1.empty()) {
                Node temp = s1.peek();
                s1.pop();
                System.out.print(temp.data + " ");

                if (temp.left != null)
                    s2.push(temp.left);
                if (temp.right != null)
                    s2.push(temp.right);
            }

            while (!s2.empty()) {
                Node temp = s2.peek();
                s2.pop();
                System.out.print(temp.data + " ");

                if (temp.right != null)
                    s1.push(temp.right);

                if (temp.left != null)
                    s1.push(temp.left);
            }
        }

    }

    public static void main(String[] args) {

        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7

        spiraltraversal tree = new spiraltraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(7);
        tree.root.right.left = new Node(6);

        System.out.println(" Spiral formate output of Binary tree ");

        tree.spiralpattern(tree.root);

    }

}
