class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        Stack<Node> s=new Stack<Node>();
        while(q.size()>0){
            Node t =q.remove();
            if(t.right!=null){
                q.add(t.right);
            }
            if(t.left!=null){
                q.add(t.left);
            }
            s.push(t);
        }
        while(s.size()>0){
            list.add(s.pop().data);
        }
        return list;
    }
}      
