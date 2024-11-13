package com.company.depinv;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("Hello Yazdan to The world of design patterns");
		MessagePrinter printer = new MessagePrinter();
		PrintWriter writer = new PrintWriter(System.out);
		Formatter formatter = new JSONFormatter();
		printer.writeMessage(msg, formatter, writer);
	}

}
