/*
 *   客户业务接口
 *   
 *   接口的作用：
 *          1.使项目分层，所有层都面向接口开发，开发效率提高了
 *          2.接口使代码和代码之间的耦合度降低，就像内存条和主板的关系，
 *            变得可插拔，可以随意切换
 *            
 *         接口和抽象类都可以完成某个功能，优先选择接口
 *         因为接口可以多实现，多继承
 *         并且一个类可以实现多个接口外，还保留了继承(继承其他类)
 */
package q接口的作用;

public interface CustomerService {
	
	//定义一个退出系统的方法
	void logout();

}
