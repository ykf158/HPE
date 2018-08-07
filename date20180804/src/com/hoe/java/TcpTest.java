package com.hoe.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

public class TcpTest {

	@Test
	public void client() {
		Socket socket = null;
		OutputStream os = null;
		try {
			// 创建一个Socket对象，通过构造器指定服务器端ip，以及接受程序的端口号
			socket = new Socket("127.0.0.1", 8989);
			// 通过socket获得io流
			os = socket.getOutputStream();
			// 执行iocaozuo :写
			os.write("我是客户端".getBytes());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}

	}

	@Test
	public void server() {

		// 创建 ServerSocket的对象，通过构造器致命自己的端口号，用于监听客户端的请求
		ServerSocket ss = null;
		// 调用accept方法监听，监听客户端的请求，如果客户端请求连接，返回一个已连接的套接字
		Socket s = null;
		// 调用socket的getInPutStream方法获取客户端发送过来的输入流
		InputStream is = null;
		try {
			ss = new ServerSocket(8989);
			s = ss.accept();
			is = s.getInputStream();

			// 对输入流的操作
			byte[] b = new byte[20];
			int len;
			while ((len = is.read(b)) != -1) {
				
				String str = new String(b, 0, len);
				System.out.print(str);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (is!=null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (s!=null) {
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (ss!=null) {
				try {
					ss.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
		}
		

	}

}
