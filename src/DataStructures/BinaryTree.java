package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

class BinaryTree {
    Node root;

    public static Node insert(Node node, int data)
    {

        /* 1. If the tree is empty, return a new,
                single node */
        if (node == null) {
            return new Node(data);
        }
        else {

            /* 2. Otherwise, recur down the tree */
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }

            /* return the (unchanged) node pointer */
            return node;
        }
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while (true) {
                parent = focusNode;

                if (data < focusNode.data) {
                    focusNode = focusNode.left;
                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void preOrderTraversal(Node focusNode) {
        if (focusNode != null) {
            System.out.print(focusNode.data + " ");
            preOrderTraversal(focusNode.left);
            preOrderTraversal(focusNode.right);
        }
    }
    public void inOrderTraversal(Node focusNode) {
        if (focusNode != null) {
            inOrderTraversal(focusNode.left);
            System.out.print(focusNode.data + " ");
            inOrderTraversal(focusNode.right);
        }
    }
    public void postOrderTraversal(Node focusNode) {
        if (focusNode != null) {
            postOrderTraversal(focusNode.left);
            postOrderTraversal(focusNode.right);
            System.out.print(focusNode.data + " ");
        }
    }

    int height(Node root)
    {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    void levelOrderTraversal()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }

    void printCurrentLevel(Node node, int level)
    {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.data + " ");
        else if (level > 1) {
            printCurrentLevel(node.left, level - 1);
            printCurrentLevel(node.right, level - 1);
        }
    }

    public static int heightByQueue(Node root)
    {
        int depth = 0;

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node temp = q.remove();

            if (temp == null) {
                depth++;
            }

            if (temp != null) {
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }else if (!q.isEmpty()) {
                q.add(null);
            }
        }
        return depth;
    }

    public static int heightByQueue2(Node root)
    {

        // Initialising a variable to count the
        // height of tree
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int height = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            height++;
        }
        return height;
    }

    public static int findHeight(Node root)
    {
        int height = 0;
        Node current = root;
        while (current != null) {
            if (current.left == null) {
                // If left subtree is null, move to right
                // subtree
                current = current.right;
                height++; // Increment the height of the
                // tree
            }
            else {
                // Find the inorder predecessor of current
                // node
                Node pre = current.left;
                while (pre.right != null
                        && pre.right != current)
                    pre = pre.right;

                if (pre.right == null) {
                    // Make current node the right child of
                    // its inorder predecessor
                    pre.right = current;
                    current = current.left;
                }
                else {
                    // If the right child of the inorder
                    // predecessor already points to the
                    // current node, then we have traversed
                    // the left subtree and its inorder
                    // traversal is complete.
                    pre.right = null;
                    current
                            = current.right; // Move to the
                    // right subtree
                }
            }
        }
        return height;
    }

    public int minValue(){
        Node current = this.root;
        while(current.left != null){
            current = current.left;
        }
        return current.data;
    }
    public int maxValue(){
        Node current = this.root;
        while(current.right != null){
            current = current.right;
        }
        return current.data;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.addNode(2);
        tree.addNode(1);
        tree.addNode(10);
        tree.addNode(9);
        tree.addNode(15);
        tree.addNode(-2);
        tree.addNode(-7);
        tree.addNode(-8);

        System.out.println("Height: " + tree.height(tree.root));
        System.out.println("Min Value: " + tree.minValue());
        System.out.println("Max Value: " + tree.maxValue());

        tree.levelOrderTraversal();


    }
}
