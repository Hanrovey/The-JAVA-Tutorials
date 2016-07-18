package Test;
// Super 关键字的使用

class People{
	
	public void move() {
		System.out.println("人可以移动");
	}
}

class Male extends People{
	
	public void move() {
		super.move();
		System.out.println("男人可以移动和跑");
	}
}

public class superTest {
	public static void main(String[] args) {
		People people = new Male();
		people.move();
	}
	
}
