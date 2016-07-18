package test;
/*
实例变量:
1.实例变量声明在一个类中，但在方法、构造方法和语句块之外；
2.当一个对象被实例化之后，每个实例变量的值就跟着确定；
3.实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
4.实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息；
5.实例变量可以声明在使用前或者使用后；
6.访问修饰符可以修饰实例变量；
7.实例变量对于类中的方法、构造方法或者语句块是可见的。一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见；
8.实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定；
9.实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：ObejectReference.VariableName。
 */
public class Employee {
	// 这个成员变量对子类可见
	public String name;
	// 私有变量，仅在该类可见
	private double salary;
	
	//在构造器中对name赋值
	public Employee (String emName) {
		name = emName;
	}
	
	//设定salary的值
	public void setSalary(double emSalary) {
		salary = emSalary;
	}
	
	// 打印信息
	public void print() {
		System.out.println("name:" + name);
		System.out.println("salary:" + salary);
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee("小胡");
		employee.setSalary(45);
		employee.print();
		
	}
	
}
