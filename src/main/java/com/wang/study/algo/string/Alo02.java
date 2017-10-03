/*
 * @(#)Alo02.java, 2012-9-29 上午09:23:38
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.string;

import java.rmi.Remote;

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-9-29$
 */
public class Alo02
{


	static char[] a = {'a','b','c'};
	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		perm(a, 0, a.length);
		
		Remote remote;

	}
	
	public static void perm(char[] a,int begin,int end)
	{
		if (begin==end-1)
		{
			for (char c : a)
			{
				System.out.print(c+" ");
				
			}
			System.out.println();
		}
		for(int i = begin;i<end;i++)
		{
			char temp = a[i];
			a[i] = a[begin];
			a[begin] = temp;
			perm(a, begin+1, end);
			temp = a[i];
			a[i] = a[begin];
			a[begin] = temp;
		}
		
		
		
		
	}


}
