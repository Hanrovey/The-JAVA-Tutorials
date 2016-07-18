
//命令编译器载入java_installation/java/io路径下的所有类
import java.io.*;

/* Employee类 */
public class Employee {
	String name;// 名称
	int age;// 年龄
	String destination;//出生地
	double salary;//工资
	
	// Employee的构造器
	public Employee(String name) {
		this.name = name;
	}	
	
	// 设置age
	public void emAge(int emAge) {
		this.age = emAge;
	}
	
	// 设置destination
	public void emDestination(String emDestination) {
		this.destination = emDestination;
	}
	
	// 设置salary
	public void emSalary(double emSalary) {
		this.salary = emSalary;
	}
	
	/* 打印Employee信息 */
	public void	printEmployee() {
		System.out.println("Name：" + name);
		System.out.println("Age：" + age);
		System.out.println("Destation：" + destination);
		System.out.println("Salary：" + salary);

	}

}
