package f�����������͵İ�װ���ʶ;

/*
 * 		1��Java��Ϊ8�ֻ�����������׼����8�ֶ�Ӧ�İ�װ�ࡣ8�ְ�װ�����������������ͣ�������Object
 * 		2��ʵ�ʵ�Ӧ�ÿ����в���Ҫ�Լ�����8�а�װ�࣬SUN��˾�Ѿ�������д����
 * 
 * 		���ֻ�������������������Ӧ�İ�װ��
 * 		������������					��װ����
 * ------------------------------------------
 * 		byte						java.lang.Byte(����Number)
 * 		short						java.lang.Short(����Number)
 * 		int							java.lang.Integer(����Number)
 * 		float						java.lang.Float(����Number)
 * 		double						java.lang.Double(����Number)
 * 		boolean						java.lang.Boolean(����Object)
 * 		char						java.lang.Character(����Object)
 * ���ְ�װ�����ص������java.lang.Integer���������������ƣ��պ�«��ư
 */

public class IntegerTest {
	
	public static void main(String[] args) {
		
		//��ʱ�����doSome������ʱ����Ҫ��һ�����ֽ�ȥ
		//�������ڻ����������ͣ���doSome()�еĲ�����������������������Object
		//��ô������doSome()�������޷����ջ����������͵ģ���ν���أ����Դ�һ�������ֶ�Ӧ��һ����װ���ȥ
		doSome(100);
		
		//�Լ�������һ��MyInt�࣬���ڰ�100�������췽����װ�ɶ���
		MyInt myInt = new MyInt(100);
		//doSome()�������ܴ�һ��100���ֽ�ȥ����100��װ����һ��100��Ӧ�İ�װ��
		
		doSome(myInt);//f�����������͵İ�װ���ʶ.MyInt@1edf1c96--����100�İ�װ��MyInt�е�toString����û����д����������ö���ĵ�ַ
					//100--��дtoString������100
		
	}
	
	public static void doSome(Object obj) {
		// TODO �Զ����ɵķ������
		
		System.out.println(obj);

	}

}
