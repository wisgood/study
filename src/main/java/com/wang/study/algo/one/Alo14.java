/*
 * @(#)Alo14.java, 2012-10-15 下午03:30:47
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;

/**
 * 在这里加入功能说明
 *问题描述：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个排好序的数组的一个旋转，输出旋转数组的最小元素。例如数组{3, 4, 5, 1, 2}为{1, 2, 3, 4, 5}的一个旋转，该数组的最小值为1。 
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-10-15$
 */
public class Alo14
{
	public static void main(String[] args)
	{
		
		 int[] pArray = {9,9,9,9,9,9,9,10,1,9};
		 int len = pArray.length;
		 int left = 0, right = len - 1, mid; 
		 int min = 0 ;
		 while(right - left != 1)  
		 {  
		      mid = left + ((right - left)>>1);  
		      if(pArray[right] >= pArray[mid])   
		             right = mid;  
		      else if(pArray[left] <= pArray[mid])         
		             left = mid;  
		 }  
		   
		 min =  pArray[right] > pArray[left] ? pArray[left]: pArray[right];
		 System.out.println(min);
		}  
	
 
}
