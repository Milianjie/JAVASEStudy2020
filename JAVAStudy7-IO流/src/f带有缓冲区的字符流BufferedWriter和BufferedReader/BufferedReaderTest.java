package f带有缓冲区的字符流BufferedWriter和BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader:
 * 			带有缓冲区的字符输入流
 * 			使用这个流的时候不需要自己定义char数组，类似的BufferInputStream就不需要自定义byte数组。自带缓冲
 * 
 */

public class BufferedReaderTest {
	
	public static void main(String[] args) {
		
		BufferedReader bReader = null;
		
		
		//BufferedReader流中有两个构造方法，第一个构造方法中的参数是(Reader in)Reader是BufferedReader父类，该类还有一个子类InputStreamReader，
		//InputStreamReader类中有一个子类为FileReader，正是字符输入流，所以说该构造方法需要的流in可以是Reader子类的对象流，多数使用的是FileReader的对象
		//另一个构造方法中参数是(Reader in, int sz) ,通过源码可以看到底层是第一个构造方法将Reader对象传进去后用this调用了另个一个
		//构造方法，所以Reader子类的对象传给第二个构造方法的in，sz现在不用管。
		//因为BufferedReader流中有定义一个成员变量Reader in;由于第二个构造方法内部实现了将传入参数in赋值给成员变量in，再者就是该流中close方法
		//有调用in.close(),所以说下面只需要处理流bReader.close(),对应的节点流也就关闭了
		
		
		FileReader reader;
		try {
			//在这new一个字符输入流对象
			//当一个流的构造方法需要一个流的时候，哪个被传进来的流reader称为：节点流
			//而外部负责包装的这个流被称为：包装流，或者说处理流
			//当前程序：FileReader是节点流，BufferedReader是处理流
			reader = new FileReader("src/aIO流的理解/IO流的笔记");
			
			bReader = new BufferedReader(reader);
			
			//readerLine()方法，读取一行字符，返回的是String
			//String sReader = bReader.readLine();
			//System.out.println(sReader);
			
			//因为该方法如果读取不到字符号后返回null，所以来个循环
		   String sReader = null;
		   while ((sReader = bReader.readLine()) != null) {
			   
			System.out.println(sReader);//读一个文本行但是不带最后的换行符
			
		}
		   
		   //该方法比较方便，但效率没有直接读取的高，因为加了个包装流
			
			//遇到这种节点流包装流的只需要关闭最外层的流，其余流就能底层自动关闭
			bReader.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (bReader != null) {
				try {
					bReader.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	

}
