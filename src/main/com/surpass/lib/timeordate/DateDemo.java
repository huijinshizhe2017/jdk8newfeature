/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lib.clock
 * @file: DateDemo.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 
 *      Java 8通过发布新的Date-Time API (JSR 310)来进一步加强对日期与时间的处理。
 *      对日期与时间的操作一直是Java程序员最痛苦的地方之一。
 *      标准的 java.util.Date以及后来的java.util.Calendar一点没有改善这种情况（可以这么说，它们一定程度上更加复杂）。

		这种情况直接导致了Joda-Time——一个可替换标准日期/时间处理且功能非常强大的Java API的诞生。
		Java 8新的Date-Time API (JSR 310)在很大程度上受到Joda-Time的影响，并且吸取了其精髓。
		新的java.time包涵盖了所有处理日期，时间，日期/时间，时区，时刻（instants），过程（during）与时钟（clock）的操作。
		在设计新版API时，十分注重与旧版API的兼容性：不允许有任何的改变（从java.util.Calendar中得到的深刻教训）。
		如果需要修改，会返回这个类的一个新实例。
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
	 * 第一个是Clock类，它通过指定一个时区，然后就可以获取到当前的时刻，日期与时间。
	 * Clock可以替换System.currentTimeMillis()与TimeZone.getDefault()
	 */
	@Test
	public void clock1() {
		Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		System.out.println(clock.millis());
	}

	/*
	 * 我们需要关注的其他类是LocaleDate与LocalTime。 LocaleDate只持有ISO-8601格式且无时区信息的日期部分。
	 * 相应的，LocaleTime只持有ISO-8601格式且无时区信息的时间部分。 LocaleDate与LocalTime都可以从Clock中得到。
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