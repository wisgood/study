/*
 * @(#)HelloClient.java, 2012-9-14 上午09:47:58
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by IntelliJ IDEA. User: leizhimin Date: 2008-8-7 22:21:07
 * 客户端测试，在客户端调用远程对象上的远程方法，并返回结果。
 */
public class HelloClient
{
	public static void main(String args[])
	{
		try
		{
			// 在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法
			IHello rhello = (IHello) Naming.lookup("rmi://localhost:888/RHello");
			System.out.println(rhello.helloWorld());
			Class a = String.class;
			Thread thread;
			System.out.println(rhello.sayHelloToSomeBody("熔岩"));
		}
		catch (NotBoundException e)
		{
			e.printStackTrace();
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch (RemoteException e)
		{
			e.printStackTrace();
		}
	}
}