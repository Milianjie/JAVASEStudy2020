package lString��int��Integer�໥ת��;

public class Test {
	
	public static void main(String[] args) {
		
		//String-->int: Integer.parseInt(s)
		System.out.println(Integer.parseInt("123456"));
		
		//String-->Integer:  Integer.valueOf(s)
		System.out.println(Integer.valueOf("4565"));
		Integer a = new Integer("1566");//�ײ�Ҳ�ǵ���Integer.valueOf(s)
		
		//int-->String:  1������+"";2��String.valueOf(i)
		System.out.println(15 + "456");
		System.out.println(String.valueOf(1232656));
		
		//int-->Integer:  1��Integer.valueOf(i)��2���Զ�װ��
		Integer b = new Integer(465);//�Ϸ�������̭���ײ����Integer.valueOf(i)
		Integer c = Integer.valueOf(155);//������һ����ֻ����ֱ�ӵ㣬��̭
		Integer d = 465;//�Զ�װ��
		
		//Integer-->String:  1��String.valueOf(e)
		Integer e = 4898;
		System.out.println(String.valueOf(e));
		
		//Integer-->int:  1���Զ����䣻2��intValue()
		Integer f = 44;
		System.out.println(f + 56);//100,�Զ����䣬�Զ�����intValue����
		int g = f.intValue();//��Ա���������������.����
		
	}

}
