/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.typerecognition
 * @file: TypeInference.java
 * @author: surpassLiang
 * @created: 2017��11��23��
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
		//��JDK7�У���ͬ�����ӽ�����ͨ�����룬��ȷ����д��ʽ�� Value.<String>defaultValue()
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