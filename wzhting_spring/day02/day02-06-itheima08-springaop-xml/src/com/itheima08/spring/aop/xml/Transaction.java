package com.itheima08.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class Transaction {
	/**
	 * 通过该参数可以获取连接点的一些信息
	 * @param joinPoint
	 */
	public void beginTransaction(JoinPoint joinPoint){
		//连接点的名称
		System.out.println(joinPoint.getSignature().getName());
		//目标类
		System.out.println(joinPoint.getTarget().getClass());
		joinPoint.getArgs();//连接点的参数
		System.out.println("begin transaction");
	}
	
	/**
	 * 后置通知
	 * @param joinPoint
	 * @param val
	 */
	public void commit(JoinPoint joinPoint,Object val){
		System.out.println("after:"+joinPoint.getSignature().getName());
		System.out.println("commit");
		System.out.println(val);
	}
	
	/**
	 * 异常通知
	 */
	public void throwingMethod(Throwable ex){
		System.out.println(ex.getMessage());
	}
	
	/**
	 * 最终通知
	 */
	public void finalyMethod(){
		System.out.println("finally method");
	}
	
	/**
	 * 环绕通知
	 */
	public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable{
		joinPoint.proceed();//执行目标方法
	}
}
