import java.io.*;
public class EmployeeTest {
	public static void main(String args[]){
		
	      /* 使用构造器创建两个对象 */
	      Employee empOne = new Employee("James Smith");
	      Employee empTwo = new Employee("Mary Anne");

	      // 调用这两个对象的成员方法
	      empOne.emAge(26);
	      empOne.emDestination("Senior Software Engineer");
	      empOne.emSalary(1000);
	      empOne.printEmployee();

	      empTwo.emAge(21);
	      empTwo.emDestination("Software Engineer");
	      empTwo.emSalary(500);
	      empTwo.printEmployee();
	   }
}
