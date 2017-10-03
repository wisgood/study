/*
 * @(#)InsertSort.java, 2012-4-24 上午09:43:18
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
public class InsertSort
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arrays = {1,6,5,4,3,2,4,6,1,1};
		InsertSort(arrays);
		for (int i : arrays)
		{
			System.out.println(i);
		}

	}
	
	
	public static void InsertSort(int[] arrays)
	{
		int watcher = arrays[0];
		for (int i = 1; i < arrays.length; i++)
		{
			if (arrays[i]<arrays[i-1])
			{
				watcher = arrays[i];
				arrays[i] = arrays[i-1];
				int j = i-2;
				if(j>=0)
				{
					
					for (; j>=0&&watcher<arrays[j]; j--)
					{
						arrays[j+1] =arrays[j];
					}
					
				}
				arrays[j+1] = watcher;
				
			}
		}
		
		
	}

}
