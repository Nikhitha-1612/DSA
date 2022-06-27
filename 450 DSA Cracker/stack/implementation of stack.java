import java.util.*;
public class Stack {

	 static final int max=1000;
	 static int[] stack = new int [max];
	 static int top=0;
	 Stack(){
		 top=-1;
	 }
	 
	 static void push(int stack[],int elem) {
		 if(top>max-1) {
			 System.out.println("stack is overflow");
		 }
		 else {
			 stack[++top]=elem;
			 System.out.println("Successfully pushed");
		 }
	 }
	 static void pop(int stack[]) {
		 if(top<0) {
			 System.out.println("stack is underflow");
		 }
		 else {
			int ans= stack[top--];
			 System.out.println("Successfully deleted\n"+ans);
		 }
	 }
	 static void peek(int stack[]) {
		 if(top<0) {
			 System.out.println("No elements to print ");
		 }
		 else {
			System.out.println(stack[top]);
		 }
	 }
	 static void  display(int stack[]) {
		 for(int i=top;i>=0;i--) {
			 System.out.println(stack[i]);
		 }
	 }
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   boolean b=true;
	   while(b) {
		   System.out.print("Choose a option\n1.Push\n2.pop\n3.peek\n4.display\n5.quit" );
		   int choice=sc.nextInt();
		   switch(choice) {
		   case 1:
			   System.out.println("Enter the element you want to push");
			   int t=sc.nextInt();
			   push(stack,t);
			   break;
		   case 2:
			    pop(stack);
			    break;
		   case 3:
			   peek(stack);
			   break;
		   case 4:
			   display(stack);
			   break;
		   case 5:
			   b=false;
		   }
	   }
   }
}
