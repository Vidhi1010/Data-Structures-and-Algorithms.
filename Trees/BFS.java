import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static boolean searchBFS(Node root, int key) {
        if(root == null) {
            return false;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node temp = q.poll();
            if(temp.data == key) {
                return true;
            }
            if(temp.left != null) {
                q.add(temp.left);
            }
            if(temp.right != null) {
                q.add(temp.right);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
