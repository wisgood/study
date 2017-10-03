package com.wang.study.algo;/*
 * @(#)FindBigestSumOfSubArray.java, 2012-4-25 上午11:34:48
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-4-25$
 */
public class FindBigestSumOfSubArray
{
	
	
	public static void main(String[] args)
	{
		int[] arrays = {1,-2,3,10,-4,7,2,-5};
		int currentSum = 0;
		int maxSum = 0;
		for (int i = 0; i < arrays.length; i++)
		{
			currentSum+=arrays[i];
			if (currentSum<0)
			{
				currentSum = 0;
				System.out.println(arrays[i]);
			}
			if (currentSum>maxSum)
			{
				
				maxSum = currentSum;
				System.out.println(arrays[i]);
			}
		}
		System.out.println(maxSum);
	}
}
