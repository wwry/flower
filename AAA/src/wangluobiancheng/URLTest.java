package wangluobiancheng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class URLTest {     //套接字 Socket  客户端

	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket("https://www.bing.com/?mkt=zh-CN",80);
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os,true);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			/*pw.print("GET/HTTP/1.1");
			pw.print("Host:"+"bing.com"+":80");
			pw.println();
			pw.close();*/
			
			StringBuilder sb = new StringBuilder(8096);
			while(true){
				if(in.ready()){ 
					int i= 0;
					while(i != -1){
						i=in.read();
						System.out.println((char)i);
					}
				}
				break;
			}
			System.out.println(sb.toString());
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
