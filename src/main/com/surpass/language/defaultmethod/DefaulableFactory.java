/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.defaultmethod
 * @file: DefaulableFactory.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 		Java 8��������һ����Ȥ�������ǽӿڿ������������ҿ����ṩʵ�֣���̬������
 * 
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.defaultmethod;

import java.util.function.Supplier;

public interface DefaulableFactory {
	static Defaultable create(Supplier<Defaultable> supplier){
		return supplier.get();
	}
}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/