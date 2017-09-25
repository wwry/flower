package com.ObjectIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Test {

	  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		  try(ObjectOutputStream output = 
				  new ObjectOutputStream(new FileOutputStream("ccccc.txt")))
		  {
			  User tom = new User(1,"zzzzzzzzzzzzz",123456);
			  output.writeObject(tom);
			  output.writeObject(new User(2,"rrrrrrrrrrrrrrrrr",000000000000));
			  output.writeObject(tom);
			  output.writeObject(tom);
			  output.writeObject(tom);
			 
		  }
		  
		  
		  
		  
		
		 
		  	 
	  }

}
