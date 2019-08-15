package com.appsdevelopingblog.app.ws.security;

import com.appsdevelopingblog.app.ws.SpringApplicationContext;

public class SecurityConstants {
  public static final long EXPIRATTION_TIME = 864000000;
  public static final String  TOKEN_PREFIX = "Bearer ";
  public static final String  HEADER_STRING = "Authorization";
  public static final String  SIGN_UP_URL = "/users";

  
  public static String getTokenSecret() {
	  AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");
	  return appProperties.getTokenSecret();
	  
  }
}
