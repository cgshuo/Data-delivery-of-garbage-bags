/**
 * 
 */
package Server;

/**
 * @author caoguangshuo
 * 判断是否扫码成功
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@SuppressWarnings("serial")
public class servlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		String bookinfo = (String) request.getAttribute("bookinfo");// 获取二维码内容
	    bookinfo = "a=b=c";
		
		/**
		 * @author caoguangshuo 
		 * 将string信息拆开并存入数据库
		 * 获取当前时间生成唯一书目ID
		 */   

		String[] book = bookinfo.split("=");//以“=”连接
		String openId = book[0];
		String bookName = book[1];
		String bookAuthor = book[2];
		Calendar c = Calendar.getInstance();
		String year = Integer.toString(c.get(Calendar.YEAR));  
		String month = Integer.toString(c.get(Calendar.MONTH));   
		String date = Integer.toString(c.get(Calendar.DATE));    
		String hour = Integer.toString(c.get(Calendar.HOUR_OF_DAY));   
		String minute = Integer.toString(c.get(Calendar.MINUTE));   
		String second = Integer.toString(c.get(Calendar.SECOND));    
		String bookId = openId + year + month + date + hour + minute +second;
		System.out.println(bookId);
		// 将信息传入数据库
      
		//将信息发送给机器打印bookId;
		if (session != null) {
			// 长轮询
			// 判断是否扫码成功
			if (openId != null) {
				out.print(bookId);
			} else {

				// 保持10秒
				// if(time>=10){
				out.print("succeed");
				// break;
				// }else {
				try {
					// 保持住，1秒循环一次
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	System.out.println("lalall");
	}
}