
package i数组作业一维数组模拟栈数据结构;

public class TestSelf {
	
	public static void main(String[] args) {
		
		//测试MyStack
		MyStackSelf myStack = new MyStackSelf(new Object[3]);
		
		System.out.print(myStack.push(2));
		
		System.out.print(myStack.pop());
		
		myStack.printArray();
	}

}
