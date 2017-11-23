/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lambda
 * @file: LambdaDemo.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:����Lambda��������
 *     Lambda���ʽ��Ҳ��Ϊ�հ���������Java 8���а��������ڴ�����Java���Բ����ϵĸı䣬
 *     Lambda����Ѻ�����Ϊһ�������Ĳ�����������Ϊ�������ݽ������У���
 *     ���߰Ѵ��뿴�����ݣ�����ʽ����Ա����һ����ǳ���Ϥ��
 *     ��JVMƽ̨�ϵĺܶ����ԣ�Groovy��Scala����������һ��ʼ����Lambda��
 *     ����Java����Ա���ò�ʹ�ú��������������������lambda��
 *     
 *     ������Ҫͨ��List��foreach������ʾ
 * 
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

public class LambdaDemo {
	
	/**
	 * ʹ��JDK8֮ǰ�汾�Ľ���취��ͨ�������ڲ���ʵ��
	 */
	@Test
	public void testOriginal(){
		System.out.println("============ԭʼ��ʽ=================");
		Arrays.asList("a","b","c").forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
	}
	
	
	/**
	 * ����򵥵���ʽ�У�һ��lambda�������ö��ŷָ��Ĳ����б��C>�����뺯���������ֱ�ʾ��
	 */
	@Test
	public void testSimple(){
		System.out.println("================lambda����ʽ===================");
		Arrays.asList("a","b","c").forEach(e -> System.out.println(e));
	}
	
	/**
	 * ��ʹ�õķ��͵ķ����У�����ͨ���Ѳ�����������������������е���ʽֱ�Ӹ�������������
	 */
	@Test
	public void testParameter(){
		System.out.println("==================����ָ������=======================");
		Arrays.asList("a","b","c").forEach((String e) -> System.out.println(e));
	}
	
	
	/**
	 * ���ڶ�����������£��ã����������Ϳ���
	 */
	@Test
	public void testMultiline(){
		System.out.println("==================�������=======================");
		Arrays.asList("a","b","c").forEach((String e) -> {
			System.out.println("��һ�����:" + e);
			System.out.println("�ڶ������:" + e);
		});
	}
	
	
	/**
	 * ���þֲ�����,�ֲ���������Ĭ������final�ؼ��֣�
	 * ���������������¸�ֵ��lambda�����Ǳ�����ʾ�ֲ�����������final���Ρ�
	 * ���Խ��飬lambda�õ��ľֲ������ֶ�����final,��ֹ�����Ķ����𱨴�
	 * 
	 */
	@Test
	public void testLocalVariable(){
		System.out.println("==================���þֲ�����=======================");
		final String pre = "�˴�����ַ�δ:";
		Arrays.asList("a","b","c").forEach((String e) -> System.out.println(pre + e));
	}
	
	/**
	 * �����������ֵ���������ֻ��һ�仰������ʡ��
	 */
	@Test
	public void testContainReturn(){
		List<String> list = Arrays.asList( "a", "d", "b" );
		
		//����������ȼ�
		list.sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		
//		list.sort( ( e1, e2 ) -> {
//			int result = e1.compareTo( e2 );
//			return result;
//		});
		list.forEach((String e) -> System.out.println(e));
	}

}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/