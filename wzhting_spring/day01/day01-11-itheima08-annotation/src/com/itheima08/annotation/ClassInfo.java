package com.itheima08.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//说明该注解只能出现在类或者接口中
/**
 * RetentionPolicy.RUNTIME
 *    在java,class,runtime中都可以使用
 * RetentionPolicy.CLASS
 *    在java,class文件中可以使用
 * RetentionPolicy.SOURCE
 *    只能在java文件中起作用
 * @author zd
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented  //该注解是否可以出现在帮助文档上
public @interface ClassInfo {
	String value() default "";   //给该注解声明了一个属性为value,并且默认值为""
}
