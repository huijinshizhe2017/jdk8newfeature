/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lambda
 * @file: FunctionalInterfaceDemo.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 		���������Ͷ���˴���������˼�����ʹ���еĺ����Ѻõ�֧��lambda��
 *      ���ղ�ȡ�ķ����ǣ����Ӻ���ʽ�ӿڵĸ������ʽ�ӿھ���һ������һ����������ͨ�ӿڡ�
 *      �������Ľӿڣ����Ա���ʽת��Ϊlambda���ʽ��
 *      java.lang.Runnable��java.util.concurrent.Callable�Ǻ���ʽ�ӿ�����͵��������ӡ�
 *      ��ʵ��ʹ�ù����У�����ʽ�ӿ������׳���ģ�����ĳ�����ڽӿڶ�������������һ��������
 *      ��ʱ������ӿھͲ����Ǻ���ʽ���ˣ����ұ������Ҳ��ʧ�ܡ�
 *      Ϊ�˿˷�����ʽ�ӿڵ����ִ����Բ����ܹ���ȷ�����ӿ���Ϊ����ʽ�ӿڵ���ͼ��
 *      Java 8������һ�������ע��@FunctionalInterface��@FunctionalInterfaceע�⣩��
 *      �����ǿ�һ�����ֺ���ʽ�ӿڵĶ��壺
 *      
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.lambda;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	void method1();
	
	//FunctionalInterfaceע�⵼�²����ж������
	//void method2();
	
	/**
	 * Ĭ�Ϸ����뾲̬��������Ӱ�캯��ʽ�ӿڵ���Լ����������ʹ��
	 */
	default void defaultMethod() {           
    } 
}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/