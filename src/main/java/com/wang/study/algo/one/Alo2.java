/*
 * @(#)Alo2.java, 2012-8-28 下午04:11:32
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;
/**
 * 
 * 字符串转变为整数
 * 如“12345”变为12345
 * 
 * 
 */
/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-8-28$
 */
public class Alo2
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String string = "12345";
		int sum = 0;
		for (int i = 0; i < string.length(); i++)
		{
			int temp = string.charAt(i)-'0';
			sum*=10;
			sum+=temp;
			System.out.println("该位值是:"+temp+",和是"+sum);
		}
		
		System.out.println("Hello,I am DMETL!");

	}

}
