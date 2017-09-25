package com.binaryIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Shuchu {

	public static void main(String[] args) {
		
		try (OutputStream is = new FileOutputStream(
			 "C:\\aeclipse\\java项目\\Test\\aa.txt",true)) {//加true可以在原文本上追加内容
            is.write('h');
            byte[] buffer={'a','b','c','d','e','f','g','h'};
            is.write(buffer);
            is.write(buffer,2, 5);
            String s ="qwer";
            is.write(s.getBytes()); //getBytes()方法将一个String类型转换为一个Byte数组
            	
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	    
	}
}
