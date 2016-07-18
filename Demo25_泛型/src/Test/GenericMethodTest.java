package Test;
/*
 *  泛型方法

你可以写一个泛型方法，该方法在调用时可以接收不同类型的参数。根据传递给泛型方法的参数类型，编译器适当地处理每一个方法调用。

下面是定义泛型方法的规则：

    所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的<E>）。
    每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
    类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
    泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）。

 */
public class GenericMethodTest {
	
	// 泛型方法
	public static <E> void printArray(E[] array) {
		
		for (E e : array) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
        // 创建不同类型数组： Integer, Double 和 Character
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {10.0,11.0,12.0};
		Character[] characterArray = {'A','B','C'};
		
		System.out.println("Interger array :");
		printArray(intArray);
		
		System.out.println("double array :");
		printArray(doubleArray);
		
		System.out.println("character array :");
		printArray(characterArray);
		
		
	}
}
