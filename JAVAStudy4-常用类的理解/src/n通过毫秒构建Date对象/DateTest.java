package nͨ�����빹��Date����;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date���еĹ��췽���д�����--long���͵ĺ�����
 */

public class DateTest {
	
	public static void main(String[] args) {
		
		//���¹����Ķ���ʱ����ʲô��
		Date time = new Date(1);//1970-01-01 00:00:00 001
		
		//�������ʵ����(����˵��ʽ��)ʱ���ģ��
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		//��Ϊ�����Ա����Ƕ�8�������������ʱ����8��Сʱ
		System.out.println(sdf1.format(time));//1970-01-01 08:00:00 001
		
		//��ȡ�����ʱ������
		Date time2 = new Date(System.currentTimeMillis()-1000*24*60*60);
		System.out.println(sdf1.format(time2));//2020-10-17 16:48:59 510

		
		
	}

}
