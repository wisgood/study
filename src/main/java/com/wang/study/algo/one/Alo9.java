/*
 * @(#)Alo9.java, 2012-10-8 下午03:45:20
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;

/**
 * 在这里加入功能说明  问题描述：12个高矮不同的人，排成两排，每排必须是从矮到高排列，而且第二排比对应的第一排的人高，问排列方式有多少种?
        思路：可以用递归来解决。假设已按高矮顺序编号从0到11，即0号最矮、11号最高，(i, j)表示某个人在队列中的位置。对于0号只能排在(0, 0)，1号可以排在两个位置(0, 1)和(1, 0)。2号可以排的位置取决于1号的位置，如果1号排在(0, 1)，那么2号可以排在两个位置(0, 0)和(1, 0)。如果1号排在(1, 0)，那么2号只能排在(0, 1)。
        观察一下，可以得出一下规律：对于i号，如果第一排与第二排的人数一样，那么他只能排在第一排；如果第一排的人数大于第二排，那么他可以排在第一排或者第二排。递归终止的条件是第一排或第二排排满了。
 *http://blog.csdn.net/wuzhekai1985/article/details/6713094
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-10-8$
 */
public class Alo9
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		InLineProblem(0, 0, 12); 
		System.out.println("总共的排列数目为:"+totalNum);

	}
	
	static int totalNum = 0;

	//函数功能 ： 排队问题 
	//函数参数 ： firstFree为第1排第1个空余位置
//	            secondFree为第2排第1个空余位置
//	            num为排队人数
	//返回值 ：   无 
	static void  InLineProblem(int firstFree, int secondFree, int num)
	{
		if(firstFree == num/2 || secondFree == num/2) //其中一排无剩余位置
		{
			totalNum++;
			return;
		}
		if(firstFree == secondFree) //第1排人数与第2排人数一样
		{
			InLineProblem(firstFree + 1, secondFree, num); //只能排在第1排
		}
		else
		{
			InLineProblem(firstFree + 1, secondFree, num); //排在第1排
			InLineProblem(firstFree, secondFree + 1, num); //排在第2排
		}
	}

}
