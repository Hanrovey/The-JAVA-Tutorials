package Test;

public class RunEncap {
	
	// 封装：通过调用set方法来访问EncapTest内部的属性
	public static void main(String[] args) {
		EncapTest test = new EncapTest();
		test.setName("测试name");
		test.setID("100");
		test.setNum(34);
		
		System.out.println("封装的测试name：" + test.getName() + " ID : " + test.getID() + " num :  " + test.getNum());
		
	}
}
