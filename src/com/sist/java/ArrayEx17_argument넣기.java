package com.sist.java;
	//argument 넣을 때 띄어쓰기 하나씩 넣어야함. argument는 하나씩 넣어야 에러없음. ex) 3 + 5
public class ArrayEx17_argument넣기 {
	public static void main(String[] args) {
		if(args.length !=3) {
			System.out.println("에러");
			System.exit(0);
		}
		int num1=Integer.parseInt(args[0]);
		char op=args[1].charAt(0);
		int num2=Integer.parseInt(args[2]);
		int result=0;
		switch(op) {
			case '+' : result=num1+num2;	break;
			case '-' : result=num1-num2;	break;
			case 'x' : result=num1*num2;	break;
			case '/' : result=num1/num2;	break;
			default : 
				System.out.println("지원되지 않는 연산입니다.");
		}
		System.out.println("결과 : "+result);
	}
}
