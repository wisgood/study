/*
 * @(#)Alo03.java, 2012-9-29 下午02:54:30
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.string;

/**
 * 交换字符串中的大小写位置
 * “abDaBdABBddeA”
 *交换后小写在前面大写在后面
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-9-29$
 */
public class Alo03
{

	/**
	 * 
	 */
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
			while(string[begin]>='a'&&string[begin]<='z')
			{
				begin++;
			}
			while(string[end]>='A'&&string[end]<='Z')
			{
				end--;
			}
			////有可能出现begin>end的情况
			if(begin<end)
			{
			char temp = string[begin];
			string[begin] = string[end];
			string[end] = temp;
			}
		
		}
		System.out.println(string);

	}

}
