 package com.qiugui.service;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
 public class Test {

	public static void main(String[] args) throws Exception{
		URL url = new URL("http://127.0.0.1:9999/ns?wsdl");
		QName qName = new QName("http://service.qiugui.com/", "MyserviceImplService");
		MyserviceImplService msi = new MyserviceImplService(url,qName);
		IMyservice ms = msi.getMyserviceImplPort();
		User user = new User();
		user.setId(11);user.setNickname("qiugui");
		user.setPassword("222222");user.setUsername("QiuGui");
		Holder<User> holderUser = new Holder<User>(user);
		ms.addUser(holderUser);
	}

}

 