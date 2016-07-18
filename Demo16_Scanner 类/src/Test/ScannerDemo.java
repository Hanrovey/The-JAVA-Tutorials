package Test;

import java.util.Scanner;

/*java.util.Scanner是Java5的新特征，我们可以通过 Scanner 类来获取用户的输入。 
下面是创建 Scanner 对象的基本语法：

Scanner s = new Scanner(System.in); 

接下来我们演示一个最简单的的数据输入，并通过 Scanner 类的 next() 与 nextLine() 方法获取输入的字符串，在读取前我们一般需要 
使用 hasNext 与 haxNextLine 判断是否还有输入的数据：
----------------------------------------------

next()与nextLine()区别

next():

    1、一定要读取到有效字符后才可以结束输入。
    2、对输入有效字符之前遇到的空白，next()方法会自动将其去掉。
    3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
    next()不能得到带有空格的字符串。

nextLine()：

    1、以Enter为结束符,也就是说nextLine()方法返回的是输入回车之前的所有字符。
    2、可以获得空白。
    
*/
public class ScannerDemo {
	public static void main(String[] args) {
		
		// 从键盘接收数据 
		Scanner scanner = new Scanner(System.in);
		
		//next方式接收字符串
        System.out.println("next or nextline方式接收：");
        
        // 判断是否还有输入 sss ooo 只能输出sss
//		if (scanner.hasNext()) {
//			
//			String str1 = scanner.next();
//        	System.out.println("next输入的数据为："+str1);  				
//		}
		
		// sss ooo 输出sss ooo
		if (scanner.hasNextLine()) {
			String str2 = scanner.nextLine();
			System.out.println("nextLine:s输入的数据:" + str2);
		}
	}
}
