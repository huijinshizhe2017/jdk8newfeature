/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lib.stream
 * @file: StreamApplication.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 		这里有几个注意事项。
 * 			第一，task集合被转换化为其相应的stream表示。
 * 			然后，filter操作过滤掉状态为CLOSED的task。
 * 			下一步，mapToInt操作通过Task::getPoints这种方式调用每个task实例的getPoints方法把Task的stream转化为Integer的stream。
 * 			最后，用sum函数把所有的分数加起来，得到最终的结果。
 * 
 *      中间操作返回一个新的stream对象。
 *      中间操作总是采用惰性求值方式，运行一个像filter这样的中间操作实际上没有进行任何过滤，
 *      相反它在遍历元素时会产生了一个新的stream对象，这个新的stream对象包含原始stream
 *      
 *      像forEach、sum这样的最终操作可能直接遍历stream，产生一个结果或副作用。
 *      当最终操作执行结束之后，stream管道被认为已经被消耗了，没有可能再被使用了。
 *      在大多数情况下，最终操作都是采用及早求值方式，及早完成底层数据源的遍历。
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.lib.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class StreamApplication {
	
	private Collection<Task> tasks;
	
	@Before
	public void before(){
		tasks = Arrays.asList(new Task(Status.OPEN,5),
				new Task(Status.OPEN,13),
				new Task(Status.CLOSED,8));
	}

	@Test
	public void stream1(){
		long totalPointsOfOpenTasks = tasks.stream()
									       .filter(task -> task.getStatus() == Status.OPEN)
									       .mapToInt(Task::getPoints)
									       .sum();
		System.out.println("Total points: " + totalPointsOfOpenTasks);
	}
	
	@Test
	public void stream2(){
		double totalPointsOfOpenTasks = tasks.stream()
											 .parallel()
									         .map(task -> task.getPoints())//.map(Task::getePoints)
									         .reduce(0, Integer::sum);
		System.out.println("Total points: " + totalPointsOfOpenTasks);
	}
	
	
	/**
	 * 对元素进行分组
	 */
	
	@Test
	public void stream3(){
		Map<Status,List<Task>> map = tasks.stream()
				                          .collect(Collectors.groupingBy(Task::getStatus));
		System.out.println(map);
	}
	
	
	@Test
	public void streamAverage(){
		Collection<String> result = tasks.stream()
				                          .mapToInt(Task::getPoints)
				                          .asLongStream()
				                          .mapToDouble(points -> points / tasks.size() )
				                          .boxed()
				                          .mapToLong(weight -> (long)(weight * 100))
				                          .mapToObj(percentage -> percentage + "%")
				                          .collect(Collectors.toList());
		System.out.println(result);
	}
}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/