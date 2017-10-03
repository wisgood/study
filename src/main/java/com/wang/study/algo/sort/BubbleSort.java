/*
 * @(#)BubbleSort.java, 2012-4-24 上午10:50:31
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.sort;

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-4-24$
 */
public class BubbleSort
{
	
	public static void main(String[] args)
	{
		int[] arrays = {1,6,5,4,3,2,4,6,1,1};
		BubbleSort(arrays);
		for (int i : arrays)
		{
			System.out.println(i);
		}
	}
	
//	public static void BubbleSort(int[] arrays)
//	{
//		for (int i = 0; i < arrays.length-1; i++)
//		{
//			for (int j = 0; j < arrays.length-i-1; j++)
//			{
//				if (arrays[j]>arrays[j+1])
//				{
//					int temp = arrays[j+1];
//					arrays[j+1] = arrays[j];
//					arrays[j] = temp;
//				}
//			}
//		}
//	}
	
	public static void BubbleSort(int[] arrays)
	{
		for (int i = 0; i < arrays.length-1; i++)
		{
			for (int j = 0; j < arrays.length-i-1; j++)
			{
				if (arrays[j]>arrays[j+1])
				{
					int temp = arrays[j+1];
					arrays[j+1] = arrays[j];
					arrays[j] = temp;
				}
			}
		}
	}

}
