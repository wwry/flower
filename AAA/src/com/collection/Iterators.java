package com.collection;

import java.util.ArrayList;



public class Iterators {

	public static void main(String[] args) {
		
		ArrayList<String> collection = new ArrayList<>();
		collection.add("aa");
		collection.add("bb");
		collection.add("cc");
		collection.add("zz");
		
		//Ñ­»·
		for(int i=0;i<collection.size();i++){
			System.out.println(collection.get(i));
		}
		
		//µü´ú
		java.util.Iterator<String> ss =collection.iterator();
		while(ss.hasNext()){
			System.out.println(ss.next());
		}
		

	}

}
