/*
 * @(#)Alo6.java, 2012-9-4 上午09:23:23
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;

/**
 * 判断整数序列是不是二元查找树的后续遍历结果
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-9-4$
 */
public class Alo6
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	boolean vertify(int[] sequence,int length)
	{
		if(sequence == null||length<0)
			return false;
		int root = sequence[length-1];
		int i = 0;
		for (; i < length-1; i++)
		{
			if(sequence[i]>root)
				break;
		}
		int j = i;
		for (; j < length-1; j++)
		{
			if(sequence[j]<root)
				return false;
			
		}
		
		boolean left = true;
		if(i>0)
			left = vertify(sequence, i);
		boolean right = true;
		if(i<length-1)
			right = vertify(sequence, length-i-1);
		
		return left&&right;
		
	}

}
