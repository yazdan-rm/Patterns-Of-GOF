package com.simplefactory;

public class Client {

	public static void main(String[] args) {
		Post post = PostFactory.createPost("blog");
		Post post1 = PostFactory.createPost("news");
		System.out.println(post + "\n" + post1 );

	}

}
