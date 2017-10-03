/*
 * @(#)Alo06.java, 2012-9-29 下午09:58:07
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.string;

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-9-29$
 */
public class Alo06
{
	

	static char[] a ="abcbdab".toCharArray();
	static char[] b ="bdcaba".toCharArray();
	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int alength = a.length;
		int blength = b.length;
		int c[][] = new int[a.length][b.length];
		char d[][] = new char[a.length][b.length];
		for (int i = 0; i <alength; i++)
		{
			c[i][0] = 0;
		}
		for (int i = 0; i < blength; i++)
		{
			c[0][i] = 0;
		}
		
		for (int i = 1; i < alength; i++)
		{
			for (int j = 1; j < blength; j++)
			{
				if(a[i]==b[j])
				{
					c[i][j] = c[i-1][j-1]+1;
					d[i][j] = '↖';
				}else if (c[i-1][j]>=c[i][j-1])
				{
					c[i][j] = c[i-1][j];
					d[i][j] = '↑';
				}else {
					c[i][j] = c[i][j-1];
					d[i][j] = '←';
					
				}
				System.out.print(d[i][j]);
			}
			System.out.println();
			
		}
		
		
		

	}

}
