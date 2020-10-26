/*
 *    ����Object���е�toString������
 *        SUN��Object�������toString������Ŀ�ģ�����java������ַ�����ʾ��ʽ
 *        
 *        ����ʵ�Ŀ��������У�Object�е�toString�����Ѿ���������
 *        ��ΪObject��toString����ʵ�ֵĽ��������
 *        
 *        Object�е�toString��������Ҫ��д��
 *        SUN������ʵ��toString�����ģ�
 *        
 *        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
        Object��toString�������أ�����.����@java������ڴ��ַ������ϣ�㷨�ó���int����ֵ
                                                            ��ת����ʮ�����ƣ�������������Ե�ͬ����Java����
                                                            �ڶ��е��ڴ��ַ 
 */
package rObject��;

public class Test01 {
	
	public static void main(String[] args){
		
		//����һ��Object���͵Ķ���
		Object o1 = new Object();
		
		//����toString����
		String ostr = o1.toString();
		System.out.println(ostr);//java.lang.Object@4bc0bec5
		
		//����Person���Ͷ���
		Person p1 = new Person("���·�",56);
		
		//����toString����
		String pstr = p1.toString();
		System.out.println(pstr);//ʮ��Object��.Person@77984161
		
		Person p2 = new Person("����",46);
		
		//print���������������һ���������ͣ���Ĭ�ϵ����������͵�tostring����������˵�ڴ��ַ����toString����
		System.out.println(p2);//Person[name=������age=46]
		System.out.println(p2.toString());//Person[name=������age=46]
	}

}
class Person{
	
	String name;
	int age;
	
	Person(String name,int age){
		
		this.name = name;
		this.age = age;
	}
	//��дtoString����
	//������Ŀ���������
	//��ʱ�涨����ʾ��ʽ��Person[name=���·���age=56]
	public String toString(){
		return "Person[name="+name+"��age="+this.age+"]";//��Ա����������this.��ʡ
	}
}