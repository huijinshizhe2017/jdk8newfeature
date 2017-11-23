/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.defaultmethod
 * @file: Defaultable.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 		Ĭ�Ϸ�������󷽷���֮ͬ�����ڳ��󷽷�����Ҫ��ʵ�֣�����Ĭ�Ϸ�����û�����Ҫ��
 *      �෴��ÿ���ӿڶ������ṩһ����ν��Ĭ��ʵ�֣�
 *      �������еĽӿ�ʵ���߽���Ĭ�ϼ̳���������б�Ҫ�Ļ������Ը������Ĭ��ʵ�֣�
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