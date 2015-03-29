 package com.qiugui.handler;

import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.w3c.dom.Node;

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
		try{
			Boolean out = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			if(out){
				SOAPMessage message = context.getMessage();
				//判断message中是否有header
				SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
				
				SOAPBody body = envelope.getBody();
				Node node = body.getChildNodes().item(0);
				String paramName = node.getLocalName();
				//根据body内message的内容判断添加header与否
				if("list".equals(paramName) || "addUser".equals(paramName)){
					SOAPHeader header = envelope.getHeader();
					if(header == null) header = envelope.addHeader();
					
					QName qName = new QName("http://service.qiugui.com/", "licenseInfo");
					header.addHeaderElement(qName).setValue("123123");
					message.writeTo(System.out);
				}
				
			}
		} catch (SOAPException e){
			e.printStackTrace();
		} catch (IOException e) {
			 e.printStackTrace();
			 
		}
		
		return true;
		 
	}

	@Override
	public Set<QName> getHeaders() {
		 return null;
		 
	}

}

 