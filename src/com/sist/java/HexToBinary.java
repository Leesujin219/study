package com.sist.java;

public class HexToBinary {
	//16���� ��� ���α׷�
	public static void main(String[] args) {
		char[] hex= {'C','A','F','E'};
		String[] binary= {"0000","0001","0010","0011"
						, "0100","0101","0110","0111"
						,"1000", "1001","1010","1011"
						,"1100","1101", "1110","1111"
						};
		String result="";
		for(int i=0;i<hex.length;i++) {
			if(hex[i]>='0'&&hex[i]<='9') {
				result+=binary[hex[i]-'0'];	//���ڷ� �������		
			}else {
				result+=binary[hex[i]-'A'+10];
			}
		}
		System.out.println("hex:"+new String(hex));
		System.out.println("binary:"+result);
		System.out.println('8'-'6');
	
	}
}
