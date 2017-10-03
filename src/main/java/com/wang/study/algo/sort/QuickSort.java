/*
 * @(#)QuickSort.java, 2012-4-24 上午10:57:03
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
public class QuickSort
{
	public static void main(String[] args)
	{
		int[] arrays = {1,6,5,4,-1,3,2,4,6,1,1};
		QuickSort(arrays, 0, arrays.length-1);
		for (int i : arrays)
		{
			System.out.println(i);
		}
	}
	
	public static void QuickSort(int[] arrays,int low,int high)
	{
		if (low<high)
		{
			int pivotLoc = Partion(arrays, low, high);
			QuickSort(arrays, low, pivotLoc-1);
			QuickSort(arrays, pivotLoc+1, high);
		}
	
		
	}
	
	public static int Partion(int[] arrays,int low,int high)
	{
		
		int pivotkey = arrays[low];
		while (low<high)
		{
			while (low<high&&arrays[high]>=pivotkey)
			{
				high--;
			}
			arrays[low] = arrays[high];
			while (low<high&&arrays[low]<=pivotkey)
			{
				low++;
			}
			arrays[high] = arrays[low];
		}
		arrays[low] = pivotkey;
		return low;
	}

}
