package com.sist.java;

public class Ŭ�������� {
	static int count=0;
	String name;
	
	Ŭ��������(){
		this("�������"+ ++count);
	}
	Ŭ��������(String name){
		this.name=name;
		System.out.println("���� "+this.name+"�� �����Ǿ����ϴ�.");
	}
	
	public static void main(String[] args) {
		Ŭ�������� d1=new Ŭ��������();
		Ŭ�������� d2=new Ŭ��������("�ڹ�.txt");
		Ŭ�������� d3=new Ŭ��������();
		Ŭ�������� d4=new Ŭ��������();
		
	}
}
