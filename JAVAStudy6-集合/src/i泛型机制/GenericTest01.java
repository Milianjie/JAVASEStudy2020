package i���ͻ���;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 1��JDK5֮���Ƴ��������ԣ�����
 * 2�����������﷨���ƣ�ֻ����������׶������ã������Ǹ����������ο��ġ����н׶η����ǲ������õ�
 * 3�����͵ĺô���
 * 			1��ʹ�����д洢��Ԫ��ͳһ
 * 			2������������ʱ�����ʹ���˷��ͣ�ȡ����Ԫ�������Ƿ���ָ�������ͣ����÷������͵ķ����Ͳ���Ҫ����������ת����
 * 4�����͵�ȱ�㣺
 * 			1�������д洢Ԫ��ȱ���˶�����
 * 			����ֻ�Ǽ��˳���ĳһ�׶�ʵ�֣���Щ��ǿ������ת���Ĺ��̻��ǲ��ɱ���
 */

public class GenericTest01 {
	
	public static void main(String[] args) {
		
		//���³����м���ʹ���˷���
		//����List���ͼ���
		List<Animal> list = new ArrayList<Animal>();
		
		//����cat��bird�Ķ���,������Ž�����,ֻ�ܷŷ���ָ�����ͼ�������Ķ��󣬷������ͻ���뱨��
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		list.add(cat);
		list.add(bird);
		
		//����/��������  ������ҲҪʹ�÷���
		for (Iterator<Animal> iterator = list.iterator(); iterator.hasNext();) {
			Animal animal = iterator.next();
			//���ü̳�Animal���еķ����Ͳ���Ҫ��������ת����
			animal.move();
			
			//�����������������еķ��������ǵ���������ת�������еĻ����У����Ͳ��ܽ������
			if (animal instanceof Cat) {
				Cat c = (Cat)animal;
				c.catchMouse();
			}
			if (animal instanceof Bird) {
				Bird b = (Bird)animal;
				b.fly();
			}
		}
	}

}

class Animal{
	//Animal�еķ���
	public void move() {
		System.out.println("animals is moving.");
	}
}

class Cat extends Animal{
	//Cat���еķ���
	public void catchMouse() {
		System.out.println("The cat is catching the mouse!");
		
	}
}

class Bird extends Animal{
	//Bird���еķ���
	public void fly() {
		System.out.println("The bird is fyling!");
		
	}
}

