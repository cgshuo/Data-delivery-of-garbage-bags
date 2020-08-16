import java.io.IOException;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
public class CodeServlet extends HttpServlet {  
  
    private static final long serialVersionUID = 1L;  
      
    @Override  
    protected void service(HttpServletRequest requset, HttpServletResponse response)  
            throws ServletException, IOException {  
        String content = "姓名:maysnow 电话:123687495";  
        EncoderHandler encoder = new EncoderHandler();  
        encoder.encoderQRCoder(content, response);  
    }  
  
}  