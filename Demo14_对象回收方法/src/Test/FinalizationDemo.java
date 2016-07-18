package Test;
/*
 *  finalize()
	Java允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做finalize( )，它用来清除回收对象。
	例如，你可以使用finalize()来确保一个对象打开的文件被关闭了。
	在finalize()方法里，你必须指定在对象销毁时候要执行的操作。
*/ 
public class FinalizationDemo {
	
	public static void main(String[] args) {
		Dog dog1 = new Dog(1);
		Dog dog2 = new Dog(2);
		Dog dog3 = new Dog(3);
		
		dog2 = dog3 = null;
		System.gc();//调用Java垃圾收集器
		
	}
}

/** Dog类 */
class Dog extends Object{
	private int id;
	
	// 重写构造函数
	public Dog(int id) {
		this.id = id;
        System.out.println("Dog Object " + id + " is created");  
	}
	
	// 清除回收对象
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
        System.out.println("Dog Object " + id + " is disposed");  
	}
}
