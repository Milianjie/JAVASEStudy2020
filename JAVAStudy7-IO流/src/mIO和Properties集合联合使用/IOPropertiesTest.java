package mIO��Properties��������ʹ��;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * ��IO����Map�༯��Properties������ʹ�á�
 * 
 * 		���������Ժ󾭳��ı������ݣ����Ե���д��һ���ļ��У�ʹ�ó���̬��ȡ��
 * 				������Ҫ�޸����ݽ����޸��ļ��еģ�java���벻��Ҫ�䶯��Ҳ����Ҫ����
 * 				����Ͳ��𣬷�����Ҳ�����������Ϳ����õ���̬��Ϣ
 * 			��������������������ļ�����֮Ϊ�����ļ���
 * 			�������ļ��е����ݸ�ʽ�ǣ�
 * 			key1=value1
 * 			key2=value2
 * 			��ʱ�򣬰����������ļ��������������ļ�
 * 	java�淶Ҫ�����������ļ�Ҫ��.properties��β�����ⲻ�Ǳ����
 * 	����Properties��ר�Ŵ�����������ļ���һ���࣬��������ļ���key�ظ��Ļ��ͷ���valueֵ����
 * 	�����������ļ���#��ע�ͣ����ݵȺ�֮�䲻���пո񣬵Ⱥſ��Ի���':'���������顿
 */

public class IOPropertiesTest {
	
	public static void main(String[] args) {
		
		//����һ���ļ��ַ�������
		FileReader reader = null;
		try {
			
			reader = new FileReader("src/mIO��Properties��������ʹ��/userinfo");
			
			//����Properties����,���༯����key��value����String���͵�
			Properties properties = new Properties();
			
			//��laod�������ܵ�/����׼����properties�����ļ�userinfo�е����ݷŽ�������
			properties.load(reader);//��ʱ�������ļ���ĵȺ�=���������Ϊ���ϵ�keyֵ���ұ�������Ϊ���ϵ�valueֵ
			
			//����keyֵ��ȡvalueֵ
			String value1 = properties.getProperty("username");
			//System.out.println(value1);//zhorongjie
			
			//���ļ����޸�value֮�����
			System.out.println(value1);//�ӳ���
			
			//�����ۡ��ڳ����о��������仯����Ϣ��ֱ��д�������ļ����У���Ҫ�޸ľ�ֱ���޸������ļ��Ϳ�����
			//����Ҫ���޸�java�����ˣ���Ȼ�Ļ���Ҫ�ı��ʱ������ֵ����±��룬���²��𣬷����������������鷳
			System.out.println(properties.getProperty("password"));
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}

}
