/*
 * @(#)Alo3.java, 2012-8-29 上午11:08:09
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;

/**
 * 在这里加入功能说明 算法导论动态规划P194：装配线调度问题
 * 
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-8-29$
 */
public class Alo3
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[][] a =
		{
		{ 7, 9, 3, 4, 8, 4 },
		{ 8, 5, 6, 4, 5, 7 } };
		int[][] t =
		{
		{ 2, 3, 1, 3, 4 },
		{ 2, 1, 2, 2, 1 } };
		int e0 = 2;
		int e1 = 4;
		int x0 = 3;
		int x1 = 2;
		int[][] f = new int[6][6];
		f[0][0] = e0 + a[0][0];
		f[1][0] = e1 + a[1][0];
		for (int i = 1; i < a[0].length; i++)
		{
			if (f[0][i - 1] + a[0][i] < f[1][i - 1] + a[0][i] + t[1][i - 1])
			{
				f[0][i] = f[0][i - 1] + a[0][i];
			}
			else
			{
				f[0][i] = f[1][i - 1] + a[0][i] + t[1][i - 1];
			}
			System.out.println(f[0][i]);
			if (f[1][i - 1] + a[1][i] < f[0][i - 1] + a[1][i] + t[0][i - 1])
			{
				f[1][i] = f[1][i - 1] + a[1][i];
			}
			else
			{
				f[1][i] = f[0][i - 1] + a[1][i] + t[0][i - 1];
			}
			System.out.println(f[1][i]);

		}
		

	}

}
