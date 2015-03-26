 package com.qiugui.handler;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
 public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public void close(MessageContext context) {
		 
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("error"); 
		return false;
		 
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		System.out.println("message"); 
		return true;
		 
	}

	@Override
	public Set<QName> getHeaders() {
		 return null;
		 
	}

}

 