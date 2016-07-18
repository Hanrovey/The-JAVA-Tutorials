package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//使用 BufferedReader 在控制台读取字符
public class BRReadLines {
	
	public static void main(String[] args) throws IOException {
		
	     // 使用 System.in 创建 BufferedReader 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'end' to quit.");
		
		do {
			str = bf.readLine();
			System.out.println(str);
		} while (!str.equals("to"));
	}
}
