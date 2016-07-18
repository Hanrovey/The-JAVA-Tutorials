package Test;
/*
为了展示如何使用我们自定义的异常类，

在下面的CheckingAccount 类中包含一个withdraw()方法抛出一个InsufficientFundsException异常。
*/ 
public class CheckingAccount {
	private double balance;
	private int num;
	
	public CheckingAccount(int num) {
		this.num = num;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getNum() {
		return num;
	}
	
	public void deposit(double account) {
		balance += account;
	}
	
	public void withDraw(double account) throws InsufficientFundsException{
		if (account <= balance) {
			balance -= account;
		}
		else {
			double need = account - balance;
			throw new InsufficientFundsException(need);
		}
	}
}
