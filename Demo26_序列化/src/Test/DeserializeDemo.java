package Test;

import java.io.*;

public class DeserializeDemo {
	   public static void main(String [] args){
		   
		   Employee employee = null;
		   try {
			   
			   // 创建文件输出操作对象
			   FileInputStream fileInputStream = new FileInputStream("/Users/chenxihang/desktop/employee.ser");
			   
			   // 输出流对象
			   ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			   
			   // 从文件中读取对象
			   employee = (Employee) inputStream.readObject();
			   
			   inputStream.close();
			   fileInputStream.close();
			  
		} catch (Exception e) {
			
			// 抛出异常
			e.printStackTrace();
			return;
		}
		  System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + employee.name);
	      System.out.println("Address: " + employee.address);
	      System.out.println("SSN: " + employee.salary);
	      System.out.println("Number: " + employee.age);
		   
	   }
}
