/*
 *  �����쳣�����ַ�ʽ
 *        1.�����׳���throws
 *        2.��׽��try...catch...finally
 *        
 *        �����ļ���ʾ�������׳����ڷ���������λ����ʹ��throws�����׳��쳣
 */
package bthrows�����쳣;

import java.io.*;

public class ExceptionTest01 {
	
	public static void main(String[] args) throws FileNotFoundException{
	//public static void main(String[] args) throws IoException{  �׳��쳣�ĸ���
	//public static void main(String[] args) throws Exception{    �׳��쳣�ĸ���ĸ��඼��
	
		//java������������ô���ܣ���ΪFileInputStream��Ĺ��췽��
		//��������λ����ʹ����throws FileNotFoundException
		//����Ҫ�ڴ˳���ı�д�׶��ڸ÷����������׳����쳣����쳣�ĸ���򸸸����쳣����Ȼ���벻ͨ��
		//��ȻҲ������try/catch��䣬�ý������׳��쳣��������try�����У�Ȼ��catch�쳣���Ͳ���
		//�ڷ�����������throws��
		
		//�����ļ�������(����stream)����ȡ�ļ�
		FileInputStream fis = new FileInputStream("C:/ab.txt");//C����û�д��ļ�
		//�׳��쳣�����û�����쳣
		
		//���ϳ�����벻ͨ��
		/*
		 * δ������쳣����
          FileNotFoundException
		 */
	}

}
