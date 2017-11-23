/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.methodquote
 * @file: Car.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 		���������ṩ�˷ǳ����õ��﷨������ֱ����������Java������ʵ�����ķ�����������
 * 		��lambda����ʹ�ã��������ÿ���ʹ���ԵĹ�������ռ�࣬����������롣
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.methodquote;

import java.util.function.Supplier;

public class Car {

	public static Car createCar(Supplier<Car> supplier) {
		return supplier.get();
	}

	public static void collide(final Car car) {
		System.out.println("collide" + car.toString());
	}

	public void follow(final Car car) {
		System.out.println("Follow" + car.toString());
	}

	public void repair() {
		System.out.println("Repair" + this.toString());
	}

}

/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/