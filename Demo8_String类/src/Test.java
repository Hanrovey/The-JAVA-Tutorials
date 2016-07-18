
/*
 * 注意：
 * Java中的println和printf的区别在于：
 * println是用于输出参数内容，然后换行，其参数个数固定为一个。
 * printf是用于输出带各种数据类型的占位符的参数，其参数个数是不定的。 
 */
public class Test {
	
	private static Object floatVar;
	private static Object intVar;

	/*
	 * String类有11种构造方法，这些方法提供不同的参数来初始化字符串，比如提供一个字符数组参数:
	 */
	public static void main(String[] args) {
		
		// 创建字符串
		String string = "String for Java";
		System.out.println(string);
		
		// 字符串长度
		int len = string.length();
		System.out.println("字符串长度" + len);
		
		// 连接字符串
		String string1 = "hello";
		String string2 = "World";
		System.out.println("string1 + string2 = " + string1 + string2);
		System.out.println("string1 concat string2 = " + string1.concat(string2));
		
		// 创建格式化字符串
		float f = (float) 3.0;
		int a = 5;
		System.out.printf("floatValue: %f," + "intValue ：%d",f,a);
		
	}
	
}
