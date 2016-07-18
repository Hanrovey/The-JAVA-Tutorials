package Test;

public class Test {
	
	/*
	 * 创建数组两种方法
	 */
	public static void customInit() {
		
		// 实例方法一 （首选的方法)
		double[] myList;         
		
		// 实例方法二 （效果相同，但不是首选方法）
		double myList1[];    
		
		// 创建数组方法一
//		dataType[] arrayRefVar = new dataType[arraySize];
		
		// 创建数组方法二
//		dataType[] arrayRefVar = {value0, value1, ..., valuek};
	}
	
	/*
	 * 计算所有元素的总和
	 */
	public static void creatList1() {
		
		int size = 3;
		int[] myList = new int[size];
		myList[0] = 1;
		myList[1] = 2;
		myList[2] = 3;
		
		int total = 0;
		for (int i = 0; i < size ; i++) {
			total += myList[i];
		}
		System.out.println("total总和:" + total);
	}
	
	/*
	 * 打印所有数组元素
	 */
	public static void createList2() {
		 
		int[] myList = {10,20,30};
		for (int i = 0; i < myList.length; i++) {
			System.out.println(i + "---" + myList[i] );
		}
		
		  // 查找最大元素
	      int max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Max is " + max);
	}
	
	/*
	 * foreach循环
	 */
	public static void foreachMethod() {
		int[] ages = {11,22,33,44};
		for (int i : ages) {
			System.out.println(i);
		}
	}
	
	/*
	 * 数组作为参数
	 */
	public static void printArraye(double[] array) {
		for (double index : array) {
			System.out.println(" 打印数组 ：" + index);
		}
	}
	
	/*
	 * 数组的创建和实例化
	 */
	public static void main(String[] args) {
		
		Test test = new Test();
		test.creatList1();
		test.createList2();
		test.foreachMethod();
		
		double[] array = {100,200,300};
		test.printArraye(array);
	}
	
	
}
