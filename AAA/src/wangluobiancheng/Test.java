package wangluobiancheng;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Test {
	//http://news.baidu.com/   
	public static void main(String[] args){
		System.out.println("ÊäÈëÍøÖ·£º");
		@SuppressWarnings("resource")
		String s = new Scanner(System.in).next();
		
		
		try {
			URL url = new URL(s);
			int count=0;
			int count2=0;
			Scanner input=new Scanner(url.openStream());
			while(input.hasNext()){
				String line=input.nextLine();
				System.out.println(line);
				count+=line.length();
				count2+=1;
			}
			System.out.printf("Ò»¹²"+count+"¸ö×Ö½Ú\n Ò»¹²%dÐÐ",count2);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}catch (IOException ex) {
			
			ex.printStackTrace();
		}
		
	/*	File file = new File("tt.txt");
		file.delete();
		if(file.exists()){
			System.out.println("ï¿½ï¿½ï¿½Ä¼ï¿½ï¿½Ñ¾ï¿½ï¿½ï¿½ï¿½ï¿½");
			System.exit(1);
		}
		try(PrintWriter output = new PrintWriter(file);
				Scanner input = new Scanner(new File("aa.txt"))){
			while(input.hasNextLine()){
				output.println(input.nextLine());
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
	}
}
