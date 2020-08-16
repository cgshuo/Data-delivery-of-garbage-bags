/**
 * 
 */
package com.cgs.weixin.servlet;

/**
 * @author caoguangshuo
 * 判断是否扫码成功
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import service.BagRecord;
//import service.BagsIssuedService;
//import service.BagsIssuedServiceProxy;
//import service.BagsIssuedServiceService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
public class servertest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        //QRService service=new QRService();
        PrintWriter out = response.getWriter();
        
        String openId = (String) request.getAttribute("openId");
        //System.out.println("openId = "+openId);
        
        //当前季度
        Calendar now = Calendar.getInstance();  
        String quater ;
        int month = now.get(Calendar.MONTH) + 1;
        if(0 < month && month < 4){
        	quater = "1";
        }
        else if(3 < month && month < 7){
        	quater = "2";
        }
        else if(6 < month && month < 10){
        	quater = "3";
        }
        else if(9 < month && month < 13){
        	quater = "4";
        }
        else{
        	quater = "error";
        }
        int year = now.get(Calendar.YEAR);
        String seasons = year + quater;
        int season = Integer.parseInt(seasons);
        System.out.println("季度： " + season);

                
        //查寻剩余额度
//        BagsIssuedServiceProxy DataOfOpenId = new BagsIssuedServiceProxy();
//        int Record = DataOfOpenId.getAmountByWx(openId, season);
//        
//        //如果额度大于0；额度数据库减一，发送succeed字段
//        boolean Condition = DataOfOpenId.updateAmountByWx(openId, season);
        
        //int time=0;
        if(session!=null){
            //长轮询
            //while(true) {
                //time++;
                //判断是否扫码成功
                if (openId!=null) {
                	out.print("succeedd");
                    //break;
                }else{
                	
                    //保持10秒
//                    if(time>=10){
                        out.print("succeedd");
//                        break;
                   // }else {
                        try {
                            //保持住，1秒循环一次
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            	//out.print("succeed");
            	//bre
       
           // }
        }
       // out.close();
   // }
}