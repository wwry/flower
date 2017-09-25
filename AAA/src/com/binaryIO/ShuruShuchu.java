package com.binaryIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ShuruShuchu {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		File file = new File("C:\\aeclipse,项目\\java项目\\AAA\\c.txt");
		try (FileOutputStream output = new FileOutputStream(file)) {

			for (int i = 1; i < 10; i++) {
				output.write(i);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		// -----------------------------------------------------------------------

		try (InputStream input = new FileInputStream(file)) {
			int value;
			while ((value = input.read()) != -1) {
				System.out.println(value + " ");
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("---------------------------------------------------------------------------------");

		//对象输入输出流
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Object.txt"))) {
			output.writeUTF("aaa");
			output.writeDouble(98.111);
			output.writeObject(new java.util.Date());

		}
		try (ObjectInputStream output = new ObjectInputStream(new FileInputStream("Object.txt"))) {
			System.out.println(output.readUTF());
			System.out.println(output.readDouble());
			
			System.out.println((output.readObject()));

		}
		
	}

}
