package com.yb.test;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
public class TestControlller {
	public String getIpAddr(HttpServletRequest request) {  
	    String ip = request.getHeader("x-forwarded-for");  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getHeader("Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getHeader("WL-Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getRemoteAddr();  
	    }  
	    return ip;  
	}  
	
	public String getRemortIP(HttpServletRequest request) {  
	    if (request.getHeader("x-forwarded-for") == null) {  
	        return request.getRemoteAddr();
	    }  
	    return request.getHeader("x-forwarded-for");  
	}  
	
	/** 
	 * 获取访问者IP 
	 *  
	 * 在一般情况下使用Request.getRemoteAddr()即可，但是经过nginx等反向代理软件后，这个方法会失效。 
	 *  
	 * 本方法先从Header中获取X-Real-IP，如果不存在再从X-Forwarded-For获得第一个IP(用,分割)， 
	 * 如果还不存在则调用Request .getRemoteAddr()。 
	 *  
	 * @param request 
	 * @return 
	 */ 
	public static String getIpAddr1(HttpServletRequest request){
	    String ip = request.getHeader("X-Real-IP");  
	    if (!StringUtils.isBlank(ip) && !"unknown".equalsIgnoreCase(ip))  
	    {  
	        return ip;  
	    }  
	    ip = request.getHeader("X-Forwarded-For");  
	    if (!StringUtils.isBlank(ip) && !"unknown".equalsIgnoreCase(ip))  
	    {  
	        // 多次反向代理后会有多个IP值，第一个为真实IP。  
	        int index = ip.indexOf(',');  
	        if (index != -1)  
	        {  
	            return ip.substring(0, index);  
	        }  
	        else  
	        {  
	            return ip;  
	        }  
	    }  
	    else{  
	        return request.getRemoteAddr();  
	    }
	}  

}
