/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.typerecognition
 * @file: TypeInference.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.typerecognition;

public class TypeInference {
	
	public static void main(String[] args) {
		final Value<String> value = new Value<>();
		//在JDK7中，相同的例子将不会通过编译，正确的书写方式是 Value.<String>defaultValue()
		value.getOrDefault("22", Value.defaultValue());
	}

}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/