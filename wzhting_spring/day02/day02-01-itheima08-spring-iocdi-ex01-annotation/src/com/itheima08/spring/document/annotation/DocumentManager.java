package com.itheima08.spring.document.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * 既可以利用spring容器中的构造器注入,也可以利用setter方法进行注入
 * @author zd
 *
 */
@Component("documentManager")
public class DocumentManager {
	@Resource(name="excelDocument")
	private Document document;
	
	public void read(){
		this.document.read();
	}
	
	public void write(){
		this.document.write();
	}
}
