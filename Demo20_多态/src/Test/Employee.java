package Test;

public class Employee {
	private String name;
	private String address;
	private int number;
	
	// 构造方法
	public Employee (String name,String address,int d) {
		System.out.println("Employee 的 构造方法");
		this.name = name;
		this.address = address;
		this.number = d;
	}
	
	public void mailCheck() {
		System.out.println("邮寄支票 ： " + this.name + " " + this.address + "" + this.number);
	}
	
	public String toString() {
		return name + " " + address + "" + number;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setNumber(int number) {
		this.number = number;
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
