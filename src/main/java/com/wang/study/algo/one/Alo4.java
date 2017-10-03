/*
 * @(#)Alo4.java, 2012-8-29 下午02:19:03
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;

/**
 * 在这里加入功能说明
 * 
 * 算法导论动态规划P197：矩阵相乘问题
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-8-29$
 */
public class Alo4
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] a = {30,35,15,5,10,20,25};
		int[][] m = new int[a.length][a.length];
		int[][] s = new int[a.length][a.length];
		int length = m.length;
		for (int i = 1; i < length; i++)
		{
			m[i][i] = 0;
		}
		
		for(int l =2;l<length;l++)
		{
			for(int i = 1;i<length-l+1;i++)
			{
				int j = i+l-1;
				m[i][j] = 10000000;
				for(int k = i;k<=j-1;k++)
				{
					int q = m[i][k]+m[k+1][j]+a[i-1]*a[k]*a[j];
					if(q<m[i][j])
					{
						m[i][j] = q;
						s[i][j] = k;
					}
				
				}
			}
		}
		System.out.println(m[1][6]);
		
		

	}

}
