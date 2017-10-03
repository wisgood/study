package com.wang.study.algo;

import java.util.Iterator;

/*
 * @(#)BigInt.java, 2012-4-24 下午03:33:01
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-4-24$
 */
public class BigInt
{
	private String number;
	public BigInt(String number)
	{
		this.number = number;
	}
	
	public void  add(BigInt other)
	{
		int thisLength = getNumber().length();
		int otherLength = other.getNumber().length();
		int length = thisLength>=otherLength?thisLength+1:otherLength+1;
		char[] result = new char[length];
		
		int thisPos = thisLength-1;
		int otherPos = otherLength-1;
		int value = 0;
		for(int i = length-1;i>0;i--)
		{
			int thisValue = thisPos>=0?getNumber().charAt(thisPos)-'0':0;
			int otherValue = otherPos>=0?other.getNumber().charAt(otherPos)-'0':0;
			value+=thisValue+otherValue;
			result[i] = (char) (value%10+'0');
			value/=10;
			thisPos--;
			otherPos--;
			
		}
		result[0] = (char) (value+'0');
		String string = new String(result);
		System.out.println(string);
		
	
		
	}

	/**
	 * @return Returns the number.
	 */
	public String getNumber()
	{
		return number;
	}
	
	public static void main(String[] args)
	{
		BigInt bigInt = new BigInt("12300");
		BigInt bigInt2 = new BigInt("88");
		bigInt.add(bigInt2);
	}
	
	
	
	
}
