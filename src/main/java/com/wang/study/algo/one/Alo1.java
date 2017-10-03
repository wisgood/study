/*
 * @(#)Alo1.java, 2012-8-28 下午04:01:47
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;

/**
 * 
 * 
 * 一个圆圈中最后剩余的数字
 * n个数字，从0开始 0 1 2 。。。 n-1
 * 删除第m个
 * 
 */
public class Alo1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		int n = 7;
		int m = 3;
		
		int last = 0;
		for (int i = 2; i<=n; i++)
		{
			last = (last+m)%i;
		}
		
		System.out.println("最后一个删除的数字是："+last);

	}

}
