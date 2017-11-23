/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lib.clock
 * @file: DateDemo.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 
 *      Java 8ͨ�������µ�Date-Time API (JSR 310)����һ����ǿ��������ʱ��Ĵ���
 *      ��������ʱ��Ĳ���һֱ��Java����Ա��ʹ��ĵط�֮һ��
 *      ��׼�� java.util.Date�Լ�������java.util.Calendarһ��û�и������������������ô˵������һ���̶��ϸ��Ӹ��ӣ���

		�������ֱ�ӵ�����Joda-Time����һ�����滻��׼����/ʱ�䴦���ҹ��ܷǳ�ǿ���Java API�ĵ�����
		Java 8�µ�Date-Time API (JSR 310)�ںܴ�̶����ܵ�Joda-Time��Ӱ�죬������ȡ���侫�衣
		�µ�java.time�����������д������ڣ�ʱ�䣬����/ʱ�䣬ʱ����ʱ�̣�instants�������̣�during����ʱ�ӣ�clock���Ĳ�����
		������°�APIʱ��ʮ��ע����ɰ�API�ļ����ԣ����������κεĸı䣨��java.util.Calendar�еõ�����̽�ѵ����
		�����Ҫ�޸ģ��᷵��������һ����ʵ����
 * 
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.lib.timeordate;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

public class DateDemo {

	/*
	 * ��һ����Clock�࣬��ͨ��ָ��һ��ʱ����Ȼ��Ϳ��Ի�ȡ����ǰ��ʱ�̣�������ʱ�䡣
	 * Clock�����滻System.currentTimeMillis()��TimeZone.getDefault()
	 */
	@Test
	public void clock1() {
		Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		System.out.println(clock.millis());
	}

	/*
	 * ������Ҫ��ע����������LocaleDate��LocalTime�� LocaleDateֻ����ISO-8601��ʽ����ʱ����Ϣ�����ڲ��֡�
	 * ��Ӧ�ģ�LocaleTimeֻ����ISO-8601��ʽ����ʱ����Ϣ��ʱ�䲿�֡� LocaleDate��LocalTime�����Դ�Clock�еõ���
	 */
	@Test
	public void localeDateDemo() {
		Clock clock = Clock.systemUTC();
		// Get the local date and local time
		final LocalDate date = LocalDate.now();
		final LocalDate dateFromClock = LocalDate.now(clock);

		System.out.println(date);
		System.out.println(dateFromClock);

		// Get the local date and local time
		final LocalTime time = LocalTime.now();
		final LocalTime timeFromClock = LocalTime.now(clock);

		System.out.println(time);
		System.out.println(timeFromClock);
	}

}

/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/