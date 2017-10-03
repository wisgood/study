/*
 * @(#)Alo11.java, 2012-10-11 下午04:00:25
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;

import java.util.LinkedList;
import java.util.List;

/**
 * 在这里加入功能说明
 *打靶问题。一个射击运动员打靶，靶一共有10环，连开10 枪打中90环的可能性有多少？
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-10-11$
 */
public class Alo11
{
	static int totalSum = 0;
	
	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		int sum = 90;
		int num = 10;
		List<Integer> list = new LinkedList<Integer>();
		f(num, sum, list);
		

	}
	
	public static void f(int num,int sum,List<Integer> list)
	{
		
		if(num==1)
		{
			if(sum<=10)
			{
				totalSum++;
				System.out.print("第"+totalSum+"种:");
				for (Integer integer : list)
				{
					System.out.print(" "+integer);
				}
				System.out.print(" "+sum);
			}
			System.out.println();
			return ;
		}
		for (int i = 0; i <= 10; i++)
		{
			list.add(i);
			f(num-1, sum-i, list);
			list.remove(new Integer(i));
		}
	}

}
