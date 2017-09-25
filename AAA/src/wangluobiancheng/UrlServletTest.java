package wangluobiancheng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlServletTest {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:8080/MyWeb/myurl");
			URLConnection connection=url.openConnection();
			connection.setDoOutput(true);
			PrintWriter out = new PrintWriter(connection.getOutputStream());
			out.println("?name=jerry&age=2");
			out.flush();
			out.close();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line =br.readLine();
			while(line != null){
				System.out.println(line);
				line =br.readLine();
			}
			br.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
