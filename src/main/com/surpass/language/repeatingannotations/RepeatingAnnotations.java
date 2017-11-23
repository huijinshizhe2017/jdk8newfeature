/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.repeatingannotations
 * @file: RepeatingAnnotations.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 		重复注解机制本身必须用@Repeatable注解。
 *  	事实上，这并不是语言层面上的改变，更多的是编译器的技巧，底层的原理保持不变。
 * 
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.repeatingannotations;

public class RepeatingAnnotations {

	public static void main(String[] args) {
        for( Filter filter: Filterable.class.getAnnotationsByType( Filter.class ) ) {
            System.out.println( filter.value() );
        } 
	}
}

/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/