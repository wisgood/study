/*
 * @(#)BinSearch.java, 2012-4-24 下午04:15:37
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.search;

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-4-24$
 */
public class BinSearch
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arrays = {1,2,3,4,5,6,7,8,9};
		BinSearch(arrays, 0, arrays.length,4);

	}
	
	public static void BinSearch(int[] arrays,int low,int high,int elem)
	{
		int j = (low+high)/2;
		if (elem ==arrays[j])
		{
		  System.out.println(j);
		}
		else if (elem>arrays[j])
		{
			BinSearch(arrays, j+1,high,elem);
		}else {
			BinSearch(arrays, low, j-1, elem);
		}
		
	}

}
