package com.hpe.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.junit.Test;

public class JdbcTest {

	@Test
	public void test1() throws ClassNotFoundException, SQLException {
		// 加载驱动类
		Class.forName("com.mysql.jdbc.Driver");
		// 获取数据库的连接（Connection）
		// 用户名、密码、连接的数据库的地址
		String user = "root";
		String password = "you1582540778";
		String url = "jdbc:mysql://localhost:3306/bigdata2?useUnicode=true&characterEncoding=utf-8&useSSL=false";

		// 连接数据库
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println(connection);
	}

	@Test
	public void testInsert() {
		// 向user表中插入一条记录zhangsan 123 张三 11
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = sc.nextLine();
		System.out.println("请输入密码");
		String password = sc.nextLine();
		System.out.println("请输入真实姓名");
		String realname = sc.nextLine();
		System.out.println("请输入年龄");
		int age = sc.nextInt();
		
		// 获取与数据库bigdata2的连接
		Connection connection = getConnection();

		// 写SQL语句
		String sql = "insert into users(username,password,realname,age) values(?,?,?,?)";

		PreparedStatement pstmt = null;
		try {
			//创建PreparedStatement对象（使用Connection创建），用于发送预编译的SQL语句
			pstmt = connection.prepareStatement(sql);
			
			//给占位符设置值
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.setString(3, realname);
			pstmt.setInt(4, age);
			
			//发送SQL，给数据库执行
			//增删改用executeUpdate
			//查询用execcuteQuery
			int row = pstmt.executeUpdate();
			if (row > 0) {
				System.out.println("添加成功");
			} else {
				System.out.println("添加失败");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeStatement(pstmt);
			closeConnection(connection);
		}
		
		
		
		
	}

	@Test
	public void testDelete() {
		// 向user表中插入一条记录zhangsan 123 张三 11
		// 获取与数据库bigdata2的连接

	}

	/**
	 * @title 返回与数据库bigdata2的连接
	 * @author 尤锴丰
	 * @date 2018年7月27日下午8:30:04
	 * @return Connection
	 */
	public Connection getConnection() {
		Connection connection = null;
		// 用户名、密码、连接的数据库的地址
		String user = "root";
		String password = "you1582540778";
		String url = "jdbc:mysql://localhost:3306/bigdata2" + "?useUnicode=true&characterEncoding=utf-8&useSSL=false";
		try {
			// 加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			// 获取数据库的连接（Connection）
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
	
	
	public void closeConnection(Connection connection) {
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	public void closeStatement(Statement stmt) {
		if (stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	

}
