package com.decorator;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		Message decorator = new HtmlEncodedMessage(m);
		System.out.println(decorator.getContent());

		 Message decorator1 = new Base64EncodedMessage(decorator);
		 System.out.println(decorator1.getContent());

	}
}
