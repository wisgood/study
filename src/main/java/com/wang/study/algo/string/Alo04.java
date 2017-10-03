/*
 * @(#)Alo04.java, 2012-9-29 下午03:22:10
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.string;

/**
 * 字符串翻转
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-9-29$
 */
public class Alo04
{
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
			char[] string = {'a','A','A','B','c','d','R','t'};
			if(string==null||string.length==0)
				return ;
			int begin = 0;
			int end = string.length-1;
			while(begin<end)
			{
				////有可能出现begin>end的情况
				if(begin<end)
				{
				char temp = string[begin];
				string[begin] = string[end];
				string[end] = temp;
				}
				begin++;
				end--;
			}
			System.out.println(string);

		}
}
