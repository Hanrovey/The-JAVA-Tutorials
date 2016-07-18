package Test;
/*
声明自定义异常

在Java中你可以自定义异常。编写自己的异常类时需要记住下面的几点。

    所有异常都必须是Throwable的子类。
    如果希望写一个检查性异常类，则需要继承Exception类。
    如果你想写一个运行时异常类，那么需要继承RuntimeException 类。

可以像下面这样定义自己的异常类：

class MyException extends Exception{
}
*/

public class InsufficientFundsException extends Exception{
	
	private double account;
	
	public InsufficientFundsException(double account) {
		this.account = account;
	}
	
	public double getAccount() {
		return account;
	}
}
