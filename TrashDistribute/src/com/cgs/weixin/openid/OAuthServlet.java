/**
 * 
 */
package com.cgs.weixin.openid;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.souvc.weixin.pojo.SNSUserInfo;
import com.cgs.weixin.openid.*;//.WeixinOauth2Token;
//import com.souvc.weixin.util.AdvancedUtil;

/**
* 类名: OAuthServlet </br>
* 描述: 授权后的回调请求处理 </br>
* 
 */
public class OAuthServlet extends HttpServlet {
    private static final long serialVersionUID = -1847238807216447030L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        // 用户同意授权后，能获取到code
        String code = request.getParameter("code");
        String state = request.getParameter("state");
        System.out.println(code);
        // 用户同意授权
        if (!"authdeny".equals(code)) {
            // 获取网页授权access_token
            WeixinOauth2Token weixinOauth2Token = AdvancedUtil.getOauth2AccessToken("wxc7d3ea673de1b6fc", "2a4fffbd72f0b71cf925233f750ab76d", code);
            // 网页授权接口访问凭证
           // String accessToken = weixinOauth2Token.getAccessToken();
            // 用户标识
            String openId = weixinOauth2Token.getOpenId();
            // 获取用户信息
         //   SNSUserInfo snsUserInfo = AdvancedUtil.getSNSUserInfo(accessToken, openId);

            // 设置要传递的参数
           // request.setAttribute("snsUserInfo", snsUserInfo);
            //request.setAttribute("state", state);
            request.setAttribute("openId", openId);
        }
        // 跳转到index.jsp
        request.getRequestDispatcher("/TrashDistribute/CheckOpenIdServlet").forward(request, response);
    }
}