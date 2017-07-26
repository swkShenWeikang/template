package com.snsoft.test;

import java.io.InputStream;
import org.junit.Test;
import com.snsoft.util.HttpUtils;


public class ServletTest {
	
	@Test
	public void servletPostTest(){
		String url = "http://localhost:8080/web1/login";
		InputStream is = HttpUtils.sendPost(url, "{account:'10000',password:'111111'}");
		String result = HttpUtils.getString(is);
		System.out.println(result);
	}
	
	@Test
	public void servletGetTest(){
		String url = "http://localhost:8080/web1/login";
		InputStream is = HttpUtils.sendGet(url, "account='111111'&password='111111'");
		String result = HttpUtils.getString(is);
		System.out.println(result);
	}
	
	
	
	
	
	
}
