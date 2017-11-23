/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.defaultmethod
 * @file: OverridableImpl.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 		对于默认的方法可以覆盖默认实现
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.defaultmethod;

public class OverridableImpl implements Defaultable {


	//重写默认实现方法
	@Override
	public String notRequired() {
		return "overring method";
	}
}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/