//��������
package q�ӿڵ�����;

/**
 * 
 * @author ���ٽ�
 *
 */

public class Car {//�˴�����Ҫʵ��
	
	//Filed
	//����
	//����ӿڱ�̣�������YAMAHA02 y;,���治�ܱ��̶�
	Engine02 e;
	
	//Contructor
	Car(Engine02 e){//�˴���e��ʼ������ڴ��ַ���������e
		this.e=e;
	}
	//����Ӧ���ܲ������� 
	public void TestEngine(){
		e.start();//����ӿڵ���
		          //e��������˭�ĵ�ַ�͵���˭��start����
	}

}
