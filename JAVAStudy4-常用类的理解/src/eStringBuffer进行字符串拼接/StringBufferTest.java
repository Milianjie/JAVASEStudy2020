package eStringBuffer�����ַ���ƴ��;

/*
 * 		��ʹ��+�����ַ���ƴ��ʱ���ᴴ��һЩ������ַ���������ɷ��������ַ��������ص��ڴ��˷�
 * 		�����Ҫ���д������ַ���ƴ��ʱ������ʹ��JDK���Դ���:
 * 					java.lang.StringBuffer ��
 * 					java.lang.StringBuilder
 * 
 * 		�Ż�StringBuffer������:�ڴ���StringBuffer��ʱ�����һ����ʼ������
 * 							   �Լ��ٵײ�����ݴ������Լ�Ԥ����һ����һ��ĳ�ʼ������
 */

public class StringBufferTest {
	
	public static void main(String[] args) {
		
		//final���ε����ñ���һ������ֵ������ָ����������������������
		
		//����һ��StringBuffer���󣬶��ײ��и���Ĺ��췽������super(16)�����丸��AbstractStringBuilder�Ĺ��췽��
		//�丸��Ĺ��췽���Ǵ���һ������capacity=16��char(������byte)���飬����ʲô���Ϳ�JDK�汾����
		//����˵���洴��������Ǵ���һ������Ĭ��Ϊ16�ķ�private final���ε�char[]-->value
		StringBuffer stringBuffer = new StringBuffer();//Ĭ��16
		
		//ƴ���ַ���ͳһʹ��append()������append��׷�ӵ���˼
		//����˵��char����������16��Ҫƴ���ַ������������ã�����Ҫ��append()�������÷����ײ���ø����append����
		//�����append��ȷ�������������÷����͵������鿽������Arrays.copyOf()�����Կ����Զ����ݣ������������֮ǰ������ͱ�����������������
		stringBuffer.append('a');
		stringBuffer.append(true);
		stringBuffer.append(3.14);
		stringBuffer.append(100);
		stringBuffer.append("�صº�");
		System.out.println(stringBuffer);//atrue3.14100�صº�
		//��Ϊ׷�ӵ��ַ����Ž�����char�����У���ռ���ַ��������أ����Ҹ������String����final���ε�������ַ�����
		//��ֵ����Ȼ���Ըı䣬������������ַ�����ƴ�ӣ�final���ε�����һ������ֵ������ָ����������������������
		
		//ָ����ʼ��������StringBuffer����(�ַ�������������)
		StringBuffer stringBuffer2 = new StringBuffer(100);
		
	}

}
