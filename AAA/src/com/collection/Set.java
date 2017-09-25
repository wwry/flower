package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set{

	public static void main(String[] args) {
	     //Set 是无序的
		 HashSet<Integer> set1 = new HashSet<>();
		 set1.add(5);
		 set1.add(3);
		 set1.add(7);
		 set1.add(2);
		 
	     set1.forEach(e ->System.out.println(e));  //lambda表达式
		 System.out.println("-------------------------------------");
		 
	     //LinkedHashSet 某种意义上是有序的
		 LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		 set2.add(5);
		 set2.add(3);
		 set2.add(7);
		 set2.add(2);
		 set2.forEach(System.out::println);  //打印的新语法
		 System.out.println("-------------------------------------");
		 
		 //TreeSet
		 TreeSet<String> set3 = new TreeSet<>();
		 set3.add("b北京");
		 set3.add("s上海");
		 set3.add("h华盛顿");
		 set3.add("g广东");
		 set3.add("s深圳");
		 System.out.println(set3);    //
		 System.out.println(set3.first());
		 System.out.println(set3.last());
		 System.out.println(set3.headSet("h"));
		 System.out.println(set3.tailSet("h"));
		 

	}

}
