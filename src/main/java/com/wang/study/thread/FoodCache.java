/*
 * @(#)FoodCache.java, 2012-10-18 上午09:51:24
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.thread;

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-10-18$
 */
public class FoodCache
{
	private int length = 10 ;
	private Food[] cache =  new Food[length];
	private int top = -1;
	
	public FoodCache()
	{
		
	}
	
	public Food pop()
	{
		while(top==-1)
		{
			try
			{
				System.out.println("缓存没有食物了，我的心在等待 .........");
				this.wait();
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		return cache[top--];
	}
	
	public void push(Food food)
	{
		while(top==length-1)
		{
			try
			{
				this.wait();
				System.out.println("缓存里面的食物已经满了，快来吃我吧！");
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		cache[++top] =  food;
	}
	
}
