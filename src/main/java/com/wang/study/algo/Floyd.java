package com.wang.study.algo;

import javax.naming.spi.DirStateFactory.Result;

/*
 * @(#)Floyd.java, 2012-4-27 上午09:45:56
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */

/**
 * 求任意两点之间的最短路径：佛洛依德算法
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-4-27$
 */
public class Floyd
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int [][] graph = {{0,5,1000,1000},{50,0,15,5},{30,1000,0,15},{15,1000,5,0}};
		Floyd(graph);
		

	}
	
	public static void Floyd(int[][] graph)
	{
	    int[][] result = new int[graph.length][graph.length];
		for (int k = 0; k < graph.length; k++)
		{
			for (int i = 0; i < graph.length; i++)
			{
				for (int j = 0; j < graph.length; j++)
				{
					graph[i][j] = min(graph[i][j], graph[i][k]+graph[k][j]);
				}
			}
		}
		
		
	}
	
	public static int min(int a ,int b)
	{
		return a>b?b:a;
	}

}
