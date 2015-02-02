package com.itheima08.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class Privilege {
	private String access;

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}
	
	public void privilegeControl(ProceedingJoinPoint joinPoint) throws Throwable{
		if(this.getAccess().equals("admin")){
			joinPoint.proceed();
		}else{
			System.out.println("权限不足,没有办法访问");
		}
	}
}
