/*
 * @(#)Alo05.java, 2012-9-29 下午04:34:50
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.string;

/**
 * 两个字符串的最长公共字串
 *http://blog.csdn.net/orbit/article/details/6850706
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-9-29$
 */
public class Alo05
{
	static char[] a ="abcdebs".toCharArray();
	static char[] b ="sddsebsds".toCharArray();

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
	}
	
	//方法1：双重循环实现
	public static void f1()
	{
		int i = 0;
		int num = 0;
		int max = 0;
		int alen = a.length;
		int blen = b.length;
		int start = 0;
		int j = 0;
		 for(i = 0; i < alen; i++)
		    {
		        for(j = 0; j < blen; j++)
		        {
		            //这里的start1、start2是比较关键的
		            int start1=i;
		            int start2=j;
		            while((start1 <= alen-1) && (start2 <= blen-1) && (a[start1++] == b[start2++]))
		                num++;
		            if(num > max)//如果num是当前最大匹配的个数，则赋给max，并且在start记下str1最长匹配开始的位置
		            {
		                max=num;
		                start=i; 
		            } 
		            num=0;//如果num不是当前最大的，则赋为0值继续循环
		        }
		    }
		 
		 for (int j2 = start; j2 < max; j2++)
		{
			 System.out.println(a[j2]);
			
		}
		
	}
	
	public static void f2()
	{
		
	}

}
