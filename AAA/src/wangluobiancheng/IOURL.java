package wangluobiancheng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class IOURL {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(
				new InputStreamReader(new URL("http://www.qq.com/").openStream()))) {
			/*URL url = new URL("http://www.qq.com/");
			InputStream inputstream =url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(inputstream));*/
			String line=br.readLine();
			while(line!=null){
				System.out.println(line);
				line=br.readLine();
			}
			br.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
