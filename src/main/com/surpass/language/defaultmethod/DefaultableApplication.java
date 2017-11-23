/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.defaultmethod
 * @file: DefaultableApplication.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 		��JVM�У�Ĭ�Ϸ�����ʵ���Ƿǳ���Ч�ģ�����ͨ���ֽ���ָ��Ϊ���������ṩ��֧�֡�
 * 		Ĭ�Ϸ����������ʹ�����е�Java�ӿڣ���ͬʱ�ܹ����������ı�����̡�
 * 		�ⷽ��õ������Ǵ����ķ�������ӵ�java.util.Collection�ӿ���ȥ��
 * 		stream()��parallelStream()��forEach()��removeIf()
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