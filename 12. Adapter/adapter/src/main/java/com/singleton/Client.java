package com.singleton;

public class Client {

	public static void main(String[] args) {

	LazyRegistryIODH singleton;
		singleton = LazyRegistryIODH.getInstance();
		System.out.println("Done!");


	}

}
