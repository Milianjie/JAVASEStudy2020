package d�����д洢������������;

/**
 *						�������飺�����д��������������
 * 
 * @author ���ٽ�
 *
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		
		Animal[] animals = {animal1,animal2};
		
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			animal.move();
			//������������move����,����ϲ�
			animals[i].move();
		}
		System.out.println("==============================>");
		//����Animal�������飬�����鲻�ܴ���������͵����ݣ�ȴ���Դ������������������
		Animal[] animals2 = {new Cat(),new Bird()};
		
		//���ʵ��Ǽ̳и�����д�ķ�����������ת�ͣ���ֱ�ӷ���
		for (int i = 0; i < animals2.length; i++) {
			animals2[i].move();
		}
		System.out.println("==============================>");
		
		//Ҫ��������������еķ�����������ת��
		for (int i = 0; i < animals2.length; i++) {
			if (animals2[i] instanceof Cat) {
				Cat cat = (Cat)animals2[i];
				cat.eat();
			}else if (animals2[i] instanceof Bird) {
				Bird bird = (Bird)animals2[i];
				bird.sing();
			}
			
		}
		System.out.println("==============================>");
		
		}

}

class Animal{
	
		public void move() {
			
			System.out.println("�����ܰ���.......");
			
		}
	
}

class Cat extends Animal{
	public void move() {
		System.out.println("è����è��");
	}
	
	//Cat�����еķ���
	public void eat() {
		System.out.println("СèҪ����.......");
	}
}
class Bird extends Animal{
	public void move() {
		System.out.println("Bird Fly");	
	}
	
	//Bird�����еķ���
		public void sing() {
			System.out.println("С���ڳ���.......");
		}
}