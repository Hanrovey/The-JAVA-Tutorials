
/**
 * @author ihefe_Hanrovey
 * java数据类型分两种：内置数据类型和引用数据类型
 */
public class PrimitiveTypeTest {
	
	/*
	 *  内置数据类型（8种）
	 */
	public static void defaultType() {
		// byte
		System.out.println(" 基本类型：byte 二进制位数：" + Byte.SIZE);
		System.out.println(" 包装类：java.lang.Byte：");
		System.out.println(" 最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
		System.out.println(" 最大值: Byte.MAX_VALUE=：" + Byte.MAX_VALUE);
		System.out.println();
		
		
		// short
		System.out.println(" 基本类型：short 二进制位数：" + Short.SIZE);
		System.out.println(" 包装类：java.lang.Short：");
		System.out.println(" 最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
		System.out.println(" 最大值: Short.MAX_VALUE=：" + Short.MAX_VALUE);
		System.out.println();
		
		
		// int
		System.out.println(" 基本类型：int 二进制位数：" + Integer.SIZE);
		System.out.println(" 包装类：java.lang.Integer：");
		System.out.println(" 最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println(" 最大值: Integer.MAX_VALUE=：" + Integer.MAX_VALUE);
		System.out.println();
		
		
		// long
		System.out.println(" 基本类型：long 二进制位数：" + Long.SIZE);
		System.out.println(" 包装类：java.lang.Long：");
		System.out.println(" 最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
		System.out.println(" 最大值: Long.MAX_VALUE=：" + Long.MAX_VALUE);
		System.out.println();
		
		
		// float
		System.out.println(" 基本类型：float 二进制位数：" + Float.SIZE);
		System.out.println(" 包装类：java.lang.Float：");
		System.out.println(" 最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
		System.out.println(" 最大值: Float.MAX_VALUE=：" + Float.MAX_VALUE);
		System.out.println();
		
		
		// double
		System.out.println(" 基本类型：double 二进制位数：" + Double.SIZE);
		System.out.println(" 包装类：java.lang.Double：");
		System.out.println(" 最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
		System.out.println(" 最大值: Double.MAX_VALUE=：" + Double.MAX_VALUE);
		System.out.println();
		
		
		// char  
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
        System.out.println("包装类：java.lang.Character");  
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("最小值：Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("最大值：Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
	}
	
	
	/*
	 * 引用类型
	 */
	public static void quoteType() {

	    /*引用类型变量由类的构造函数创建，可以使用它们访问所引用的对象。这些变量在声明时被指定为一个特定的类型，比如Employee、Pubby等。变量一旦声明后，类型就不能被改变了。
	    对象、数组都是引用数据类型。
	    所有引用类型的默认值都是null。
	    一个引用变量可以用来引用与任何与之兼容的类型。
	    例子：Site site = new Site("Runoob")。
		*/
	}
	
	
	/*
	 * 常量：使用 final 关键字来修饰常量，声明方式和变量类似
	 * 虽然常量名也可以用小写，但为了便于识别，通常使用大写字母表示常量。 
	 */
	public static void constantType() {
		final double PI = 3.1415926;
		
		byte a = 68;
		
		char A = 'A';
	}
	
	
	public static void main(String[] args) {
		
		PrimitiveTypeTest.defaultType();
		PrimitiveTypeTest.quoteType();
		PrimitiveTypeTest.constantType();
	}
}

/*
 * Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。

byte：

    byte数据类型是8位、有符号的，以二进制补码表示的整数；
    最小值是-128（-2^7）；
    最大值是127（2^7-1）；
    默认值是0；
    byte类型用在大型数组中节约空间，主要代替整数，因为byte变量占用的空间只有int类型的四分之一；
    例子：byte a = 100，byte b = -50。

short：

    short数据类型是16位、有符号的以二进制补码表示的整数
    最小值是-32768（-2^15）；
    最大值是32767（2^15 - 1）；
    Short数据类型也可以像byte那样节省空间。一个short变量是int型变量所占空间的二分之一；
    默认值是0；
    例子：short s = 1000，short r = -20000。

int：

    int数据类型是32位、有符号的以二进制补码表示的整数；
    最小值是-2,147,483,648（-2^31）；
    最大值是2,147,483,647（2^31 - 1）；
    一般地整型变量默认为int类型；
    默认值是0；
    例子：int a = 100000, int b = -200000。

long：

    long数据类型是64位、有符号的以二进制补码表示的整数；
    最小值是-9,223,372,036,854,775,808（-2^63）；
    最大值是9,223,372,036,854,775,807（2^63 -1）；
    这种类型主要使用在需要比较大整数的系统上；
    默认值是0L；
    例子： long a = 100000L，Long b = -200000L。

float：

    float数据类型是单精度、32位、符合IEEE 754标准的浮点数；
    float在储存大型浮点数组的时候可节省内存空间；
    默认值是0.0f；
    浮点数不能用来表示精确的值，如货币；
    例子：float f1 = 234.5f。

double：

    double数据类型是双精度、64位、符合IEEE 754标准的浮点数；
    浮点数的默认类型为double类型；
    double类型同样不能表示精确的值，如货币；
    默认值是0.0d；
    例子：double d1 = 123.4。

boolean：

    boolean数据类型表示一位的信息；
    只有两个取值：true和false；
    这种类型只作为一种标志来记录true/false情况；
    默认值是false；
    例子：boolean one = true。

char：

    char类型是一个单一的16位Unicode字符；
    最小值是’\u0000’（即为0）；
    最大值是’\uffff’（即为65,535）；
    char数据类型可以储存任何字符；
    例子：char letter = ‘A’。
 */