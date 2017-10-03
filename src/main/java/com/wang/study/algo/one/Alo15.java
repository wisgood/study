/*
 * @(#)Alo15.java, 2012-10-22 下午07:37:31
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.algo.one;


/**
 * 在这里加入功能说明
 *问题描述：多人排成一个队列，我们认为从低到高是正确的序列，但是总有部分人不遵守秩序。
 *如果说，前面的人比后面的人高(两人身高一样认为是合适的)，那么我们就认为这两个人是一对“捣乱分子”，
 *比如说,现在存在一个序列:176, 178, 180, 170, 171
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-10-22$
 */
public class Alo15
{

	/**
	 * 
	 */
	static 	int[] pArray = {176, 178, 180, 170, 171};
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		MergeSort( 0, pArray.length-1);
		

	}
	
	static int Merge( int from, int mid, int to)
	{
		int i = from, j = mid + 1;
		int k = 0, num = 0;
		int []pTmp = new int[to-from+1];
		
		while(i<=mid && j<=to) //归并排序的主框架
		{
			if(pArray[i] <= pArray[j])
				pTmp[k++] = pArray[i++];
			else
			{
				num += (mid - i + 1);         //增加捣乱分子对
				for(int l = i; l <= mid; l++) //输出捣乱分子
					System.out.println("["+pArray[l]+" ,"+pArray[j]+"]");
				
				pTmp[k++] = pArray[j++];
			}
		}
		while(i <= mid) pTmp[k++] = pArray[i++];
		while(j <= to) pTmp[k++] = pArray[j++];

		for(k = from ; k <= to; k++)
			pArray[k] = pTmp[k - from];
		
		for (int l : pArray)
		{
			System.out.print(l+" ");
			
		}
		System.out.println();
		return num;
	}
	static int MergeSort( int from, int to)
	{
		if(from < to)
		{
			int mid = (from + to) /2;
			int num = MergeSort( from ,mid) + MergeSort( mid+1, to); //分别算出两部分的捣乱分子对
			num += Merge( from, mid, to);   //合并中出现的捣乱分子对
			return num;
		}
		return 0;
	}

}
