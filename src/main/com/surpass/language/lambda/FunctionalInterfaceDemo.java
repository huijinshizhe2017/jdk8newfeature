/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lambda
 * @file: FunctionalInterfaceDemo.java
 * @author: surpassLiang
 * @created: 2017年11月23日
 * @purpose:
 * 		语言设计者投入了大量精力来思考如何使现有的函数友好地支持lambda。
 *      最终采取的方法是：增加函数式接口的概念。函数式接口就是一个具有一个方法的普通接口。
 *      像这样的接口，可以被隐式转换为lambda表达式。
 *      java.lang.Runnable与java.util.concurrent.Callable是函数式接口最典型的两个例子。
 *      在实际使用过程中，函数式接口是容易出错的：如有某个人在接口定义中增加了另一个方法，
 *      这时，这个接口就不再是函数式的了，并且编译过程也会失败。
 *      为了克服函数式接口的这种脆弱性并且能够明确声明接口作为函数式接口的意图，
 *      Java 8增加了一种特殊的注解@FunctionalInterface（@FunctionalInterface注解）。
 *      让我们看一下这种函数式接口的定义：
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
	
	//FunctionalInterface注解导致不能有多个方法
	//void method2();
	
	/**
	 * 默认方法与静态方法并不影响函数式接口的契约，可以任意使用
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