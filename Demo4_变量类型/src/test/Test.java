package test;
/*  
局部变量:
1.局部变量声明在方法、构造方法或者语句块中；
2.局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
3.访问修饰符不能用于局部变量；
4.局部变量只在声明它的方法、构造方法或者语句块中可见；
5.局部变量是在栈上分配的。
6.局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
*/
public class Test {
	
	public void testAge() {
		// 声明局部变量age，记得初始化
		int age = 0;
		age += 4;
		System.out.println("测试年龄：" + age);
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.testAge();
		
	}
}
