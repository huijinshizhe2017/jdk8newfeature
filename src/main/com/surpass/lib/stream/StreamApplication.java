/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lib.stream
 * @file: StreamApplication.java
 * @author: surpassLiang
 * @created: 2017��11��23��
 * @purpose:
 * 		�����м���ע�����
 * 			��һ��task���ϱ�ת����Ϊ����Ӧ��stream��ʾ��
 * 			Ȼ��filter�������˵�״̬ΪCLOSED��task��
 * 			��һ����mapToInt����ͨ��Task::getPoints���ַ�ʽ����ÿ��taskʵ����getPoints������Task��streamת��ΪInteger��stream��
 * 			�����sum���������еķ������������õ����յĽ����
 * 
 *      �м��������һ���µ�stream����
 *      �м�������ǲ��ö�����ֵ��ʽ������һ����filter�������м����ʵ����û�н����κι��ˣ�
 *      �෴���ڱ���Ԫ��ʱ�������һ���µ�stream��������µ�stream�������ԭʼstream
 *      
 *      ��forEach��sum���������ղ�������ֱ�ӱ���stream������һ����������á�
 *      �����ղ���ִ�н���֮��stream�ܵ�����Ϊ�Ѿ��������ˣ�û�п����ٱ�ʹ���ˡ�
 *      �ڴ��������£����ղ������ǲ��ü�����ֵ��ʽ��������ɵײ�����Դ�ı�����
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
	 * ��Ԫ�ؽ��з���
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