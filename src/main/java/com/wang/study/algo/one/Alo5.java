/*
 * @(#)Alo5.java, 2012-8-30 下午04:21:31
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;

/**
 * 1:设计一个算法，从顺序表中删除所有值为x的元素
 * 2：设计一个算法，从顺序表中删除所有值在x和y之间的元素
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-8-30$
 */
public class Alo5
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a = {1,2,4,78,0,45,0,0,0,89};
		int i = 0;
		while(i<a.length&&a[i]!=0)
		{
			i++;
		}
		for(int j = i+1;j<a.length;j++)
		{
			if(a[j]!=0)
			{
				a[i] = a[j];
				i++;
			}
			
		}
		for (int j = 0; j < i; j++)
		{
			System.out.println(a[j]);
		}

	}

}
