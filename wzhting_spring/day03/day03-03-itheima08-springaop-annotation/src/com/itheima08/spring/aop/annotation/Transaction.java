package com.itheima08.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Aspect
 * ==
 * <aop:config>
 * 		<aop:pointcut 
    		expression="execution(* com.itheima08.spring.aop.annotation.PersonDaoImpl.*(..))" 
    		id="aa()"/>
 * </aop:config>
 * @author zd
 *
 */
@Component("transaction")
@Aspect
public class Transaction {
	
	@Pointcut("execution(* com.itheima08.spring.aop.annotation.PersonDaoImpl.*(..))")
	private void aa(){}  //方法签名
	
	@Before("aa()")
	public void beginTransaction(JoinPoint joinPoint){
		//连接点的名称
		System.out.println(joinPoint.getSignature().getName());
		//目标类
		System.out.println(joinPoint.getTarget().getClass());
		joinPoint.getArgs();//连接点的参数
		System.out.println("begin transaction");
	}
}
