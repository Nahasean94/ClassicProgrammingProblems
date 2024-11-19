package binary_search_tree;

import java.util.ArrayDeque;
import java.util.Stack;

public class BST {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5, null, null);
        TreeNode b = new TreeNode(1, null, null);
        TreeNode c = new TreeNode(8, null, null);
        TreeNode d = new TreeNode(-1, null, null);
        TreeNode e = new TreeNode(3, null, null);
        TreeNode f = new TreeNode(7, null, null);
        TreeNode g = new TreeNode(9, null, null);

        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setLeft(f);
        c.setRight(g);

        BST bst = new BST();
//        System.out.println("Printing pre order");
//        bst.preOrder(a);
//        System.out.println("Printing pre order iterative");
//        bst.preOrderIterative(a);
//        System.out.println("Printing post order");
//        bst.postOrder(a);
//        System.out.println("Printing post order iterative");
//
//        System.out.println("Printing level order");
//        bst.inOrder(a);
//        System.out.println("Printing level order iterative");
//        bst.inOrderIterative(a);

//        System.out.println( bst.search(a,5));
        System.out.println( bst.searchBst(a,5));

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public void preOrderIterative(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.val);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public boolean search(TreeNode root,int target) {

       if (root == null) {
           return false;
       }
       if (root.val == target) {
           return true;
       }
       return search(root.left,target) || search(root.right,target);
    }
    public boolean searchBst(TreeNode root,int target) {

       if (root == null) {
           return false;
       }
       if (root.val == target) {
           return true;
       }
       if(target<root.val){
           return search(root.left,target);
       }
       else {
           return search(root.right,target);
       }
    }

    public void inOrderIterative(TreeNode root) {
        ArrayDeque<TreeNode> treeNodes = new ArrayDeque<>();
        treeNodes.push(root);
        while (!treeNodes.isEmpty()) {
            TreeNode temp = treeNodes.removeLast();
            System.out.println(temp.val);

            if (temp.left != null) {
                treeNodes.push(temp.left);
            }
            if (temp.right != null) {
                treeNodes.push(temp.right);
            }
        }
    }

}
