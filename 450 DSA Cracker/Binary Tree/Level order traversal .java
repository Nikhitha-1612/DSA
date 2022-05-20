class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        Queue<Node> queue = new LinkedList<Node>();
        if(node==null)return list;
        queue.offer(node);
        while(!queue.isEmpty()){
            if(queue.peek().left!=null)queue.offer(queue.peek().left);
            if(queue.peek().right!=null)queue.offer(queue.peek().right);
            list.add(queue.poll().data);
        }
        return list;
    }
}
