//https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        int []diameter = new int [1];
        height(root,diameter);
        return diameter[0];
    }
    private int height(Node node,int[] diameter){
        if(node==null){
            return 0;
        }
        int lh=height(node.left,diameter);
        int rh=height(node.right,diameter);
        diameter[0]=Math.max(diameter[0],1+lh+rh);
        return 1+Math.max(lh,rh);
    }
}
