package Test;
/*
 * 抽象类
在面向对象的概念中，所有的对象都是通过类来描绘的，但是反过来，并不是所有的类都是用来描绘对象的，如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。

抽象类除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。

由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。也是因为这个原因，通常在设计阶段决定要不要设计抽象类。

父类包含了子类集合的常见的方法，但是由于父类本身是抽象的，所以不能使用这些方法。
 */
// 抽象类
public abstract class Employee {

	private String name;
	private String address;
	private int number;
	
	// 构造方法
	public Employee(String name,String address,int number) {
		
		System.out.println("构造方法");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public double computeCount() {
		System.out.println("---------computeCount");
		return 0.0;
	}
	
	public void mailCheck() {
		System.out.println("mail a check to" + " " + this.name + " " + this.address);
	}
	
	public String toString() {
		return name + " " + address + " " + number;
	}
	
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getNumber() {
		return number;
	}
}
