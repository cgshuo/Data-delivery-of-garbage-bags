package com.cgs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindOwnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			// 获取Statement
			Statement stmt = conn.createStatement();
			// 添加图书信息的SQL语句
			String sql = "select bookName,bookAuthor from tb_books where phoneId=?";
			// 执行查询
			ResultSet rs = stmt.executeQuery(sql);
			// 实例化List对象
			List<Book> list = new ArrayList<Book>();
			// 判断光标向后移动，并判断是否有效
			while(rs.next()){
				// 实例化Book对象
				Book book = new Book();
				book.setBookName(rs.getString("bookName"));
				// 对price属性赋值
				book.setBookAuthor(rs.getString("bookAuthor"));
				list.add(book);
			}
			// 将图书集合放置到request之中
			request.setAttribute("list", list);
			rs.close();		// 关闭ResultSet
			stmt.close();	// 关闭Statement
			conn.close();	// 关闭Connection
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 请求转发到book_list.jsp
		request.getRequestDispatcher("book_list.jsp").forward(request, response);
	}
}
