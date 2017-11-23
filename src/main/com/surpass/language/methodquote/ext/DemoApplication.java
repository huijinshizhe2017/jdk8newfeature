/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.language.methodquote.ext
 * @file: DemoApplication.java
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

public class DemoApplication {
	
	public static void main(String[] args) {
		People.getInstance(People::say);
	}

}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/