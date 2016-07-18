package Test;

import java.util.HashMap;
import java.util.Map;

/*
 * Map接口中键和值一一映射. 可以通过键来获取值。

    给定一个键和一个值，你可以将该值存储在一个Map对象. 之后，你可以通过键来访问对应的值。
    当访问的值不存在的时候，方法就会抛出一个NoSuchElementException异常.
    当对象的类型和Map里元素类型不兼容的时候，就会抛出一个 ClassCastException异常。
    当在不允许使用Null对象的Map中使用Null对象，会抛出一个NullPointerException 异常。
    当尝试修改一个只读的Map时，会抛出一个UnsupportedOperationException异常。

 */
public class CollectionsDemo {
	public static void main(String[] args) {
	      Map m1 = new HashMap(); 
	      m1.put("Zara", "8");
	      m1.put("Mahnaz", "31");
	      m1.put("Ayan", "12");
	      m1.put("Daisy", "14");
	      System.out.println();
	      System.out.println(" Map Elements");
	      System.out.print("\t" + m1);
	}
}
