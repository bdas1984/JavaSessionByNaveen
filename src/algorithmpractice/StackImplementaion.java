package algorithmpractice;



public class StackImplementaion {
	
	int size;
	int arr[];
	int top;
	
	public StackImplementaion(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return (size-1 == top);
	}
	
	public int peek() {
		if (!isEmpty()) {
			return arr[top];
		}
		else {
			System.out.println("stack is empty");
			return -1;
		}
		
	}
	
	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top]=element;
		}
		else {
			System.out.println("stack is full now");
		}
		
	}
	
	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("popped element : " + arr[returnedTop]);
			return arr[returnedTop];
		}
		else {
			System.out.println("stack is empty");
			return -1;
		}
	}
	
	public void printStack() {
		for (int i=0; i<=top; i++) {
			System.out.println(arr[i] + ", ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImplementaion sim = new StackImplementaion(5);
		
		sim.pop();
		sim.push(10);
		sim.push(20);
		sim.push(30);
		sim.push(40);
		sim.push(50);
		sim.pop();
		
		sim.printStack();
		
		
		
		

		

	}

}
