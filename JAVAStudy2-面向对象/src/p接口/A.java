/*
 *   �ӿ�Ҳ��һ���������ͣ����԰�����ͬ�����࣬��Ϊ��������ɵ���.class�ļ�
 *       
 *       1.��ζ���ӿ�
 *         [���η�] interface �ӿ��� {}
 *       2.�ӿ���ֻ�ܳ��֣�����  ���󷽷�
 *       3.�ӿ���ʵ��һ������ĳ����࣬�����ڽӿ���ȫ�ǳ����
 *       4.�ӿ���û�й��췽�����޷���ʵ����
 *       5.�ӿںͽӿ�֮����Զ�̳�
 *       6.һ�������ʵ�ֶ���ӿڡ�(�����"ʵ��"���Կ����̳�)
 *       7.һ���ǳ������ʵ�ֽӿڣ���Ҫ���ӿ��е����з�����д/ʵ��/����
 */
package p�ӿ�;

public interface A {
	
	//����(������public static final����)
	public static final String SUCCESS="success";
	public static final double PI=3.14;
	//�ڽӿ��У�public static final����ʡ��
	byte MAX_VALUE=127;
	
	//���󷽷�(�ӿ������з�������public abstract)
	public abstract void m1();
	//�ӿ���public abstract��ʡ��
	void m2();

}

interface B{
	void m1();
}
interface C{
	void m2();
}
interface D{
	void m3();
}
interface E extends B,C,D{//�ӿڶ�̳�
	void m4();
}

//implements��ʵ�ֵ���˼����һ���ؼ���
//implements��extends������ͬ
class MyData implements B,C{//��ʵ�ֽӿڣ��轫���󷽷���д
	public void m1(){
		
	}
	public void m2(){
		
	}
}