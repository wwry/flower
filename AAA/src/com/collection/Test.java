package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//String数组与无限数组互相转换
		String[] s = {"aa","bb","cc"};
		LinkedList<String> list = new LinkedList<>(Arrays.asList(s));
		
		String[] s1 = new String[list.size()];
		list.toArray(s1);
		
		//ArrayList 的几个方法以及作用
		ArrayList<String> collection1 = new ArrayList<>();
		collection1.add("上海");
		collection1.add("北京");
		collection1.add("广东");
		collection1.add("深圳");
		
		System.out.println(collection1);
		System.out.println(collection1.contains("上海")); //collection1中是否包含“上海”
		                                                  //返回boolean类型
		
		collection1.remove("上海");   //删除collection1中的“上海”
		System.out.println(collection1.size());
		
		Collection<String> collection2 = new ArrayList<>();
		collection2.add("河北");
		collection2.add("河南");
		collection2.add("陕西");
		collection2.add("北京");
		System.out.println(collection2);
		
		System.out.println("------------------------------------------------------------------------------\n\n");
		
		ArrayList<String> c1 =(ArrayList<String>) (collection1.clone()); //克隆collection1赋给c1
		c1.addAll(collection2);  //添加collection2中所有的元素到c1中
		System.out.println(c1);  //打印c1中所有的元素

		c1 =(ArrayList<String>) (collection1.clone());
		c1.retainAll(collection2);  //返回布尔类型 ，仅保留此 collection 中那些也包含在指定 collection 的元素（可选操作）。换句话说，移除此 collection 中未包含在指定 collection 中的所有元素。   
		                            //如果c1 和 collection2中有相同的元素 返回true 并删除不同的元素
		                            //如果c1 和 collection2中的元素都相同  没有删除任何元素 则返回false
		System.out.println(c1);
		
		System.out.println("----------------------------------------------------------------------------\n\n");
		
		c1=(ArrayList<String>) collection1.clone();
		c1.removeAll(collection2);   //删除c1 和 collection2 中所有相同的元素
		System.out.println(c1);      //此处中只返回广东和深圳  上海在上文的代码中已经被删除
		
		LinkedList<Integer> aa =new LinkedList<>();
		
		
	}

}
