package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//使用 BufferedReader 在控制台读取字符
public class BRRead {
	public static void main(String[] args) throws IOException {
		char c;
		// 使用 System.in 创建 BufferedReader 
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		
		System.out.println("Enter characters, 'q' to quit.");
		
		// 读取字符
		do {
			c = (char)bf.read();
			System.out.println(c);
		} while (c != 'q');
	}
}
