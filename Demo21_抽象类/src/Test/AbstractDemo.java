package Test;

public class AbstractDemo {
	public static void main(String[] args) {
		
		// 这句话会报错，因为抽象类不能实例化对象
		Employee employee = new Employee("zhangsan","shanghai",1);
		
		System.out.println("\n Call mailCheck using Employee reference--");
		employee.mailCheck();
	}
}
