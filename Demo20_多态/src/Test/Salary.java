package Test;

public class Salary extends Employee{

	private int salary;// 全年的工资
	
	
	public Salary(String name, String address, int d) {
		// TODO Auto-generated constructor stub
		super(name, address, d);
		this.salary = d;

	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void mailCheck() {
	    System.out.println("Salary 类的 mailCheck 方法 ");
	    System.out.println("邮寄支票给：" + getName() + " 地址：" + getAddress() + " ，工资为：" + getSalary());
	}
	
	public double computePay() {
	      System.out.println("计算工资，付给：" + getName());
	      return salary/52;
	   }
	
}
