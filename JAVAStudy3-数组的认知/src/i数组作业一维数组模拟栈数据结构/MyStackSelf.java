package i������ҵһά����ģ��ջ���ݽṹ;

public class MyStackSelf {
	
	Object[] elements;

	
	
	public MyStackSelf() {
		this(new Object[]{6,6,6,6,6,6});//�ڲ����������������ʱ��Ĭ�ϴ���һ������Ϊ6��ÿ������Ԫ�ض�Ϊ6������Ž�elements	
	}

	public MyStackSelf(Object[] elements) {
		super();
		this.elements = elements;
	}
	
	int index = 0;
	
	//ѹջ����ʾջ�ж�һ��Ԫ��
	public Object push(int input) {
		if (elements[elements.length-1]!=null&&(int)elements[elements.length-1]!=0) {
			index = elements.length-1;
			return "��ջ������ѹջʧ��!\n";
		}else {
			elements[index] = input;
			index++;
			return "elements["+index+"]��ѹ��ջ��!\n";
		}
	}
	//��ջ����ʾջ����һ��Ԫ��
	public Object pop() {
		if (elements[0]==null||(int)elements[0]==0) {
			return "��ջ�ѿգ���ջʧ��!\n";
		}else {
			elements[index]=null;
			index--;
			return "�ѽ�elements["+index+"]��ջ�е���!\n";
		}
	}
	
	//��������ķ���
	public void printArray() {
		System.out.println("��ʼ�����Ԫ�����£�");
		for (int i = 0; i < elements.length; i++) {
			System.out.print(elements[i]+" ");
		}
		System.out.println();
		
	}
	
	

}
