package h��׼�ֽ������PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 	java.io.PrintStream:��׼���ֽ��������Ĭ����������������̨
 * 
 */
public class PrintStreamTest {
	
	public static void main(String[] args) {
		
		//һ�����������̨������ʹ��
		System.out.println("�ӳ���С����");
		
		//ʵ����System.out�õ����Ǳ�׼����һ���������ñ����������Ϳ��Ե���PrintStream�еķ������磺
		//println()���߲����е�print()����
		//��ע�⡿��׼������Ҫ�ֶ��ر�close()
		PrintStream pStream = System.out;//out��System���ж����һ��PrintStream���͵ĳ�������ֵout = null;
		
		//��pStream����׼���ķ���
		pStream.println("��־ΰ��ΰ��");
		pStream.println("�ܰ����޵�����");
		pStream.println("�����Ŵ�ս��Ѫսʿ");
		
		//֮ǰSystem��ʹ�ù������£�
//		System.gc();
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		System.currentTimeMillis();
//		System.exit(0);
//		PrintStream pStream2 = System.out;
	
		//Ĭ�����������̨����ʵ���Ըı�������ķ���Ҳ�����Ժ��õ�����־����,����
		
		//����������Ҫһ����׼��������󣬶�������׼������Ĺ��췽��������Ҫһ������������������Ȼһ��������Ƿ�����������ļ����������
		//ѡ��ı�׼��������ֽڵĻ����ַ��Ŀ��Լ�ѡ�񣬵��Ǳ�׼��������ļ������Ҫһ����ͬһ���ͣ���Ȼ��Ҳ��������ת��������ͺܷ���
		//��ô�ı�������������Ǵ�ӡ�ڴ�����ļ���������������·����ָ���ļ�
		//������׼�ֽ�������������ֽ��ļ����������·���ڱ����£��Զ�����
		PrintStream printStream;
		try {
			
			printStream = new PrintStream(new FileOutputStream("src/h��׼�ֽ������PrintStream/log1"));
			
			System.setOut(printStream);
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("���Ͳ�Ҫ̫��");
		System.out.println("��������С����");
		
		
		
	}

}
