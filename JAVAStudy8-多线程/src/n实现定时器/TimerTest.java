package nʵ�ֶ�ʱ��;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 	��ʱ������ָ����ʱ��ִ��ĳ�����򣬲��Ҽ�����ִ��һ�ε��߳�
 * 			1����򵥵Ķ�ʱ��������sleep()������ʹ����˯�ߣ����߳��ڹ涨ʱ�����У�̫�ͼ�����
 * 			2������java.util.Timer������ʱ�������������е�schedule�������ж�ʱ����
 * 			void schedule(TimerTask task, long delay, long period) ����ָ���������ָ�����ӳٺ�ʼ�����ظ��Ĺ̶��ӳ�ִ�С� 
 * 			3����Ŀǰ������ʹ�ý϶����Spring�����SpringTask��ܣ�����Ҫ�򵥵����þ�����ɶ�ʱ����
 * 
 * 		�������ʾ����Timer������ʵ�ֶ�ʱ����
 */

public class TimerTest {
	
	public static void main(String[] args) {
		
		//������ʱ������
		Timer timer = new Timer();
		//Timer timer2 = new Timer(true);//���ػ��̵߳���ʽ����
		
		//ָ����ʱ����
		//timer.schedule(��ʱ����, ��һ��ִ��ʱ��, ������ִ��һ��/����);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date firstTime =null;
		
		try {
			firstTime =sdf.parse("2020-11-01 15:09:00");
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				
			}
		}, firstTime, 1000*10);//���������һ����������߽ӿڣ�������дһ������̳л�ʵ��֮�⣬����дһ�������ڲ���
		
	}

}

//����TimerTask��һ�������࣬�޷�ֱ��new������Ҫ��дһ����ʱ������
//������д����һ����¼��־������
class LogerTimerTask extends TimerTask{
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date nowTime = new Date();
		
		System.out.println(simpleDateFormat.format(nowTime)+":�ѳɹ������ݱ���!");
	}
	
}
