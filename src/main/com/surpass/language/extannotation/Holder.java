/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.extannotation
 * @file: Holder.java
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

package com.surpass.language.extannotation;

public class Holder<@NonEmpty T> extends @NonEmpty Object{
	
	//抛出异常添加注解
	public void method() throws @NonEmpty Exception{
		
	}

}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/