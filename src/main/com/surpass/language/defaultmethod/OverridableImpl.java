/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.defaultmethod
 * @file: OverridableImpl.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 		����Ĭ�ϵķ������Ը���Ĭ��ʵ��
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.defaultmethod;

public class OverridableImpl implements Defaultable {


	//��дĬ��ʵ�ַ���
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