package Test;
/*
 * 方法的重写规则

    参数列表必须完全与被重写方法的相同；
    返回类型必须完全与被重写方法的返回类型相同；
    访问权限不能比父类中被重写的方法的访问权限更低。例如：如果父类的一个方法被声明为public，那么在子类中重写该方法就不能声明为protected。
    父类的成员方法只能被它的子类重写。
    声明为final的方法不能被重写。
    声明为static的方法不能被重写，但是能够被再次声明。
    子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为private和final的方法。
    子类和父类不在同一个包中，那么子类只能够重写父类的声明为public和protected的非final方法。
    重写的方法能够抛出任何非强制异常，无论被重写的方法是否抛出异常。但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以。
    构造方法不能被重写。
    如果不能继承一个方法，则不能重写这个方法。

 */
// 子类将父类方法重写
class Animal{
	public void move() {
		System.out.println("动物可以移动");
	}
}

class Dog extends Animal{
	public void move() {
		System.out.println("狗可以移动和跑");
	}
}

public class TestDog {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal dog = new Dog();
		
		animal.move();
		dog.move();
		
	}
}
