package bmain�����е�String����args;

import java.awt.print.Printable;

/*
 * main�����е�"String[] args":
 * 								1����ڵ�main������Java�����(JVM)����
 * 								2��JVM����main����ʱ���Զ���һ��String�������
 * 			ʲôʱ��args�����л���ֵ����˵��Ԫ���أ�
 *			1��args�����������û��ģ��û��ڿ���̨���������������������Զ�ת��Ϊ"String[] args"
 *			2��������doc�������г���java ArrayTest abc def dyg,��ʱJVM���Զ���"abc def dyg"
 *			   ͨ���ո�ķ�ʽ���з��룬Ȼ���ŵ�����args�У�����main�����е�String[] args�����������û�����Ĳ�����
 *			3����IDE����Ҫ�����������Ϊ�˵���������()-->Edit Configurations(��������)-->ѡ��main��������(application)-->ѡ��Program argments(�����Ա���)-->�����ַ���-->Ӧ��			 			
 */

public class ArrayTest {
	//�÷����ɳ���Աд��������JVM����
	public static void main(String[] args) {
		
		//JVMĬ�ϴ�������String���鳤��Ϊ0
		//ͨ�����Եó�������args����null
		System.out.println("JVM���ݹ�����String��������args�ĳ���Ϊ"+args.length);
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println(string);
		}
		
		//���´����ʾ���鴴���ˣ���������û������
		String[] strings = new String[0];
		printLength(strings);
		String[] strings2= {};
		printLength(strings2);
	}
	
	public static void printLength(String[] array) {
		
		System.out.println(array.length);
		
	}

}
