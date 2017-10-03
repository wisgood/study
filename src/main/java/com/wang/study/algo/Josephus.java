package com.wang.study.algo;

import java.util.ArrayList;

/*
 * @(#)Test.java, 2012-4-27 下午03:27:05
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */

/**
 * 约瑟夫环问题
 * 
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-4-27$
 */
public class Josephus
{

	public static int test(int len,int m)
	{
		ArrayList<String> data = new ArrayList<String>();
		for (int i = 0; i <= len - 1; i++)
		{
			data.add(i + "");
		}
		int search = 0;
		for (int i = 0; i < len - 1; i++)
		{
			search += m;
			search %= data.size();
			System.out.println(data.remove(search));
		}
		return Integer.parseInt(data.get(0).toString());
	}

	public static void main(String[] args)
	{
		int result = test(7,5);
		System.out.println("final result:" + result);
		getLastNumber(7, 6);
	}
	
	
	public static void getLastNumber(int len,int m)
	{
		int last = 0;
		for(int i = 2;i<=len;i++)
		{
			last =(last+m)%i;
		}
		System.out.println("the last number is "+last);
	}

}
