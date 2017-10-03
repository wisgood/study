/*
 * @(#)BinSearch.java, 2012-10-17 上午08:47:45
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.sort;

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-10-17$
 */
public class BinSearch
{

	/**
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8};
		System.out.println(search(a,4));
		
		

	}
	
	public static int search(int array[], int v)  
	{  
	    int left, right, middle;  
	   
	    left = 0;
	    right = array.length;  
	   
	    while (left < right)  
	    {  
	        middle = (left + right) / 2;  
	        if (array[middle] > v)  
	        {  
	            right = middle - 1;  
	        }  
	        else if (array[middle] < v)  
	        {  
	            left = middle + 1;  
	        }  
	        else  
	        {  
	            return middle;  
	        }  
	    }  
	   
	    return -1;  
	}  

}
