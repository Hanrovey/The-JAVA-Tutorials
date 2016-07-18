

public class Test {
	
	/*
	 * 主函数入口
	 */
	public static void main(String[] args) {
		Test test = new Test();
		test.whileMethod();
		test.doWhileMethod();
		test.forMethod();
		test.newForMethod();
		test.breakMethod();
		test.continueMethod();
	}
	
	/*
	 * while循环
	 */
	public static void whileMethod(){
		int x = 10;
		while(x < 20){
			
			System.out.println("whileMethod------输出 x :" + x);
			x += 2;
			System.out.println(",");
		}
	}
	
	/*
	 * do...while循环
	 */
	public static void doWhileMethod() {
		int x = 10;
		do {
			System.out.println("doWhileMethod------输出 x :" + x);
			x+=2;
		} while (x < 20);
	}
	
	/*
	 * 普通for循环
	 */
	public static void forMethod(){
		
		for (int i = 0; i < 6; i++) {
			System.out.println("i 的 值 ：" + i);
			System.out.println("\n");
		}
	}
	
	/*
	 * 增强for循环
	 */
	public static void newForMethod() {
		
		int [] numbers = {10,20,30,40,50};
		for (int i : numbers) {
			System.out.println("newForMethod-----中i的值:" + i);
			System.out.println(",");
		}
		System.out.println("\n");
		
		String [] names = {"tom","jane","owen"};
		for (String name : names) {
			System.out.println("newForMethod ----- 中 name的值：" + name);
			System.out.println(",");
		}
		System.out.println("\n");
	}
	
	/*
	 * break
	 * break主要用在循环语句或者switch语句中，用来跳出整个语句块。
	 * break跳出最里层的循环，并且继续执行该循环下面的语句。
	 */
	public static void breakMethod() {
		
		int [] numbers = {10,20,30,40,50};
		for (int i : numbers) {
			if (i == 30) {
				break;
			}
			System.out.println("breakMethod----i的值:" + i);
			System.out.println("\n");
		}
	}
	
	/* continue
	 * continue适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
     * 在for循环中，continue语句使程序立即跳转到更新语句。
     * 在while或者do…while循环中，程序立即跳转到布尔表达式的判断语句。 
	 */
	public static void continueMethod() {
		
		int [] numbers = {10,20,30,40,50};
		for (int i : numbers) {
			if (i == 30) {
				continue;
			}
			System.out.println("continueMethod------i的值:" + i);
			System.out.println("\n");
		}
	}
}
