package com.wang.study.algo;/*
 * @(#)Algorithm1.java, 2012-4-27 下午01:46:51
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */

/**
 * 在这里加入功能说明
 *
 *
 *矩阵相乘
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-4-27$
 */
public class Algorithm1
{
	public static void main(String[] args)
	{
		int[] p = {30,35,15,5,10,20,25};
		int number = p.length-1;
		int [][] m = new int[number][number];
		int MAX = Integer.MAX_VALUE;
		for (int i = 0; i < m.length; i++)
		{
			m[i][i] = 0;
		}
		for (int l = 2; l <= m.length; l++)
		{
			for (int i = 0; i <= m.length-l; i++)
			{
				int j = i+l-1;
				m[i][j] = MAX;
				for (int k = i; k < j; k++)
				{
					int q = m[i][k]+m[k+1][j]+p[i]*p[k+1]*p[j+1];
					if (q<m[i][j])
					{
						m[i][j] = q;
						
					}
				}
			}
		}
		System.out.println("dddd");
	}

}
