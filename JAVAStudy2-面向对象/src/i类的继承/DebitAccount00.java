/*
 *    信用账户
 *          子类、派生类、SubClass
 *          java语言中子类继承父类，会将父类所有数据都继承，包括私有的
 *          但是在子类中无法直接访问父类中的私有数据。但是可间接访问
 *          
 *          注意：构造方法无法被继承
 */
package i类的继承;

public class DebitAccount00 extends Account00 {
	
	//信誉度
	double debit;

}
