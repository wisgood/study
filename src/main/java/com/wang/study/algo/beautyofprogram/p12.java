/*
 * @(#)p12.java, 2012-8-22 下午02:14:29
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.beautyofprogram;



/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-8-22$
 */
public class p12
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		for(int i = 9;i>0;i--)
			for(int j = 9;j>0;j--)
			{
				if(i%3!=j%3)
				{
					System.out.println("i="+i+" ,j="+j);
				}
					
			}

	}

}
