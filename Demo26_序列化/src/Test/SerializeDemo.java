package Test;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

// 用ObjectOutputStream 类用来序列化一个对象
public class SerializeDemo {
	   public static void main(String [] args)	{
		   
		   Employee employee = new Employee();
		   employee.name = "张三";
		   employee.address = "上海";
		   employee.age = 25;
		   employee.salary = 10000;
		   
		   try {
			   
			   // 创建文件输出操作对象
			   FileOutputStream fileout = new FileOutputStream("/Users/chenxihang/desktop/employee.ser");
			   
			   // 输出流对象
			   ObjectOutputStream output = new ObjectOutputStream(fileout);
			   
			   // 将对象写入文件
			   output.writeObject(employee);
			   output.close();
			   fileout.close();
		       System.out.printf("Serialized data is saved in /tmp/employee.ser");
			   
		} catch (Exception e) {
			
			// 抛出异常
			e.printStackTrace();
		}
	}
}
