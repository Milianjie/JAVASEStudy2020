package iFile�ೣ�õķ���;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 	1��File����Ĵ����û�й�ϵ������File�಻������ļ��Ķ���д
 * 	2��File��Ķ����ʾʲô��
 * 			������ʾ�����ļ��Լ�Ŀ¼·���ĳ����ʾ��ʽ����
 * 			C:\Drivers  ����һ��File����	
 * 			C:\Drivers\study.txt  ��Ҳ��һ��File����
 * 		һ��File�����Ӧ�Ŀ�����һ���ļ���Ҳ������һ��Ŀ¼
 * 		Fileֻ��һ��·�����ĳ����ʾ��ʽ
 * 	3��File������Ҫ���յļ�������
 */

public class FileTest01 {
	
	public static void main(String[] args) {
		
		File file = new File("D:/file");
		
		//�ж�·���е�file�ļ������ļ����Ƿ����
		System.out.println(file.exists());//false
		
		//��·��������file�ļ��л����ļ�
		//���������D:\file�����ڣ���file���ļ�����ʽ��������
//		if (!file.exists()) {
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				// TODO �Զ����ɵ� catch ��
//				e.printStackTrace();
//			}
//		}
		
		//����������D:\file�����ڣ���file��Ŀ¼����ʽ�½�
		if (!file.exists()) {
				file.mkdir();//�÷���������
		}
		
		
		//��������Ŀ¼
		File file2 = new File("D:/a/b/c/d/e/f");
		if (!file2.exists()) {
			file2.mkdirs();//�÷��������
		}
		
		
		//��ȡ�ļ��ĸ�·��
		File file3 = new File("D:/a/b/c/d/e/f/java.txt");
		if (file3.exists()) {
		String string = file3.getParent();
		System.out.println(string);//D:\a\b\c\d\e\f
		//Ҳ������һ�ַ�����ֻ����������������File��ģ�����String����
		File parentFile = file3.getParentFile();
		//Ȼ�����getAbsolutePath�������÷����ǻ�ȡ����·��
		System.out.println("��ȡ����·����"+parentFile.getAbsolutePath());//D:\a\b\c\d\e\f
		
		
		//��ȡ����·��
		File file4 = new File("�ҵ���������");
		System.out.println("����·����"+file4.getAbsolutePath());//����·����G:\Users\Administrator\eclipse-workspace\JAVAStudy7-IO��\�ҵ���������
		
		
		//��ȡ�ļ���
		String string2 = file3.getName();
		System.out.println(string2);//java.txt
		
		
		//�ж��Ƿ���һ��Ŀ¼
		System.out.println(file4.isDirectory());//false
		
		
		//�ж��Ƿ���һ���ļ�
		System.out.println(file4.isFile());//true
		
		
		//��ȡ�ļ����һ���޸�ʱ�䣬��������1970��1��1��08ʱ00��00��000���뵽���һ���޸�ʱ����ܺ�����,long����
		long time = file3.lastModified();
		System.out.println(time);//1603693942199
		//����Щ�����ڴ���Date����ʱ��Ϊ��������ȥ���ɵõ�����ʱ�䣬���ǵý�һ�����ӻ�����ʽ��ʾ
		Date lastModifyTime = new Date(time);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss�� SSS����");
		System.out.println(file3.getName()+"���һ���޸�ʱ�䣺"+simpleDateFormat.format(lastModifyTime));
		
		
		//��ȡ�ļ���С
		System.out.println(file3.length());//0�ֽ�
		
		
		//File��ListFiles���������Ի�ȡ��ǰĿ¼�µ��������ļ��Լ��ļ���
		//���ص���File����,�����б���������ļ��ľ���·��
		//File[] listFile()
		File file5 = new File("F:\\A����������Ŀ����ģ�壨�ԣ�");
		File[] files = file5.listFiles();
		for (File f : files) {
			System.out.println(f);
			System.out.println(f.getName());
		}
			
		
		}
	}

}
