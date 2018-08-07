package com.hoe.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;

public class InetAddressTest {

	
	/*
	 * 网络通信的第一要素 ：IP地址
	 * InetAddress：java.net包
	 * InetAddress用来表示IP地址，一个InetAddress的对象就代表一个ip地址
	 * 如何创建InetAddress对象 ：getByName(String host)
	 * 
	 */
	@Test
	public void test1() throws UnknownHostException {
		InetAddress address = InetAddress.getByName("www.baidu.com");
		System.out.println(address);
		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName());
		InetAddress myAddress = InetAddress.getLocalHost();
		System.out.println(myAddress);
		
	}
	
}
