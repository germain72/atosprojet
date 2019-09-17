package com.atos.poe;

import com.atos.poe.wsclient.HelloImplService;
import com.atos.poe.wsclient.IHello;

public class ClientSoapWs {
	public static void main(String[] args) {
		HelloImplService service = new HelloImplService();
		IHello hello = service.getHelloImplPort();
		String text = hello.say("Bravo l'équipe!");
		System.out.println(text);
	}
}
