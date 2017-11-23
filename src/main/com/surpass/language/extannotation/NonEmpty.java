/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.extannotation
 * @file: NonEmpty.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 		ElementType.TYPE_USE��ElementType.TYPE_PARAMETER����������ӵ����������ʵ���ע�������ĵ�Ԫ�����͡�
 * 		��Java�����У�ע�⴦��APIҲ��С�ĸĶ���ʶ������������ע�⡣
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.extannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE,ElementType.PARAMETER})
public @interface NonEmpty {

}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/