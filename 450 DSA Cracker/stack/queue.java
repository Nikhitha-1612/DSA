public class Queue {
   int front,rear,size;
   int capacity;
   int array[];
   public Queue(int capacity) {
	   this.capacity = capacity;
	   front=this.size =0;
	   rear = capacity - 1;
	   array = new int[this.capacity];
   }
   boolean isFull(Queue queue) {
	   return (queue.size == queue.capacity);
   }
   boolean isEmpty(Queue queue) {
	   return (queue.size == 0);
   }
   void enqueue(int item) {
	   if(isFull(this))
		   return ;
	   this.rear = (this.rear+1)%this.capacity;
	   this.array[this.rear]= item;
	   this.size = this.size+1;
	   System.out.println("Successfully Enqueued..");
   }
   int dequeue() {
	   if(isEmpty(this))
		   return Integer.MIN_VALUE;
	   int item = this.array[this.front];
	   this.front =(this.front+1)%this.capacity;
	   this.size =this.size-1;
	   return item;
   }
   int front() {
	   if(isEmpty(this))
		   return Integer.MIN_VALUE;
	   int item = this.array[this.front];
	   return item;
   }
   int rear() {
	   if(isEmpty(this))
		   return Integer.MIN_VALUE;
	   return this.array[this.rear];
   }
  public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue queue = new Queue(1000);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(40);
		queue.enqueue(70);
		System.out.println(queue.dequeue());
		System.out.println(queue.front());
		System.out.println(queue.rear());
	  }
 }
}