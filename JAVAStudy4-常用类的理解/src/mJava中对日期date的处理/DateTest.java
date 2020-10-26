package mJava�ж�����date�Ĵ���;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) throws Exception {
		
		//Date������java.util���µ��࣬ϵͳֻ�Զ�����java.lang��������java.util.DateҪ�Լ�����
		Date date = new Date();
		
		//date��Date���Ͷ�������ã����ò����Ž�����println�У�pringln�ڲ��ֽ�date���뾲̬����String.valueOf
		//�У�valueOf�ڲ�����Date���͵�����date����toString��������toString������Date������д��Object���е�
		//��������Ĳ����ڴ��ַ�����������ַ���
		System.out.println(date);//Sun Oct 18 14:33:47 CST 2020
		
		//Ĭ�ϵ����������ʽ�������Լ���Ҫ���ǿ��Ը�ʽ������
		//������������Date������ָ��������ת����Date-->ת���ɾ���һ����ʽ���ַ���-->String
		//��������SimpleDateFormat����и�ʽ����������java.text���µġ�ר�Ÿ������ڵĸ�ʽ��
		/*
		 * yyyy ��(����4λ��)
		 * MM ��(����2λ��)
		 * dd ��
		 * HH ʱ
		 * mm ��
		 * ss ��
		 * SSS ����(������3λ�ģ����999��1000����Ϊ1��)
		 *  ��ע����ǣ������ڸ�ʽ�У�����y M d H m s S��Щ�ַ��������д��ʣ�µķ��Ÿ�ʽ�Լ���֯
		 *  ֻ��һ����ĸ����ʽ���������������ʱ�ֺ���ĸ�λ�������һ���͵�ʮλ���������ƣ���ӹ���ֻ����
		 *  ��ʱ�䵥λǰ��0�������·���MMMʱ������������·ݱ�ʾ,��ʮ������
		 */
		
		//����������Ƕ���һ����Ҫ�ĸ�ʽģ�ͣ������ڶ�����ϷŽ�ȥ��Ȼ��������������-->ת��-->String
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");//����ʵ�
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd ");//
		SimpleDateFormat sdf3= new SimpleDateFormat("yy/MM/dd HH:mm:ss");//
		
		String dateStr1 = sdf1.format(date);
		String dateStr2 = sdf2.format(date);
		String dateStr3 = sdf3.format(date);
		System.out.println(dateStr1);//2020-10-18 14:57:48:614
		System.out.println(dateStr2);//2020-10-18 
		System.out.println(dateStr3);//20/10/18 14:57:48
		
		//����һ�������ַ���String����ôת��Date��
		//String-->Date
		String time = "2028-10-01 12:15:56 666";
		
		//����ͨ��SimpleDateFormat������������String-->ת��-->Date,��������Ҫ�����ַ�����ʽ
		//�������ṩ�������ַ�����ʽ��ģ�壬֮�����ת���������ܽ��ַ���ת��Date
		//SimpleDateFormat sdf1 = new SimpleDateFormat("��ʽҪ���ṩ�������ַ�����ʽ��ͬ�������������");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date dateTime = sdf4.parse(time);//��ʱ��ParseException�쳣δ���������쳣�����Ǵ�����ģ����ַ�����ʽ��һ��
										//������try/catch����Ҳ�������������׳����쳣��ʹ��������
		
		System.out.println(dateTime);//Sun Oct 01 12:15:56 CST 2028
	}

}
