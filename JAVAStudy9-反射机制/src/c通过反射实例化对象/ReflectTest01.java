package cͨ������ʵ��������;

/*
 * ��ȡ��Class������
 */

public class ReflectTest01 {
	
	public static void main(String[] args) {
		
		
		//���������÷�����Ƶķ�������ǰ��������ķ�ʽ�������
		try {
			//ͨ��������ƻ�ȡClass��Ȼ����Classʵ��������
			Class c = Class.forName("bean.User");//c����User����
			
			//newInstance()������������User���޲������췽����ʵ����User���󣬷��ص���һ������ָ����
			//���User����д���в��������췽������û���޲������췽�����Ͼͻᱨ�޷�ʵ�����쳣�͹��췽���޷��ҵ��쳣
			//���ص㡿���뱣֤�޲ι����Ǵ��ڵģ��Ժ�д����һ��Ҫ���޲ι��췽����
			Object object = c.newInstance();
			System.out.println(object);
			
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}

}
