package com.sist.java;

class A{
	public void methodA(B b) {
		b.methodB();
	}
}
class B{
	public void methodB() {
		System.out.println("methodB()");
	}
}

// �������̽� ���

class A1{
	public void methodA() {
		I i=InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}
interface I{
	public abstract void methodB();
}
class B1 implements I{
	public void methodB(){
		System.out.println("methodB() in B1 class");
	}
	public String toString() {return "class B";}
}
class InstanceManager{
	public static I getInstance() {	//static �޼ҵ��̱� ������ InstanceManager.getInstance() �� �ٷ� ����� �� �ִ�.
		return new B1();
	}
}

public class interface��뿹 {
	public static void main(String[] args) {
		A a=new A();
		a.methodA(new B());
		System.out.println();
		
		A1 a2=new A1();
		a2.methodA();
	}
}
