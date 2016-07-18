package Test;

import java.util.Enumeration;
import java.util.Vector;

/* 向量（Vector）
 * Vector类实现了一个动态数组。和ArrayList和相似，但是两者是不同的：

    Vector是同步访问的。
    Vector包含了许多传统的方法，这些方法不属于集合框架。

Vector主要用在事先不知道数组的大小，或者只是需要一个可以改变大小的数组的情况。

Vector类支持4种构造方法。

第一种构造方法创建一个默认的向量，默认大小为10：

Vector()

第二种构造方法创建指定大小的向量。

Vector(int size)

第三种构造方法创建指定大小的向量，并且增量用incr指定. 增量表示向量每次增加的元素数目。

Vector(int size,int incr)

第四中构造方法创建一个包含集合c元素的向量：

Vector(Collection c)
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector vector = new Vector<>(3, 2);
		System.out.println("size : " + vector.size());
		System.out.println("capacity :" + vector.capacity());
		
		//添加integer元素
		vector.addElement(new Integer(1));
		vector.addElement(new Integer(2));
		vector.addElement(new Integer(3));
		vector.addElement(new Integer(4));
		System.out.println("after addElement integer capacity :" + vector.capacity());
		
		// 添加double元素
		vector.addElement(new Double(7.0));
		System.out.println("after addElement double capacity :" + vector.capacity());

		// 第一个元素
		Integer firstElement = (Integer) vector.firstElement();
		System.out.println("firstElement： " + firstElement);
		
		// 最后一个元素
		Double lastElement = (Double) vector.lastElement();
		System.out.println("lastElement： " + lastElement);
		
		if(vector.contains(new Integer(3)))
	         System.out.println("Vector contains 3.");
	      // enumerate the elements in the vector.
	      Enumeration vEnum = vector.elements();
	      System.out.println("\nElements in vector:");
	      while(vEnum.hasMoreElements())
	         System.out.print(vEnum.nextElement() + " ");
	      System.out.println();
	   }
}
