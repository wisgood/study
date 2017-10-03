/*
 * @(#)ALO7.java, 2012-9-4 下午02:32:36
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;

/**
 * 和为n的连续正数序列
 * 
 * 例如输入 15，输出  12345  4567 78
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-9-4$
 */
public class Alo7 
{
	
	
	public static void main(String[] args)
	{
		int n = 15890;
		int small = 1;
		int big =2;
		int mid = (1+n)/2;
		int sum = small+big;
		while(small<mid)
		{
			if(sum == n)
			{
				for (int i = small; i <=big; i++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
			while(sum>n)
			{
				sum-=small;
				small++;
				if(sum == n)
				{
					for (int i = small; i <=big; i++)
					{
						System.out.print(i+" ");
					}
					System.out.println();
				}
			}
			big++;
			sum+=big;
			
			
		}
		
		
	}
}
