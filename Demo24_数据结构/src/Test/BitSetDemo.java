package Test;

import java.util.BitSet;

/* 位集合（BitSet）
 * 一个Bitset类创建一种特殊类型的数组来保存位值。BitSet中数组大小会随需要增加。这和位向量（vector of bits）比较类似。

这是一个传统的类，但它在Java 2中被完全重新设计。

BitSet定义了两个构造方法。

第一个构造方法创建一个默认的对象：

BitSet()

第二个方法允许用户指定初始大小。所有位初始化为0。


BitSet(int size)
 */
public class BitSetDemo {
	public static void main(String[] args) {
		BitSet bitSet1 = new BitSet(16);
		BitSet bitSet2 = new BitSet(16);

		// set some bits
		for (int i = 0; i < 16; i++) {
			if ((i%2) == 0) bitSet1.set(i); 
			if ((i%5) != 0) bitSet2.set(i);
		}
		
	     System.out.println("Initial pattern in bits1: ");
	     System.out.println(bitSet1);
	     System.out.println("\nInitial pattern in bits2: ");
	     System.out.println(bitSet2);
	     
	     // AND bit
	     bitSet2.and(bitSet1);
	     System.out.println("bitSet2 and bitset1 :");
	     System.out.println(bitSet2);
	     
	     // OR bit
	     bitSet2.or(bitSet1);
	     System.out.println("bitSet2 or bitset1 :");
	     System.out.println(bitSet2);
	     
	     // XOR bit
	     bitSet2.xor(bitSet1);
	     System.out.println("bitSet2 and bitset1 :");
	     System.out.println(bitSet2);
	}
}
