/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lib.optional
 * @file: OptionalDemo.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 		Optional实际上是个容器：它可以保存类型T的值，或者仅仅保存null
 * 
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.lib.optional;

import java.util.Optional;

import org.junit.Test;

public class OptionalDemo {

	/*
	 * 允许空值 如果Optional类的实例为非空值的话，isPresent()返回true，否从返回false。
	 * 为了防止Optional为空值，orElseGet()方法通过回调函数来产生一个默认值。
	 * map()函数对当前Optional的值进行转化，然后返回一个新的Optional实例。
	 * orElse()方法和orElseGet()方法类似，但是orElse接受一个默认值而不是一个回调函数。
	 */
	@Test
	public void allowNull() {
		Optional<String> fullName = Optional.ofNullable(null);
		System.out.println("Full name is set?" + fullName.isPresent());
		System.out.println("Full name:" + fullName.orElseGet(() -> "[None]"));
		System.out.println(fullName.map(s -> "Hey" + s + "!").orElse("hey,Stranger"));
	}

	/**
	 * 
	 */
	@Test
	public void notAllowNull() {
		Optional<String> firstName = Optional.of("Tom");
		System.out.println("First Name is set? " + firstName.isPresent());
		System.out.println("First Name: " + firstName.orElseGet(() -> "[none]"));
		System.out.println(firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
		System.out.println();
	}

}

/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/