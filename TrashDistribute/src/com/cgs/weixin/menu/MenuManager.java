package com.cgs.weixin.menu;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cgs.weixin.menu.Button;
import com.cgs.weixin.menu.CommonButton;
import com.cgs.weixin.menu.ComplexButton;
import com.cgs.weixin.menu.Menu;
import com.cgs.weixin.menu.ViewButton;
//import com.cgs.weixin.pojo.AccessToken;
import com.cgs.weixin.pojo.Token;
import com.cgs.weixin.util.CommonUtil;
import com.cgs.weixin.util.WeixinUtil;
//import com.google.zxing.WriterException;

public class MenuManager {
	private static Logger log = LoggerFactory.getLogger(MenuManager.class);

	public static void main(String[] args)
			throws IOException, KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException {
		// 第三方用户唯一凭证
		String appId = "wxc7d3ea673de1b6fc";// "wx5af7924025713212";
		// 第三方用户唯一凭证密钥
		String appSecret = "2a4fffbd72f0b71cf925233f750ab76d";// "5ba67556fcf8d2d83ed26718426983e8";

		// 调用接口获取access_token
		Token at = CommonUtil.getToken(appId, appSecret);
		// System.out.println(CommonUtil.getToken("appID", "appsecret"));
		if (null != at) {
			// 调用接口创建菜单
			int result = WeixinUtil.createMenu(getMenu(), at.getAccessToken());
			// 判断菜单创建结果
			if (0 == result)
				log.info("成功");// log.info("菜单创建成功！");
			else
				log.info("菜单创建失败，错误码：" + result);
			System.out.println(result);
		}
		// System.out.println(at.getAccessToken());
	}

	/**
	 * 组装菜单数据
	 * 
	 * @return
	 */
	private static Menu getMenu() {
		CommonButton btn11 = new CommonButton();
		btn11.setName("捐赠书籍");
		btn11.setType("view");
		btn11.setUrl("http://www.cgsgo.com");
		CommonButton btn12 = new CommonButton();
		btn12.setName("领取垃圾袋");
		btn12.setType("view");
		// btn12.setKey("12");
		btn12.setUrl("http://702e4e59.ngrok.io/TrashDistribute/OAuthServlet");
		// btn12.setUrl("http://www.baidu.com");//("http

		CommonButton btn13 = new CommonButton();
		btn13.setName("周边搜索");
		btn13.setType("click");
		btn13.setKey("13");

		CommonButton btn14 = new CommonButton();
		btn14.setName("历史上的今天");
		btn14.setType("click");
		btn14.setKey("14");

		CommonButton btn21 = new CommonButton();
		btn21.setName("歌曲点播");
		btn21.setType("click");
		btn21.setKey("21");

		CommonButton btn22 = new CommonButton();
		btn22.setName("经典游戏");
		btn22.setType("click");
		btn22.setKey("22");

		CommonButton btn23 = new CommonButton();
		btn23.setName("美女电台");
		btn23.setType("click");
		btn23.setKey("23");

		CommonButton btn24 = new CommonButton();
		btn24.setName("人脸识别");
		btn24.setType("click");
		btn24.setKey("24");

		CommonButton btn25 = new CommonButton();
		btn25.setName("聊天唠嗑");
		btn25.setType("click");
		btn25.setKey("25");

		CommonButton btn31 = new CommonButton();
		btn31.setName("Q友圈");
		btn31.setType("click");
		btn31.setKey("31");

		CommonButton btn32 = new CommonButton();
		btn32.setName("电影排行榜");
		btn32.setType("click");
		btn32.setKey("32");

		CommonButton btn33 = new CommonButton();
		btn33.setName("幽默笑话");
		btn33.setType("click");
		btn33.setKey("33");

		/**
		 * 微信： mainBtn1,mainBtn2,mainBtn3底部的三个一级菜单。
		 */

		ComplexButton mainBtn1 = new ComplexButton();
		mainBtn1.setName("生活助手");
		// 一级下有4个子菜单
		// mainBtn1.setSub_button(new CommonButton[] { btn11, btn12, btn13,
		// btn14 });

		ComplexButton mainBtn2 = new ComplexButton();
		mainBtn2.setName("休闲驿站");
		mainBtn2.setSub_button(new CommonButton[] { btn21, btn22, btn23, btn24, btn25 });

		ComplexButton mainBtn3 = new ComplexButton();
		mainBtn3.setName("更多体验");
		mainBtn3.setSub_button(new CommonButton[] { btn31, btn32, btn33 });

		/**
		 * 封装整个菜单
		 */
		Menu menu = new Menu();
		// menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });
		menu.setButton(new Button[] { btn12, btn11 });
		return menu;
	}
}