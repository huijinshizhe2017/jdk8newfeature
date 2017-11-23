/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.typerecognition
 * @file: Value.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 		Java 8在类型推测方面有了很大的提高。在很多情况下，编译器可以推测出确定的参数类型，这样就能使代码更整洁。
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