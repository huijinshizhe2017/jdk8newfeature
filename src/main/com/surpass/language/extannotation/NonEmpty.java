/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.extannotation
 * @file: NonEmpty.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 		ElementType.TYPE_USE和ElementType.TYPE_PARAMETER是两个新添加的用于描述适当的注解上下文的元素类型。
 * 		在Java语言中，注解处理API也有小的改动来识别新增的类型注解。
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