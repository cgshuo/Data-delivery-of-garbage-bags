package com.cgs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookName = String.valueOf(request.getParameter("bookName"));
		String bookAuthor = String.valueOf(request.getParameter("bookAuthor")); 
		try {
			// 加载数据库驱动，注册到驱动管理器
			Class.forName("com.mysql.jdbc.Driver");
			// 数据库连接字符串
			String url = "jdbc:mysql://localhost:3306/books";
			// 数据库用户名
			String username = "root";
			// 数据库密码
			String password = "123";
			// 创建Connection连接
			Connection conn = DriverManager.getConnection(url,username,password);
			// 更新SQL语句
			String sql = "update tb_books set bookName=?,bookAuthor=? where id=?";
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第一个参数赋值
			ps.setString(1, bookName);
			// 对SQL语句中的第二个参数赋值
			ps.setString(2, bookAuthor);
			// 执行更新操作
			ps.executeUpdate();
			// 关闭PreparedStatement
			ps.close();
			// 关闭Connection
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		// 重定向到FindServlet
		response.sendRedirect("FindServlet");
	}

}
