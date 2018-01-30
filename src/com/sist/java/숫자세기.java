package com.sist.java;

public class 숫자세기 {
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
			System.out.printf("%d의 개수:%d%n",i,count);
		}
		
		
		System.out.println("책풀이");
		for(int i=0;i<numArr.length;i++){
			System.out.print(numArr[i]=(int)(Math.random()*num));			
		}System.out.println(); //numArr 재 정의
		
		int[] counter=new int[num];
		for(int i=0;i<numArr.length;i++) {
			counter[numArr[i]]++;
		}
		for(int i=0;i<numArr.length;i++) {
			System.out.println(i+"의 개수"+counter[i]);
		}
	}	

	
}