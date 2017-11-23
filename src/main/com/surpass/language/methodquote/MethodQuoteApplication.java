/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.methodquote
 * @file: MethodQuoteApplication.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.methodquote;

import java.util.Arrays;
import java.util.List;

public class MethodQuoteApplication {
	
	public static void main(String[] args) {
		
		//是构造器引用，它的语法是Class::new，或者更一般的Class< T >::new。请注意构造器没有参数。
		final Car car1 = Car.createCar( Car::new );
		final Car car2 = Car.createCar( Car::new );
		final List< Car > cars = Arrays.asList( car1,car2 );
		
		//静态方法引用
		cars.forEach(Car::collide);
		
		//非静态方法引用，但是不能有参数
		cars.forEach(Car::repair);
		
		//最后，第四种方法引用是特定对象的方法引用，
		//它的语法是instance::method。
		//请注意，这个方法接受一个Car类型的参数
		final Car car = Car.createCar( Car::new );
		cars.forEach( car::follow );
	}

}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/