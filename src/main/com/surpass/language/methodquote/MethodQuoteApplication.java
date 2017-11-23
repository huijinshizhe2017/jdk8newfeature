/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.methodquote
 * @file: MethodQuoteApplication.java
 * @author: surpassLiang
 * @created: 2017��11��23��
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
		
		//�ǹ��������ã������﷨��Class::new�����߸�һ���Class< T >::new����ע�⹹����û�в�����
		final Car car1 = Car.createCar( Car::new );
		final Car car2 = Car.createCar( Car::new );
		final List< Car > cars = Arrays.asList( car1,car2 );
		
		//��̬��������
		cars.forEach(Car::collide);
		
		//�Ǿ�̬�������ã����ǲ����в���
		cars.forEach(Car::repair);
		
		//��󣬵����ַ����������ض�����ķ������ã�
		//�����﷨��instance::method��
		//��ע�⣬�����������һ��Car���͵Ĳ���
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