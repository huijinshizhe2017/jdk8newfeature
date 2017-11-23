/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.methodquote
 * @file: Car.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 		方法引用提供了非常有用的语法，可以直接引用已有Java类或对象（实例）的方法或构造器。
 * 		与lambda联合使用，方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
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