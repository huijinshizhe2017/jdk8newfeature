/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.methodquote.ext
 * @file: People.java
 * @author: surpassLiang
 * @created: 2017Äê11ÔÂ23ÈÕ
 * @purpose:
 * 
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2017 surpassLiang All rights reserved.
 ******************************************************************************/

package com.surpass.language.methodquote.ext;

public class People {
	
	public static People getInstance(PeopleFactory<People> factory){
		return factory.get();
	}
	
	public static People say(){
		System.out.println("hello,I am Tom");
		return new People();
	}

}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/