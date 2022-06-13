class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        if(node == null)
        return 0;
        else{
            int  LDepth = height(node.left);
            int  RDepth = height(node.right);
            if(LDepth > RDepth)
            return LDepth+1;
            else
            return RDepth+1;
        }
        
    }
}
