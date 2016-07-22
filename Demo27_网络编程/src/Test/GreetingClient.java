package Test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;
// 一个客户端程序，该程序通过socket连接到服务器并发送一个请求，然后等待一个响应。
public class GreetingClient {
	public static void main(String [] args)
	   {
	      String serverName = "GreetingServer";
	      int port = 6066;
	      try
	      {
	         System.out.println("Connecting to " + serverName
	                             + " on port " + port);
	         Socket client = new Socket(serverName, port);
	         System.out.println("Just connected to "
	                      + client.getRemoteSocketAddress());
	         OutputStream outToServer = (OutputStream) client.getOutputStream();
	         DataOutputStream out =
	                       new DataOutputStream(outToServer);
	 
	         out.writeUTF("Hello from "
	                      + client.getLocalSocketAddress());
	         InputStream inFromServer = client.getInputStream();
	         DataInputStream in =
	                        new DataInputStream(inFromServer);
	         System.out.println("Server says " + in.readUTF());
	         client.close();
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
	   }
}
