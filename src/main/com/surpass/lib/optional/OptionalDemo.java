/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lib.optional
 * @file: OptionalDemo.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 		Optionalʵ�����Ǹ������������Ա�������T��ֵ�����߽�������null
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
	 * �����ֵ ���Optional���ʵ��Ϊ�ǿ�ֵ�Ļ���isPresent()����true����ӷ���false��
	 * Ϊ�˷�ֹOptionalΪ��ֵ��orElseGet()����ͨ���ص�����������һ��Ĭ��ֵ��
	 * map()�����Ե�ǰOptional��ֵ����ת����Ȼ�󷵻�һ���µ�Optionalʵ����
	 * orElse()������orElseGet()�������ƣ�����orElse����һ��Ĭ��ֵ������һ���ص�������
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