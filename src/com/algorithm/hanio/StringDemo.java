package com.algorithm.hanio;

public class StringDemo {
	private static final String MESSAGE = "taobao";
	public static void main(String args[]){
		String a = "tao" + "bao";
		String b = "tao";
		String c = "bao";
		
		System.out.println(a == MESSAGE);   //== 表示内存地址
		System.out.println((b+c) == MESSAGE);
	}
}
