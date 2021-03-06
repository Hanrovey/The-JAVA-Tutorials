package Test;

//当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法。
//多态的好处：可以使程序有良好的扩展，并可以对所有类的对象进行通用处理。
public class Test {
	public static void main(String[] args) {
		
		Cat cat = new Cat();// 以 Cat 对象调用 show 方法
		show(cat);
		
		Dog dog = new Dog();// 以 Dog 对象调用 show 方法
		show(dog);
		
		
		Animal a = new Cat();  // 向上转型  
	    a.eat();               // 调用的是 Cat 的 eat
	    Cat c = (Cat)a;        // 向下转型  
	    c.work();        // 调用的是 Cat 的 catchMouse
		
	}
	
	public static  void show(Animal a) {
		a.eat();
		
		if (a instanceof Cat) {// 猫做的事情
			((Cat) a).work();
		}else if (a instanceof Dog) {// 狗做的事情
			((Dog) a).work();
		}
	}
}

// 抽象类
abstract class Animal{
	
	abstract void eat();
}

// 继承
class Cat extends Animal{
	
	public void eat() {
		System.out.println("吃鱼");
	}
	
	public void work() {
		System.out.println("抓老鼠");
	}
}

// 继承
class Dog extends Animal{
	public void eat() {
		System.out.println("吃骨头");
	}
	
	public void work() {
		System.out.println("看家");
	}
}
