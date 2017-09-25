package com.ObjectIO;

import java.io.Serializable;

public class User implements Serializable{   //写入一个对象必须实现这个标记接口//标记接口
	                                         //java的很多类都实现了这个接口
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8324319250464820654L;   //序列ID
	private int id;
	private  String name;
	private transient int paw;   //关键字transient 标记为非序列化数据  不可被写入
	
	public User() {
		super();
	}
	
	
	public User(int id, String name, int paw) {
		super();
		this.id = id;
		this.name = name;
		this.paw = paw;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPaw() {
		return paw;
	}
	public void setPaw(int paw) {
		this.paw = paw;
	}
	

}
