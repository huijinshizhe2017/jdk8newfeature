/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lambda
 * @file: LambdaDemo.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:测试Lambda的新特性
 *     Lambda表达式（也称为闭包）是整个Java 8发行版中最受期待的在Java语言层面上的改变，
 *     Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中），
 *     或者把代码看成数据：函数式程序员对这一概念非常熟悉。
 *     在JVM平台上的很多语言（Groovy，Scala，……）从一开始就有Lambda，
 *     但是Java程序员不得不使用毫无新意的匿名类来代替lambda。
 *     
 *     本例主要通过List的foreach函数演示
 * 
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

public class LambdaDemo {
	
	/**
	 * 使用JDK8之前版本的解决办法，通过匿名内部类实现
	 */
	@Test
	public void testOriginal(){
		System.out.println("============原始方式=================");
		Arrays.asList("a","b","c").forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
	}
	
	
	/**
	 * 在最简单的形式中，一个lambda可以由用逗号分隔的参数列表、–>符号与函数体三部分表示。
	 */
	@Test
	public void testSimple(){
		System.out.println("================lambda简单形式===================");
		Arrays.asList("a","b","c").forEach(e -> System.out.println(e));
	}
	
	/**
	 * 在使用的泛型的方法中，可以通过把参数类型与参数包括在括号中的形式直接给出参数的类型
	 */
	@Test
	public void testParameter(){
		System.out.println("==================泛型指定类型=======================");
		Arrays.asList("a","b","c").forEach((String e) -> System.out.println(e));
	}
	
	
	/**
	 * 存在多行语句的情况下，用｛｝括起来就可以
	 */
	@Test
	public void testMultiline(){
		System.out.println("==================多行语句=======================");
		Arrays.asList("a","b","c").forEach((String e) -> {
			System.out.println("第一行输出:" + e);
			System.out.println("第二行输出:" + e);
		});
	}
	
	
	/**
	 * 引用局部变量,局部变量就是默认增加final关键字，
	 * 如果对这个变量重新赋值，lambda语句就是报错，提示局部变量必须是final修饰。
	 * 所以建议，lambda用到的局部变量手动加上final,防止其他改动引起报错
	 * 
	 */
	@Test
	public void testLocalVariable(){
		System.out.println("==================引用局部变量=======================");
		final String pre = "此次输出字符未:";
		Arrays.asList("a","b","c").forEach((String e) -> System.out.println(pre + e));
	}
	
	/**
	 * 如果包含返回值，语句块如果只有一句话，可以省略
	 */
	@Test
	public void testContainReturn(){
		List<String> list = Arrays.asList( "a", "d", "b" );
		
		//与下面的语句等价
		list.sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		
//		list.sort( ( e1, e2 ) -> {
//			int result = e1.compareTo( e2 );
//			return result;
//		});
		list.forEach((String e) -> System.out.println(e));
	}

}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/