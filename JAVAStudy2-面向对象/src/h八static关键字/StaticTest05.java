
    //���ڴ����˳��
package h��static�ؼ���;

public class StaticTest05 {
	
	//����ͨ��
	static int i=10;
	static{
		System.out.println(i);
	}
	/*
	 * ���벻ͨ��
	
	static{
		System.out.println(i);�Ƿ���ǰ����
	} 
	 * static int i=10;
	 */
	public static void main(String[] args) {
		
		System.out.print(StaticTest05.i);
		
	}

}
