package Test;

public class Test {
	
	public static void main(String[] args) {
		
		// 可变字符串
		
		// 追加
		StringBuffer string = new StringBuffer("java test ");
		string.append("add sringBuffer");
		System.out.println(string);
		
		// 移除
		string.delete(0, 4);
		System.out.println(string);
		
		// 插入
		string.insert(0, 2);
		System.out.println(string);
		
		// 替换
		string.replace(0, 4, "python");
		System.out.println(string);
		
		// 反转
		string.reverse();
		System.out.println(string);
	}
	
	
	/*以下是StringBuffer类支持的主要方法：
	1、 	public StringBuffer append(String s) 将指定的字符串追加到此字符序列。
	2、 	public StringBuffer reverse()  将此字符序列用其反转形式取代。
	3、 	public delete(int start, int end) 移除此序列的子字符串中的字符。
	4、 	public insert(int offset, int i) 将 int 参数的字符串表示形式插入此序列中。
	5、 	replace(int start, int end, String str) 使用给定 String 中的字符替换此序列的子字符串中的字符。
	*/
}
