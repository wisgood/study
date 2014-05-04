/*
 * @(#)IHello.java, 2012-9-14 上午09:46:00
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by IntelliJ IDEA. User: leizhimin Date: 2008-8-7 21:50:02
 * 定义一个远程接口，必须继承Remote接口，其中需要远程调用的方法必须抛出RemoteException异常
 */
public interface IHello extends Remote
{

	/**
	 * 简单的返回“Hello World！"字样
	 * 
	 * @return 返回“Hello World！"字样
	 * @throws java.rmi.RemoteException
	 */
	public String helloWorld() throws RemoteException;

	/**
	 * 一个简单的业务方法，根据传入的人名返回相应的问候语
	 * 
	 * @param someBodyName
	 *            人名
	 * @return 返回相应的问候语
	 * @throws java.rmi.RemoteException
	 */
	public String sayHelloToSomeBody(String someBodyName) throws RemoteException;
}