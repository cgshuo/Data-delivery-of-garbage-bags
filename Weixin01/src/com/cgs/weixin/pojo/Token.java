/**
 * 
 */
package com.cgs.weixin.pojo;

/**
 * @author caoguangshuo
 *
 */
public class Token {
		private int id;
	//public class Token {
	    // 接口访问凭证
	    private String accessToken;
	    // 凭证有效期，单位：秒
	    private int expiresIn;

	    public int getId(){
	    	return id;
	    }
	    public void setId(int id){
	    	this.id = id;
	    }
	    public String getAccessToken() {
	        return accessToken;
	    }

	    public void setAccessToken(String accessToken) {
	        this.accessToken = accessToken;
	    }

	    public int getExpiresIn() {
	        return expiresIn;
	    }

	    public void setExpiresIn(int string) {
	        this.expiresIn = string;
	    }
}
