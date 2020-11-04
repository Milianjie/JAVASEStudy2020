package eͨ�������ȡ�ֽ����ļ���Filed;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
 * ����Student���е�����Filed
 */

public class ReflectTest {
	
	public static void main(String[] args) {
		
		//�Ȼ�ȡStudent.classs
		Class class1 = null;
		try {
			class1 = Class.forName("bean.Student");
			
			//��ȡclass1�������������ַ�����ʾ��getName()
			String className1 = class1.getName();
			System.out.println(className1);//bean.Student
			
			//��ȡclass1�ļ���������ַ�����ʾ��getSimpleName()
			String className2 = class1.getSimpleName();
			System.out.println(className2);//Student
			
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//ͨ��Class�еķ�����ȡFiled
		/*
 			1�� Field getField(String name)  ����һ�� Field ��������ӳ�� Class ��������ʾ�����ӿڵ�ָ��������Ա�ֶΡ�
 			Field field = class1.getField("num");-->����class1��һ��public���ε�ָ���ֶε�Filed����
 			 
 			2��Field[] getFields() ����һ������ĳЩ Field ��������飬��Щ����ӳ�� Class ��������ʾ�����ӿڵ����пɷ��ʹ����ֶΡ�
 			Field[] file = class1.getFields(); -->��class1�е�����public���ε�Filed�Ž�Filed������
 			
 			3��Field getDeclaredField(String name) ����һ�� Field ���󣬸ö���ӳ�� Class ��������ʾ�����ӿڵ�ָ���������ֶΡ�
 			 
 			4��Field[] getDeclaredFields() ���� Field �����һ�����飬��Щ����ӳ�� Class ��������ʾ�����ӿ��������������ֶΡ�
 			
 			 �������������Ƿ������б����ʿ������η��Լ��������ε�Filed��
		 */
		//�����÷�������ķ�ʽ
		Field[] fields1 = class1.getFields();
		System.out.println(fields1.length);//2 --��ΪStudent����ֻ������Field��public����
		
		Field[] fields2 = class1.getDeclaredFields();
		System.out.println(fields2.length);//5 --��������Ȩ�޿��Ʒ�ֱ�ӽ�Field�Ž�����
		
		//ȡ��ĳһ��Field����,����ȡ���Field���������
		//ȡ��
		Field firstField = fields2[0];
		//��ȡField����,�÷�����Field����ķ���������String
		String firstName = firstField.getName();
		System.out.println(firstName);//num
		
		//��������,����ֱ�������ȡ����Field����
		for (Field field : fields2) {
			System.out.println(field);
		}
		/*������ֱ�������ȡ����Field�������Field��������������η��Լ�����������ֶ����ȵȣ�
		 * �����ÿһ�������Էֱ��ȡ��������Ļ�ȡField�����ּ��ֶε�����
		public int bean.Student.num
		protected int bean.Student.age
		boolean bean.Student.sex
		private java.lang.String bean.Student.name
		public static final double bean.Student.PI
		*/
		
		//�������飬�����ȡÿ��Field������ֶ���
		for (Field field : fields2) {
			System.out.println(field.getName());
		}
		/*������£�
		num
		age
		sex
		name
		PI
		*/
	
		//��ȡFiled��������,��getType()���������ص���һ��Class���͵Ķ���
		//��ΪClass�����е�getName�Ƿ�������������͵������������ַ�����ʾ������һ���Ǽ�������ķ��ط���
		//����������Class����firstClass����getSimpleName()��֪��Field���������
		Class firstClass = firstField.getType();
		String firstClassName = firstClass.getName();
		System.out.println("��һ��Field�����ͣ�"+firstClassName);//int
		
		//��ȡ���Ե����η��б�getMOdifiers();�÷������ص���������Щ���η��Ĵ��ű�ʾ
		//java.lang.reflect������һ��MOdifier�࣬���������һ����̬����
		//static String toString(int mod) --��������ָ�����η��еķ������η���־���ַ����� 
		int fieldNum = firstField.getModifiers();
		System.out.println(fieldNum);//1 public�Ĵ�����1
		
		//��Modifier���еľ�̬toString������1ת���ַ���
		String moString = Modifier.toString(fieldNum);
		System.out.println(moString);
		
		//��һ��Student���еĵ�����ֶΣ����кܶ����η����Σ�����Ĵ�����զ����
		Field field5 = fields2[4];
		System.out.println(field5.getModifiers());//25
		System.out.println(Modifier.toString(field5.getModifiers()));//public static final
		
	}

}
