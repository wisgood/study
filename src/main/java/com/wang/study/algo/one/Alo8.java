/*
 * @(#)Alo8.java, 2012-9-11 下午04:05:21
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;

import java.rmi.Remote;


/**
 * 字符串全排列算法
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-9-11$
 */
public class Alo8
{
	static char[] a = {'a','b','c','d','e'};
	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		perm(a, 0);
		
		Remote remote;

	}
	
	public static void perm(char[] a,int begin)
	{
		if (begin==a.length-1)
		{
			for (char c : a)
			{
				System.out.print(c+" ");
				
			}
			System.out.println();
		}
		for(int i = begin;i<a.length;i++)
		{
			char temp = a[i];
			a[i] = a[begin];
			a[begin] = temp;
			perm(a, begin+1);
			temp = a[i];
			a[i] = a[begin];
			a[begin] = temp;
		}
		
		
		
		
	}
	
	
//	public static void perm(char[] a,int begin,int end)
//	{
//		if (begin==end-1)
//		{
//			for (char c : a)
//			{
//				System.out.print(c+" ");
//				
//			}
//			System.out.println();
//		}
//		for(int i = begin;i<end;i++)
//		{
//			char temp = a[i];
//			a[i] = a[begin];
//			a[begin] = temp;
//			perm(a, begin+1, end);
//			temp = a[i];
//			a[i] = a[begin];
//			a[begin] = temp;
//		}
//		
//		
//		
//		
//	}

}
