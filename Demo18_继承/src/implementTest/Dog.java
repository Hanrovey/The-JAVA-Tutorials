package implementTest;
/*
Java只支持单继承，也就是说，一个类不能继承多个类。

下面的做法是不合法的：

public class extends Animal, Mammal{} 
*/

// 一般我们继承基本类和抽象类用extends关键字，实现接口类的继承用implements关键字。
public class Dog extends Mammal{
	public static void main(String[] args) {
		Mammal m = new Mammal();
		Dog dog = new Dog();
		
		
		// 使用 instanceof 运算符来检验Mammal和dog对象是否是Animal类的一个实例。 
		System.out.println(m instanceof Animal);
		System.out.println(dog instanceof Mammal);
		System.out.println(dog instanceof Animal);
	}
}
