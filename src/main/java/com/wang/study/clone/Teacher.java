/*
 * @(#)Teacher.java, 2012-9-21 上午11:33:39
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.clone;

import java.io.Serializable;
import java.util.Date;

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-9-21$
 */
//教师类实现了深克隆
class Teacher implements Cloneable,Serializable {
	public  char ssex;
	public Date date;
	public  Teacher clone() throws CloneNotSupportedException{
		Teacher teacher =(Teacher) super.clone();
		//以下为深浅克隆的重要区别
		teacher.date =(Date) date.clone(); 
		return teacher;		
	}	
}