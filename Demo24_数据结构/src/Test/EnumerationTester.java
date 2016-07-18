package Test;

import java.util.Enumeration;
import java.util.Vector;

/* 枚举（Enumeration）
 * Enumeration接口中定义了一些方法，通过这些方法可以枚举（一次获得一个）对象集合中的元素。

这种传统接口已被迭代器取代，虽然Enumeration 还未被遗弃，但在现代代码中已经被很少使用了。
尽管如此，它还是使用在诸如Vector和Properties这些传统类所定义的方法中，
除此之外，还用在一些API类，并且在应用程序中也广泛被使用。 
下表总结了一些Enumeration声明的方法：
序号 	方法描述
1 	boolean hasMoreElements( ) 测试此枚举是否包含更多的元素。
2 	Object  nextElement( )     如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素。
 */
public class EnumerationTester {
	public static void main(String[] args) {
		
		Enumeration days;
		
		// 初始化数组
		Vector dayNames = new Vector();
		
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		
		days = dayNames.elements();
		
		while (days.hasMoreElements()) {
			Object object = (Object) days.nextElement();
			System.out.println(object);
			
		}
		
	}
}
