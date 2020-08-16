/**
 * 
 */
package Server;

/**
 * @author caoguangshuo
 *
 */
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("serial")
public class bookInfo extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String bookName = request.getParameter("BookName");
		String bookAuthor = request.getParameter("BookAuthor");
		String openId = "a";
		String info = openId + "=" + bookName + "=" + bookAuthor ;
		request.setAttribute("BookInfo",info);
		request.getRequestDispatcher("Client/QRcodeOfBook.jsp").forward(request, response);
	}
}