import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface stack{
	abstract void push(int e);
	abstract int pop();
}

class StaticStack implements stack{
	int top1;
	int limit;
	int staticStack[];
	
	StaticStack(int limit){
		top1 = -1;
		this.limit = limit;
		staticStack = new int[limit];
	}
	
	@Override
	public void push(int ele) {
		if(top1<limit-1) {
			staticStack[++top1] = ele;
		}
		else {
			System.out.println("Static Stack Overflow!");
		}
	}
	public int pop() {
		if(top1>-1) {
			System.out.println("Element popped from Static stack : "+staticStack[top1]);
			return staticStack[top1--];
		}
		else {
			System.out.println("Static stack Underflow!");
			return -1;
		}
	}
	
	public void printStack() {
		for(int i=0;i<=top1;i++)
			System.out.print(staticStack[i]+" ");
	}
}

class DynamicStack implements stack{
	int dynamicStack[]=new int[5];
	int top2=0;
	
	@Override
	public void push(int ele) {
		if(top2==dynamicStack.length){
			int increasedSizeStack[] = new int[2*(dynamicStack.length)];
			System.arraycopy(dynamicStack,0, increasedSizeStack, 0, top2);
			dynamicStack = increasedSizeStack;
		}
		dynamicStack[top2++] = ele;
	}
	
	public int pop(){
		if(dynamicStack.length>0) {
			System.out.println("Element popped from Dynamic stack : "+dynamicStack[top2]);
			return dynamicStack[top2--];
		}
		else {
			System.out.println("Dynamic stack Underflow!");
			return -1;
		}
	}
	public void printStack() {
		for(int i=0;i<=top2;i++)
			System.out.print(dynamicStack[i]+" ");
		
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
		for(int i=0;i<9;i++)
			d.push(i+100);
		d.pop();
		d.pop();
		System.out.println();
		d.printStack();
		

	}

}
