/**
 * 
 */
package com.cgs.weixin.util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cgs.weixin.pojo.Token;

/**
 * @author caoguangshuo
 *
 */
public class TokenUtil {
//	public static void saveToken(Token u){
//		//Token u = new Token();
//		//u.setAccessToken();
//		List<Token>list = new ArrayList<Token>();
//	
//	}
	
	 // 数据库方式存储token
	public static void saveToken(Token u) {
		Configuration cfg = new Configuration().configure();
		// cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		//Token u = new Token();
		//System.out.println(u.getAccessToken());
		//System.out.println(u.getExpiresIn());
		String hql = "select Token from Token ";
		//List<String>acc = new ArrayList<String>(); 
		List<String>acc = session.createQuery(hql).list();
		if(acc == null){
		u.setId(1);
		//u.setAccessToken(u.getAccessToken());
		//u.setExpiresIn(u.getExpiresIn());
		session.save(u);// insert
		//System.out.println("++++");
		//session.close();
		tx.commit();
		}
		else{
			session.createQuery(hql).executeUpdate();
		}
	}
	//数据库读取token，hql语句报错
	@SuppressWarnings("unchecked")
	public static Token readToken(){
		Configuration cfg = new Configuration().configure();
		// cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		//Transaction tx = session.beginTransaction();
		//Token u = new Token();
		String hql = "select Token from Token where id=(select max(id) from Token)";
		//List<Token> lst = new ArrayList<Token>();
		//lst = getHibernateTemplate().find(hql);
		System.out.println("读取完毕");
		 //Query query = session.createQuery(hql);
		 //lst= query.list();
		 List<Token>list = session.createQuery(hql).list();
		 System.out.println(list);
		 System.out.println("------------");
		 return list.get(0);
		}

	}

