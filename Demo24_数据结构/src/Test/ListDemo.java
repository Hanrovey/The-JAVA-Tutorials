package Test;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

// 数组类
public class ListDemo {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		// 添加
		list.add("A");
		list.add("B");
		list.add("C");
		
		// 修改，第一个位置的值为“D”
		((LinkedList) list).set(2, "D");
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("list item : " + iterator.next());
		}
		
	}
}
