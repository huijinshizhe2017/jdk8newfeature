/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.repeatingannotations
 * @file: Filters.java
 * @author: surpassLiang
 * @created: 2017Äê11ÔÂ23ÈÕ
 * @purpose:
 * 
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.repeatingannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Filters {
	Filter[] value();
}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/