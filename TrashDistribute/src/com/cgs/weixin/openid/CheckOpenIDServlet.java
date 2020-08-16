/**
 * 
 */
package com.cgs.weixin.openid;

import java.io.IOException;
import service.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author caoguangshuo
 *
 */
public class CheckOpenIDServlet extends HttpServlet  {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
    	String openId = request.getParameter("openId");
    	
        IdentityVerificationServiceProxy matchingOpenId = new IdentityVerificationServiceProxy();
        if(matchingOpenId.checkOpenid(openId)) {
			//如何openid存在，返回1 生成二维码
        	request.setAttribute("openId", openId);
			//result=ResultUtil.resultErrorCode(1);
        	request.getRequestDispatcher("OpenIdQrcode.jsp").forward(request, response);

		}else {
			//如果openid不存在,注册页面
			//result=ResultUtil.resultErrorCode(0);
			request.getRequestDispatcher("OpenIdQrcode.jsp").forward(request, response);
		}
		//response.getWriter().write(result);
	}
 
}
