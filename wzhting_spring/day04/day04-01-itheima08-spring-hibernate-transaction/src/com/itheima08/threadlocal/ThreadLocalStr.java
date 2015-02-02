package com.itheima08.threadlocal;

public class ThreadLocalStr {
	private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
	
	public static String getString(){
		if(threadLocal.get()==null){
			threadLocal.set("aaa");
		}
		return threadLocal.get();
	}
}
