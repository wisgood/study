/*
 * @(#)Student.java, 2012-9-21 涓婂崍11:33:07
 *
 * Copyright (c) 2000-2007, 杈炬ⅵ鏁版嵁搴撴湁闄愬叕鍙�
 * All rights reserved.
 */
package com.wang.study.clone;

import java.io.Serializable;
import java.util.Date;

/**
 * 鍦ㄨ繖閲屽姞鍏ュ姛鑳借鏄�
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-9-21$
 */
//瀛︾敓绫诲疄鐜颁簡娴呭厠闅�
class Student implements Cloneable ,Serializable{
	public  char ssex;
	public Date date;
	///////////////////////
	@Override
	public Student clone() throws CloneNotSupportedException{
		Student student =(Student) super.clone();
		return student;	
	}	
}