
package i������ҵһά����ģ��ջ���ݽṹ;

public class TestSelf {
	
	public static void main(String[] args) {
		
		//����MyStack
		MyStackSelf myStack = new MyStackSelf(new Object[3]);
		
		System.out.print(myStack.push(2));
		
		System.out.print(myStack.pop());
		
		myStack.printArray();
	}

}
