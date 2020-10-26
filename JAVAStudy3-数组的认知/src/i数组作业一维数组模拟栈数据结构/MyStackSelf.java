package i数组作业一维数组模拟栈数据结构;

public class MyStackSelf {
	
	Object[] elements;

	
	
	public MyStackSelf() {
		this(new Object[]{6,6,6,6,6,6});//在不输入参数创建对象时，默认创建一个长度为6，每个数组元素都为6的数组放进elements	
	}

	public MyStackSelf(Object[] elements) {
		super();
		this.elements = elements;
	}
	
	int index = 0;
	
	//压栈，表示栈中多一个元素
	public Object push(int input) {
		if (elements[elements.length-1]!=null&&(int)elements[elements.length-1]!=0) {
			index = elements.length-1;
			return "此栈已满，压栈失败!\n";
		}else {
			elements[index] = input;
			index++;
			return "elements["+index+"]已压入栈中!\n";
		}
	}
	//弹栈，表示栈中少一个元素
	public Object pop() {
		if (elements[0]==null||(int)elements[0]==0) {
			return "该栈已空，弹栈失败!\n";
		}else {
			elements[index]=null;
			index--;
			return "已将elements["+index+"]从栈中弹出!\n";
		}
	}
	
	//遍历数组的方法
	public void printArray() {
		System.out.println("初始数组的元素如下：");
		for (int i = 0; i < elements.length; i++) {
			System.out.print(elements[i]+" ");
		}
		System.out.println();
		
	}
	
	

}
