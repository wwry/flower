package wangluobiancheng;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class IOURLConnection {
	
	public static void main(String[] args) {

		try {
			URL url = new URL("http://www.baidu.com");
			URLConnection urlconnection = url.openConnection();
			Map<String,List<String>> headers = urlconnection.getHeaderFields();
			for(String  key: headers.keySet()){
				System.out.printf(" keyName: %-20s",key);
				System.out.print("value:");
				for(String value:headers.get(key)){
					System.out.print(value+" ");
				}
				System.out.println();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
