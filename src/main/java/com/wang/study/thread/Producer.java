/*
 * @(#)Producer.java, 2012-10-18 上午10:08:42
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
public class Producer extends Thread
{
   private FoodCache foodCache;
   public Producer(FoodCache foodCache)
   {
	   this.foodCache = foodCache;
   }
   public void run()
   {
	   for(int i=0; i<10; i++) 
	   {
//		 synchronized(foodCache)
//		 {
//			
//		 }
		   
		   Food food = new Food(i);
			 System.out.println("生产了第"+food.getId()+"号食物");
			 foodCache.push(food);
	   }
   }
		 
}
