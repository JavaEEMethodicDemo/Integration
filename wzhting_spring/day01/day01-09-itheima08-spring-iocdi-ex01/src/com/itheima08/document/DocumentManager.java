package com.itheima08.document;

/**
 * 既可以利用spring容器中的构造器注入,也可以利用setter方法进行注入
 * @author zd
 *
 */
public class DocumentManager {
	private Document document;
	
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public DocumentManager(){
		
	}
	public DocumentManager(Document document){
		this.document = document;
	}
	
	public void read(){
		this.document.read();
	}
	
	public void write(){
		this.document.write();
	}
}
