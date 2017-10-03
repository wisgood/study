/*
 * @(#)Alo10.java, 2012-10-11 下午03:15:00
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;

import java.util.LinkedList;

/**
 * 在这里加入功能说明
 *
 *
 *输入一个字符串，输出该字符串中字符的所有组合。举个例子，如果输入abc，它的组合有a、b、c、ab、ac、bc、abc。
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-10-11$
 */
public class Alo10
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		
		char[] c = new char[]{'a','b','c','d','e','f','g','h'};
		for (int i = 1; i <= c.length; i++)
		{
			LinkedList<Character> list = new LinkedList<Character>();
			f(c, 0, i, list);
			
		}

	}
	
	public static void f(char[] c,int begin,int tag,LinkedList<Character> list)
	{
		
		if(tag == 0)
		{
			for (Character character : list)
			{
				System.out.print(character);
			}
			System.out.println();
			return ;
		}
		if(begin == c.length)
			return ;
		list.add(new Character(c[begin]));
		f(c, begin+1, tag-1, list);
		list.remove(new Character(c[begin]));
		f(c, begin+1 ,tag, list);
	}

}
