package wangluobiancheng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class HttpServer {       //·þÎñÆ÷

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1",10000);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			StringBuilder sb = new StringBuilder(8096);
			
			while(true){
				if(in.ready()){
					int i= 0;
					
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
