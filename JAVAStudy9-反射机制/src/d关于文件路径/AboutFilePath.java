package d�����ļ�·��;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * ���ļ���·�����⡿
 */

public class AboutFilePath {
	
	public static void main(String[] args) {
		
//		try {
//			//����������
//			FileReader  reader = new FileReader("src/cͨ������ʵ��������/classinfo.properties");
//		} catch (FileNotFoundException e) {
//			// TODO �Զ����ɵ� catch ��
//			e.printStackTrace();
//		}
		/*
		 * ��������·����ʽ��ȱ�㣺��ֲ�Բ��IDEA��Ĭ��·���ǵ�ǰproject�ĸ���eclipse��Ĭ������Ŀ�ĸ���
		 * �����������뿪��eclipse��IDEA��������������λ�ã����ܵ�ǰ·���Ͳ��Ǹ���Ŀ��project���ˣ���ʱ��·������Ч��
		 */
		
		//�����һ�ֱȽ�ͨ�õķ�ʽ����ʹ���뻻��λ��Ҳһ��ͨ��
		//���޾����ļ����������·���£������̻�����Ŀ�µ�src����
		//src������·���ĸ���src�������eclipse����IDEAĬ�ϵ�·����
		/*
		 * ���ͣ�
		 * 		1�� Thread.currentThread()--��ȡ��ǰ�̶߳���
		 * 		2��getContextClassLoader()--��ǰ�̶߳���ķ����������ǻ�ȡ���̶߳���������������java�е���������кܶ��֣�
		 * 		3��getResource("db.properties")--����ȡ��Դ�����������������ķ����������ǵ�ǰ�̵߳��������Ĭ�ϴ���ĸ�·���¼�����Դ
		 * 		4��getPath()--��ȡ������·��
		 */
		String path = Thread.currentThread().getContextClassLoader().getResource("db.properties").getPath();
		
		//�������ϴ�����ȡ��һ������·�����ļ��ľ���·��
		//��Ϊ�ļ�·�������ģ������õ���Щ���룬�����Ժ�·����Ҫ�����ĺͿո�������ѧϰ�����Ժ���
		System.out.println(path);///G:/Users/Administrator/eclipse-workspace/JAVAStudy9-%e5%8f%8d%e5%b0%84%e6%9c%ba%e5%88%b6/bin/db.properties
		
	}

}
