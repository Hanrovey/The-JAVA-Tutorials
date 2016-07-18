package Test;
/*虚方法

我们将介绍在Java中，当设计类时，被重写的方法的行为怎样影响多态性。

我们已经讨论了方法的重写，也就是子类能够重写父类的方法。

当子类对象调用重写的方法时，调用的是子类的方法，而不是父类中被重写的方法。

要想调用父类中被重写的方法，则必须使用关键字super。
*/
public class VirtualDemo {
	
	public static void main(String[] args) {
		Salary s = new Salary("员工 A", "北京", 3600);
	    Employee e = new Salary("员工 B", "上海", 2400);
	    
	    
	    System.out.println("使用 Salary 的引用调用 mailCheck -- ");
	    s.mailCheck();
	    System.out.println("\n使用 Employee 的引用调用 mailCheck--");
	    e.mailCheck();
	}
}

