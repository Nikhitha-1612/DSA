public class StackNode {

	StackNode root;
	int data;
	StackNode next;
	
	StackNode(){
		
	}
	StackNode(int data){
		this.data=data;
	}
	
	public  boolean isEmpty() {
		if(root==null)
			return true;
		else
			return false;
	}
	@SuppressWarnings("unused")
	void push(int data) {
		StackNode newnode=new StackNode(data);
		if(root==null) {
			root=newnode;
		}
		else {
			StackNode temp = root;
			root=newnode;
			newnode.next=temp;
			System.out.println("Pushed successfully....");
		}
	}
	void pop() {
		int pop=0;
		if(root==null) {
			System.out.println("Cannot be popped");
		}
		else {
			
			pop=root.data;
			root=root.next;
			
		}
		System.out.println("Successfully popped "+pop);
	}
	void peek() {
		if(root==null) {
			System.out.println("stack is underflow");
		}
		else {
			
			System.out.println(root.data);
			root=root.next;
			
		}
	}
	public static void main(String[] args) {
		StackNode sn=new StackNode();
		sn.push(20);
		sn.push(40);
		sn.push(80);
		sn.pop();
		sn.peek();
	}
}
