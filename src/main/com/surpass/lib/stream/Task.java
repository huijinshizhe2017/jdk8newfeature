/*******************************************************************************
 * @project: jdk8NewFeature
 * @package: com.surpass.lib.stream
 * @file: Task.java
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

package com.surpass.lib.stream;

public class Task {
	
	private Status status;
	private Integer points;
	
	public Task(Status status,Integer points){
		this.status = status;
		this.points = points;
	}
	
	
	public Status getStatus() {
		return status;
	}
	public Integer getPoints() {
		return points;
	}
	
	@Override
    public String toString() {
        return String.format( "[%s, %d]", status, points );
    }
	
	

}


/*******************************************************************************
 * <B>Revision History</B><BR>
 * 
 * 
 * 
 * Copyright 2017 surpass All rights reserved.
 ******************************************************************************/