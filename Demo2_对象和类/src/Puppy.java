
public class Puppy {
	
	// 实例变量
	int age;
	
	// 构造方法一
	public Puppy() {
		System.out.println("这个是Puppy的初始化方法.");
	}
	
	// 构造方法二
	public Puppy(String name) {
		// 这个构造器仅有一个参数：name
		System.out.println("Puppy name:" + name);
	}
	
	// set方法
	public void setAge(int age) {
		this.age = age;
	}
	
	// get方法
	public int getAge() {
		
	    System.out.println("Puppy's age is :" + age ); 
		return age;
	}
	
	// 主函数入口
	public static void main(String[] args) {
		// 创建一个Puppy对象
		Puppy puppy = new Puppy("小明");
		
		/* 通过方法来设定age */
		puppy.setAge(35);
		
		/* 调用另一个方法获取age */
		puppy.getAge();
		
		/*你也可以像下面这样访问成员变量 */
		System.out.println("通过打印获取age：" + puppy.age);
	}
}
