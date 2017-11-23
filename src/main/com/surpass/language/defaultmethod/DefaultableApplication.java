/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.defaultmethod
 * @file: DefaultableApplication.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 		在JVM中，默认方法的实现是非常高效的，并且通过字节码指令为方法调用提供了支持。
 * 		默认方法允许继续使用现有的Java接口，而同时能够保障正常的编译过程。
 * 		这方面好的例子是大量的方法被添加到java.util.Collection接口中去：
 * 		stream()，parallelStream()，forEach()，removeIf()
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.defaultmethod;

public class DefaultableApplication {
	
	public static void main(String[] args) {
		Defaultable defaultable = DefaulableFactory.create(DefaultableImpl::new);
		System.out.println(defaultable.notRequired());
		
		defaultable = DefaulableFactory.create(OverridableImpl::new);
		System.out.println(defaultable.notRequired());
	}

}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/