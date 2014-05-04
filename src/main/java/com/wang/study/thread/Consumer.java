/*
 * @(#)Consumer.java, 2012-10-18 上午10:13:53
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
public class Consumer extends Thread
{
	 private FoodCache foodCache;
	   public Consumer(FoodCache foodCache)
	   {
		   this.foodCache = foodCache;
	   }
	   public void run()
	   {
		   for(int i=0; i<10; i++) 
		   {
//			 synchronized(foodCache)
//			 {
//				
//			 }
			 
			 Food food = foodCache.pop();
			 System.out.println("消费了："+food.getId()+"号食物!");
		   }
	   }

}
