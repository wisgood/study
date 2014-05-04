/*
 * @(#)Demo.java, 2012-10-18 上午10:15:53
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
public class Demo
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		FoodCache foodCache = new FoodCache();
		Producer producer = new Producer(foodCache);
		Consumer consumer = new Consumer(foodCache);
		producer.start();
		consumer.start();

	}

}
