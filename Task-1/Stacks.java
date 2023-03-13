import java.util.ArrayList;
import java.util.List;

interface stack{
	abstract void push(int e);
	abstract int pop();
}

class StaticStack implements stack{
	int top;
	int limit;
	int staticStack[];
	
	StaticStack(int limit){
		top = -1;
		this.limit = limit;
		staticStack = new int[limit];
	}
	
	@Override
	public void push(int ele) {
		if(top<limit-1) {
			staticStack[++top] = ele;
		}
		else {
			System.out.println("Static Stack Overflow!");
		}
	}
	public int pop() {
		if(top>-1) {
			System.out.println("Element popped from Static stack : "+staticStack[top]);
			return staticStack[top--];
		}
		else {
			System.out.println("Static stack Underflow!");
			return -1;
		}
	}
	
	public void printStack() {
		for(int i=0;i<=top;i++)
			System.out.print(staticStack[i]+" ");
	}
}

class DynamicStack implements stack{
	List<Integer> dynamicStack = new ArrayList<>();
	int top=-1;
	
	@Override
	public void push(int ele) {
		dynamicStack.add(ele);
	}
	public int pop(){
		if(dynamicStack.size()>0) {
			System.out.println("Element popped from Dynamic stack : "+dynamicStack.get(dynamicStack.size()-1));
			return dynamicStack.remove(dynamicStack.size()-1);
		}
		else {
			System.out.println("Dynamic stack Underflow!");
			return -1;
		}
	}
	public void printStack() {
		for(int ele: dynamicStack) {
			System.out.print(ele+"  ");
		}
	}
}


public class Stacks {
	public static void main(String[] args) {
		StaticStack s = new StaticStack(5);
		DynamicStack d = new DynamicStack();
		
		System.out.println("---------STATIC STACK----------");
		for(int i=0;i<6;i++)
			s.push(i+10);
		s.pop();
		s.printStack();
		
		
		System.out.println("\n---------DYNAMIC STACK----------");
		for(int i=0;i<5;i++)
			d.push(i+100);
		for(int i=0;i<8;i++)
			d.pop();
		d.printStack();
		

	}

}
