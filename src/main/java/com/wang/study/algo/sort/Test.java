/*
 * @(#)Test.java, 2012-4-24 下午01:57:41
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.sort;

import java.math.BigInteger;

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-4-24$
 */
public class Test
{

	/**
	 * 
	 */

	public static final int ONE =1;
	public static final int TWO =2;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		getWay(10);

	}
	
	public static void getWay(int number)
	{
		if (number ==1 ||number==0)
		{
			System.out.println(1);
			System.out.println("结束");
//			return 1;
		}else {
			int result1 = number-ONE;
			System.out.println("走:"+ONE);
			getWay(result1);
			int result2 = number-TWO;
			System.out.println("走:"+TWO);
			getWay(result2);
//			return getWay(result1)+getWay(result2);
			
		}
		
		
	}

}
