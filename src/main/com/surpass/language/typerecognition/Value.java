/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.typerecognition
 * @file: Value.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 		Java 8�������Ʋⷽ�����˺ܴ����ߡ��ںܶ�����£������������Ʋ��ȷ���Ĳ������ͣ���������ʹ��������ࡣ
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.typerecognition;

public class Value<T> {

	public static <T> T defaultValue() {
		return null;
	}

	public T getOrDefault(T value, T defaultValue) {
		return (value != null) ? value : defaultValue;
	}

}

/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/