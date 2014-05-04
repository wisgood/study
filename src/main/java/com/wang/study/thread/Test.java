/*
 * @(#)Test.java, 2012-11-1 上午09:09:47
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.thread;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-11-1$
 */
public class Test
{
	
	static int i = 0;

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	System.out.println(testSeq());
	System.gc();
		
	}
	
	public static String testSeq(){  
		   String result = "";  
		      int i = 0;   
		      try{  
		            i = 7/i;   
		            System.out.println("in try...");   
		            return "try";   
		       }catch(Exception e){   
		            e.printStackTrace();   
		            System.out.println("In catch...");  
		            System.exit(0);
		            return "catch";   
		       }finally{  
		            System.out.println("In finally....");  
		            return "finally";   
		       }   
	}
}
