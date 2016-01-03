/*
 * @(#)TCPClient.java, 2012-8-15 下午02:30:16
 *
 * Copyright (c) 2000-2007, 达梦数据库有限公司.
 * All rights reserved.
 */
package com.wang.study.socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 在这里加入功能说明
 *
 * @author wangxiaowei
 * @version $Revision: 1.4 $, 2012-8-15$
 */
public class TCPClient
{

	/**
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		// TODO Auto-generated method stub
		
		String sentence;
		String modifiedSentence;
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		Socket clientSocket = new Socket("localhost",9999);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		sentence = inFromUser.readLine();
		outToServer.writeBytes(sentence+'\n');
		modifiedSentence = inFromServer.readLine();
		System.out.println("FROM SERVER"+modifiedSentence);
		clientSocket.close();
		
		
		
		

	}

}
