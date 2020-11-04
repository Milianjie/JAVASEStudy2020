package h��׼�ֽ������PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
 * һ���򵥵���־��ӡ������
 */

public class Logger {
	
	public static void log(String mgs) {
		
		try {
			PrintStream printStream = new PrintStream(new FileOutputStream("log.txt",true));
			System.setOut(printStream);
			
			//��ȡʱ��
			Date nowTime = new Date();
			
			//Ϊʱ�䴴���ɶ�ģ��
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
			String time = sdf.format(nowTime);
			
			//���÷�������log2��ӡ��־
			System.out.println(time+":"+mgs);
		
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
	}

}
