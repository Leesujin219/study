package com.sist.java;

class Value{
	int value;
	Value(int value){
		this.value=value;
	}
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Value)
			return value==((Value)obj).value;
		else return false;
	}
}
public class equalsMethodOverride {
	public static void main(String[] args) {
		Value v1=new Value(10);
		Value v2=new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("같다");
		}else System.out.println("다르다");
		
		v2=v1;
		if(v1.equals(v2)) {
			System.out.println("같다");
		}else System.out.println("다르다");
		
		
	}

}
