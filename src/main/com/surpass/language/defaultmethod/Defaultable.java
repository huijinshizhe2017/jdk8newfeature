/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.defaultmethod
 * @file: Defaultable.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 		默认方法与抽象方法不同之处在于抽象方法必须要求实现，但是默认方法则没有这个要求。
 *      相反，每个接口都必须提供一个所谓的默认实现，
 *      这样所有的接口实现者将会默认继承它（如果有必要的话，可以覆盖这个默认实现）
 *      
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.defaultmethod;

public interface Defaultable {

	/**
	 * Interfaces now allow default methods, the implementer may or
	 * may not implement (override) them.
	 * @return
	 */
	default String notRequired(){
		return "default return";
	}
	
}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/