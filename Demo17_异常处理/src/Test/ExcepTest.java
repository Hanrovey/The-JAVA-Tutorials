package Test;
/*
要理解Java异常处理是如何工作的，你需要掌握以下三种类型的异常：

检查性异常：最具代表的检查性异常是用户错误或问题引起的异常，这是程序员无法预见的。
例如要打开一个不存在文件时，一个异常就发生了，这些异常在编译时不能被简单地忽略。

运行时异常： 运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略。

错误： 错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，它们在编译也检查不到的。
*/
//下面的例子中声明有两个元素的一个数组，当代码试图访问数组的第三个元素的时候就会抛出一个异常。
public class ExcepTest {
	
	public static void main(String[] args) {
		try {
			int[] array = {1,2,3,4};
			System.out.println(array[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println("out of block");
	}
}
