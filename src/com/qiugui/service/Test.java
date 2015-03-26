 package com.qiugui.service;
 public class Test {

	public static void main(String[] args) {
		MyserviceImplService msi = new MyserviceImplService();
		IMyservice ms = msi.getMyserviceImplPort();
		try {
			ms.login("admin", "111111");
		} catch (UserException_Exception e) {
			 e.printStackTrace();			 
		}
	}

}

 