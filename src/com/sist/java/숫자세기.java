package com.sist.java;

public class ���ڼ��� {
	public static void main(String[] args) {
		int num=10;
		int[] numArr=new int[num];
		for(int i=0;i<numArr.length;i++){
			System.out.print(numArr[i]=(int)(Math.random()*num));			
		}System.out.println();

		for(int i=0;i<num;i++) {
			int count=0;
			for(int j=0;j<numArr.length;j++) {
				if(numArr[j]==i) {
					++count;
				}
			}
			System.out.printf("%d�� ����:%d%n",i,count);
		}
		
		
		System.out.println("åǮ��");
		for(int i=0;i<numArr.length;i++){
			System.out.print(numArr[i]=(int)(Math.random()*num));			
		}System.out.println(); //numArr �� ����
		
		int[] counter=new int[num];
		for(int i=0;i<numArr.length;i++) {
			counter[numArr[i]]++;
		}
		for(int i=0;i<numArr.length;i++) {
			System.out.println(i+"�� ����"+counter[i]);
		}
	}	

	
}