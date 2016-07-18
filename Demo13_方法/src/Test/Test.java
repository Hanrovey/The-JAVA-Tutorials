package Test;

public class Test {
	
	/** 返回两个整数变量较大的值 */
	public static int max(int num1,int num2) {
		
		int result = 0;
		if (num1 > num2) {
			result = num1;
		}else
		{
			result = num2;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int i = 5;
		int j = 2;
		int k = max(i, j);
		System.out.println("The max num between " + i + " and " + j + " is " + k);
	}
	
}
