/*
 *  �����쳣�ڶ��ַ�ʽ����׽...try...catch...
 *       
 *       �﷨��
 *           try{
 *           
 *           ���ܳ����쳣�Ĵ���;
 *           
 *           }catch(�쳣����1 ����){
 *              �����쳣�Ĵ���;
 *           }catch(�쳣����2 ����){
 *              �����쳣�Ĵ���;
 *           }....
 *           
 *           1.catch�������д�������Ϊtry�����е�������������������ʱ���п����׳��쳣������쳣
 *           ����Ҫ���Ǵ��ϵ���catch�е��쳣���ͱ����С����׽��������ϱ߱���׽��С���൱��Ҳ����׽
 *           Ҳ�Ͳ�����дС���쳣��׽��
 *           ��Ȼ����ֱ��дһ��catch�������������쳣�࣬���ǲ����飬��Ϊ��ȷ���쳣��ȷ����
 *           �����п��ܳ��ֵ��쳣���ֱ�catch����ʱ�Ϳ��Ը��ݾ�ȷ�쳣�ķ�����ȷ���ҳ��������ڵľ���ԭ��
 *           
 */
package ctrycatch�����쳣;

import java.io.*;

public class ExceptionTest03 {
	
	public static void main(String[] args){
		
		try{
			FileInputStream fis = new FileInputStream("C:/ab.txt");
		}catch(FileNotFoundException e){
			
		}
		
		/*���´����޷���������ΪFileNotFoundExceptionû�б�����
		try{
			FileInputStream fis = new FileInputStream("C:/ab.txt");
		}catch(ArithmeticException e){//��׽���������쳣
			
		}*/
		

		/*���´����޷�������
		 * ��Ϊ����IOExceptionû�б�����(read�����̳�IOException)
		try{
		
			FileInputStream fis = new FileInputStream("C:/ab.txt");
			fis.read();
			
		}catch(FileNotFoundException e){
			
		}*/
		
		
		//���´�������ͨ��
		try{
			
			FileInputStream fis = new FileInputStream("C:/ab.txt");
			fis.read();//read�������������׳���IoException
			
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			
		}
		//��д��������������ķ�ʽ��
        try{
			
			FileInputStream fis = new FileInputStream("C:/ab.txt");
			fis.read();
			
		}catch(IOException e){//������׽���쳣�ȽϿ�
			
		}
		
        
        /*�����޷�ͨ��
         * catch����д��������Ǳ��������쳣�Ĵ�����ϵ��£���С����׽
         * ��˼���Ƕ���API��������ÿ�����쳣�Ĵ�����쳣���ĸ����ĸ�С��Ȼ��׽
        try{
			
			FileInputStream fis = new FileInputStream("C:/ab.txt");
			fis.read();
			
		})catch(IOException e){//�˴��Ѿ���׽�������쳣
			
		}catch(FileNotFoundException e{//�����Ѿ���׽���ˣ������ٲ�׽
			
		}*/
	}

}
