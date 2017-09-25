package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class Test {

	public static void main(String[] args) {
		Map<String,Integer> students = new HashMap<>();
		students.put("tom", 20);
		students.put("jerry", 19);
		students.put("ben", 55);
		students.put("ben", 30);
		
		
		System.out.println("键tom的值是:"+ students.get("tom"));
		
		Set<String> keys =students.keySet();   //取得所有的键，这些键是以Set的形式出现的，用Set存key是为了键不能重复
		Collection<Integer> values =students.values();  //取得所有的值
		System.out.println(keys);
		System.out.println(values);
		
		System.out.println("遍历Map");
		for(String key : students.keySet()){
			System.out.printf("%-7s  %-4d  \n",key,students.get(key));
		}
		
		//lamdba表达式
		System.out.println("遍历Map");
		students.forEach((k ,y) -> System.out.printf("%-8s %-4d \n",k,y));
		
		

	}

}
