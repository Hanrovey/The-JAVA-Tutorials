package Test;
/*
 * Java 提供了一种对象序列化的机制，
 * 该机制中，一个对象可以被表示为一个字节序列，该字节序列包括该对象的数据、有关对象的类型的信息和存储在对象中数据的类型。
 * 将序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化，也就是说，对象的类型信息、对象的数据，
 * 还有对象中的数据类型可以用来在内存中新建对象。 
 */

/*
 *  请注意，一个类的对象要想序列化成功，必须满足两个条件：

该类必须实现 java.io.Serializable 对象。

该类的所有属性必须是可序列化的。
如果有一个属性不是可序列化的，则该属性必须注明是短暂的。

如果你想知道一个Java标准类是否是可序列化的，请查看该类的文档。检验一个类的实例是否能序列化十分简单， 只需要查看该类有没有实现java.io.Serializable接口。 
 */
public class Employee implements java.io.Serializable{
	public String name;
	public String address;
	public transient int salary;// 这个属性不能被序列化，必须声明为transient(短暂类型)
	public int age;
	
	public void mailCheck() {
		System.out.println("mailCheck ----- " + name + " " + address);
	}
}
