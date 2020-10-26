package ctrycatch�����쳣;

/*
 * 			���Ժ�Ŀ����У��������ʱ�쳣ѡ�����׻���try/catch�أ�
 * 				���ϣ�������ߴ���ѡ������throws
 * 				����ѡ��׽
 */

import java.io.*;

public class Test {
	
	/*
	public static void main(String[] args) throws FileNotFoundException,IOException{
		
		FileInputStream fis = new FileInputStream("abc");
	}
	��ֻ�׳�����
	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream("abc");
	}
	*/
    public static void main(String[] args){
		
    	try{
    		
    		//����ִ�е��˴�������FileNotFoundExcception���͵��쳣
    		//JVM���Զ�newһ��FileNotFoundExcception���͵Ķ��󣬲���new����ʱ�쳣��Ĺ��췽�����Ų�����"abc"
    		//���ö�����ڴ��ַ��ֵ��catch�����е�e����
    		FileInputStream fis = new FileInputStream("abc");
    		//����Ĵ�����������쳣��try����Ĵ��벻��ִ��
    		//ֱ�ӽ���catch����ִ�У��磺
    		System.out.println("FFFFFF");//�����
    		
    		fis.read();
    		
    	}catch(FileNotFoundException e){//�˴���e�ڴ��ַָ����е��ĸ�����
    		                            //��"FileNotFoundException���Ͷ���"
    		
    		System.out.println("��ȡ���ļ�������");//��ȡ���ļ�������
    	
    		//�쳣��FileNotFoundException�н�Object���е�toString������д������������£�
    		System.out.println(e);//java.io.FileNotFoundException: abc (ϵͳ�Ҳ���ָ�����ļ���)
    		
    	}catch(IOException e){
    		
    		System.out.println("����IO�쳣");//�����
    		
    	}
    	//�쳣��׽�������������ִ��
    	System.out.println("ABC");//ABC
	}

}
/*  ԭ�������
 *          JVM�ĵײ㣺
 *          FileNotFoundException e =  new xxx;
 *          catch(e);
 *
 *          catch�൱��һ��������
 *          public static void catch(Exception e){
 *          }
*/