/*
 *    ����Object�е�finalize����
 *    
 *       finalize����ʱ�����?
 *       1.finalize����ÿ��������
 *       2.finalize��������Ҫ����Աȥ���ã�ϵͳ�Զ�����
 *       3.java����û�и��������ָ��������������������
 *         �ȴ������������Ļ��գ������������ٻ������java����֮ǰ��
 *         �Զ����øö����finalize����
 *      finalize�����Ǹö������Ͼ�Ҫ�������ˣ�
 *      ����:��Ҫ�ͷ���Դ��������ڸ÷������ͷ�
 *     
 */
package rObject��;

public class Test04 {
	
	public static void main(String[] args){
		
		 Animal p1 = new  Animal();
		p1 = null;//û��������ָ�������ȴ�����
		
		//����Աֻ��"����"��������������
		System.gc();//ʮ��Object��.Animal@4203fcfb�������Ҫ��������!
	}

}

class Animal{
	//��дObject�е�finalize����
	public void finalize() throws Throwable {
		 System.out.println(this+"�������Ҫ��������!");
		 //this�ǵ�ǰAnimal���͵Ķ������ã�Ĭ�ϵ��ü̳е�Object���е�toString����
		 
		 //����������ָ��ö���,�Ͳ��ᱻ����
		 Animal p1 = this;
	 }
}