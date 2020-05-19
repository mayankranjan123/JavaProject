package tree;

import java.util.Scanner;

public class BST {
    TreeNode root;
    public static void main(String[] args) {
        BST bst = new BST();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1.  Insert Element in BST");
            System.out.println("2.  View elements inorder");
            System.out.println("3.  Find element in BST");
            System.out.println("4.  Delete element in BST");
            System.out.println("5.  Find maximum element in BST");
            System.out.println("6.  Find minimum element in BST");
            System.out.println("7.  Find Lowest common Ancestor");
            System.out.println("Enter your choice");
            int n = sc.nextInt();

            switch (n) {
                case 1 :
                    System.out.println("Enter value");
                    bst.root = bst.insert(bst.root, sc.nextInt());
                    break;
                case 2 :
                    System.out.println("Elements are: ");
                    bst.inorder(bst.root);
                    break;
                case 3:
                    System.out.println("Enter element to find");
                    bst.findElement(bst.root, sc.nextInt());
                    break;
                case 4:
                    System.out.println("Enter element to delete");
                    bst.root = bst.delElement(bst.root, sc.nextInt());
                    break;
                case 5:
                    System.out.println("Max element: " + bst.findMaxElement(bst.root).data);
                    break;
                case 6:
                    System.out.println("Enter element to find LCA");
                    System.out.println(bst.lca(bst.root, sc.nextInt(), sc.nextInt()).data);

            }
        }
    }

    private TreeNode lca(TreeNode node, int p, int q) {
        if (node == null)
            return null;
        if (node.data == p || node.data == q)
            return node;
        node.left = lca(node.left, p, q);
        node.right = lca(node.right, p, q);
        if (node.left != null && node.right != null)
            return node;
        return (node.left != null) ? node.left : node.right;
    }

    private TreeNode delElement(TreeNode node, int val) {
        if (node != null) {
            if (node.data > val)
                node.left = delElement(node.left, val);
            else if (node.data < val)
                node.right = delElement(node.right, val);
            else {
                if (node.left != null && node.right != null) {
                    TreeNode temp = findMaxElement(node);
                    node.data = temp.data;
                    node.left = delElement(node.left, node.data);
                } else {
                    if (node.left == null)
                        node = node.right;
                    if (node.right == null)
                        node = node.left;
                }
            }
        }
        return node;
    }

    TreeNode findMinElement(TreeNode node) {
        TreeNode temp = node;
        while (node != null) {
            temp = node;
            node = node.left;
        }
        return temp;
    }

    TreeNode findMaxElement(TreeNode node) {
        if (node == null)
            return null;
        else if (node.left == null && node.right == null)
            return node;
        else if (node.right == null)
            return node;
        return findMaxElement(node.right);
    }

    private void findElement(TreeNode node, int val) {
        if (node != null) {
            if (node.data == val) {
                System.out.println("Element found");
                return;
            }
            else if (node.data > val)
                findElement(node.left, val);
            else if (node.data < val)
                findElement(node.right, val);
        } else {
            System.out.println("Not found");
        }

    }

    private void inorder(TreeNode node) {
        if (node != null) {
            if (node.left != null)
                inorder(node.left);
            System.out.print(node.data + " ");
            if (node.right != null)
                inorder(node.right);
        }
    }

    private TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            node = createNode(val);
        } else if (node.data < val) {
            node.right = insert(node.right, val);
        } else {
            node.left = insert(node.left, val);
        }
        return node;
    }

    private TreeNode createNode(int val) {
        TreeNode node = new TreeNode(val);
        return node;
    }


}
