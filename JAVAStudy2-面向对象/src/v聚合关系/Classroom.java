/*
 *   Classroom������
 */
package v�ۺϹ�ϵ;

import java.util.List;

public class Classroom {
	
	int classid;
	
	//Classroom��List�������ڹ�����ϵ����ͬһ�㼶��
	//Classroom��Student���ھۺϹ�ϵ��һ�������壬һ���ǲ���
	//List<Student>��ʾѧ���ļ��ϣ��кܶ�ѧ��
	List<Student> stus;//ÿһ��Student���ǲ���
	
	//�ۺϹ�ϵ�����岻�������֣�����Ҳ����������
	//�����޷��������ֵ���������
	
	public Classroom(List<Student> s) {
		// TODO �Զ����ɵĹ��캯�����
		this.stus=s;
	}
	public Classroom(int id) {
		// TODO �Զ����ɵĹ��캯�����
		this.classid=id;
	}

}
/**
class Person{
	
	//�˺�List�ǹ�����ϵ
	//�˺���֫�Ǻϳɹ�ϵ���������壬��֫�ǲ���
	//�ϳɹ�ϵ�;ۺϹ�ϵ�����Ƶ�
	//����ĵط�������Ͳ����ǽ��������ģ�������������ھ������ֵ���������
	List<Hands> s;
}
*/