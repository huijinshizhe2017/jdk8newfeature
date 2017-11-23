/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lib.base64
 * @file: Base64Demo.java
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

package com.surpass.lib.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Demo {
	public static void main(String[] args) {
		String text = "Base64 finally in Java 8!";
        String encoded = Base64.getEncoder().encodeToString( text.getBytes( StandardCharsets.UTF_8 ) );
        System.out.println( encoded );
        String decoded = new String(Base64.getDecoder().decode( encoded ),StandardCharsets.UTF_8 );
        System.out.println( decoded );
	}
}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/