package Test;
/*
 * 在面向对象程式设计方法中，封装（英语：Encapsulation）是指，一种将抽象性函式接口的实作细节部份包装、隐藏起来的方法。

封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。

要访问该类的代码和数据，必须通过严格的接口控制。

封装最主要的功能在于我们能修改自己的实现代码，而不用修改那些调用我们代码的程序片段。

适当的封装可以让程式码更容易理解与维护，也加强了程式码的安全性。
 */
public class EncapTest {
	private String name;
	private String ID;
	private int num;
	
	public String getName() {
		return name;
	}
	
	public String getID() {
		return ID;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(String iD) {
		ID = iD;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}
