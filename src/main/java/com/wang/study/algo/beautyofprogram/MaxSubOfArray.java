/*
 * @(#)MaxSubOfArray.java, 2012-8-24 下午03:54:44
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.beautyofprogram;


/**
 * 
 * 求数组的最大子数组和 
 * 
 * 
 * 
 */
/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-8-24$
 */
public class MaxSubOfArray
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] array = {1,3,-6,8,0,0,4,-9,12};
		
		int currentSum = 0;
		int maxSum = 0;
		for (int i = 0; i < array.length; i++)
		{
			currentSum+=array[i];
			if(currentSum<0)
			{
				currentSum = 0;
			}
			
			if(currentSum>maxSum)
			{
				maxSum = currentSum;
			}
		}
		
		if(maxSum==0)
		{
			maxSum = array[0];
			for (int i = 1; i < array.length; i++)
			{
				if(array[i]>maxSum)
				{
					maxSum = array[i];
				}
			}
		}
		
		System.out.println(3%2);

	}

}
