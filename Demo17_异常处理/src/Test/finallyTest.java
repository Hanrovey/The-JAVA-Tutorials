package Test;
/*
finally关键字用来创建在try代码块后面执行的代码块。

无论是否发生异常，finally代码块中的代码总会被执行。

在finally代码块中，可以运行清理类型等收尾善后性质的语句。
*/ 
public class finallyTest {
	public static void main(String[] args) {
		int[] array = {1,2};
		try {
			System.out.println("打印越界的第三个值" + array[3]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		finally {
			array[1] = 5;
			System.out.println("array value of index 1 is :" + array[1]);
	        System.out.println("The finally statement is executed");
		}
	}
}

/*
注意下面事项：
catch不能独立于try存在。
在try/catch后面添加finally块并非强制性要求的。
try代码后不能既没catch块也没finally块。
try, catch, finally块之间不能添加任何代码。
*/