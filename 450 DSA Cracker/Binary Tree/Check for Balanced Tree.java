//https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1
class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	if(root==null)
	return true;
	if(height(root)==-1)
	return false;
	else
	return true;
    }
	public int height(Node node){
	    if(node==null)
	    return 0;
	    int lh=height(node.left);
	    int rh=height(node.right);
	    if(lh==-1 || rh ==-1)
	       return -1;
	    if(Math.abs(lh-rh)>1){
	        return -1;
	    }
	    return  Math.max(lh,rh)+1;
	
    }
}

