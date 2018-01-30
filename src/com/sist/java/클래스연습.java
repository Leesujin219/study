package com.sist.java;

public class 클래스연습 {
	static int count=0;
	String name;
	
	클래스연습(){
		this("제목없음"+ ++count);
	}
	클래스연습(String name){
		this.name=name;
		System.out.println("문서 "+this.name+"가 생성되었습니다.");
	}
	
	public static void main(String[] args) {
		클래스연습 d1=new 클래스연습();
		클래스연습 d2=new 클래스연습("자바.txt");
		클래스연습 d3=new 클래스연습();
		클래스연습 d4=new 클래스연습();
		
	}
}
