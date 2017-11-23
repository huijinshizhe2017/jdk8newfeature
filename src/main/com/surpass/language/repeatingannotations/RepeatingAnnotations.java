/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.repeatingannotations
 * @file: RepeatingAnnotations.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 		�ظ�ע����Ʊ��������@Repeatableע�⡣
 *  	��ʵ�ϣ��Ⲣ�������Բ����ϵĸı䣬������Ǳ������ļ��ɣ��ײ��ԭ���ֲ��䡣
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