package gװ��Ͳ���ĸ���;

/*
 * 			���ְ�װ���������������������ֶ�Ӧ�İ�װ�࣬���ǵĸ��඼��Number���о�Number�й����ķ�����
 * 			���Է���Number����һ�������࣬�޷���ʵ����
 * 			byte byteValue() �� byte ��ʽ����ָ������ֵ�� 
 * 			abstract  double doubleValue() �� double ��ʽ����ָ������ֵ�� 
 * 			abstract  float floatValue() �� float ��ʽ����ָ������ֵ�� 
 * 			abstract  int intValue()  �� int ��ʽ����ָ������ֵ�� 
 *			abstract  long longValue() �� long ��ʽ����ָ������ֵ�� 
 *			short shortValue() �� short ��ʽ����ָ������ֵ�� 
 *		��Щ�������е������װ�඼�У���Щ�����������
 *
 */

public class IntegerTest {
	
	public static void main(String[] args) {
		
		//����Integer��װ��Ĺ��췽����123�ӻ�������������������������
		Integer integer = new Integer(123);//������������-->������������(��֮Ϊװ��)
		
		//������������ -->������������(��֮Ϊ����)
		float f = integer.floatValue();//floatValue������Integer��д�丸��Number�н�������ֵת��Ϊfloat����
		System.out.println(f);//123.0
		
		int i = integer.intValue();//����int��short��byte��long��float��double�����ֶεķ�������
		System.out.println(i);//123
		
	}

}
