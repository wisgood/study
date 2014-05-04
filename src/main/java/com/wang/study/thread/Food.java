/*
 * @(#)Food.java, 2012-10-18 上午09:49:26
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
public class Food
{
	private int id;
	public Food(int id)
	{
		this.id = id;
	}
	/**
	 * @return Returns the id.
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @param id The id to set.
	 */
	public void setId(int id)
	{
		this.id = id;
	}
}
