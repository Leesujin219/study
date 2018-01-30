package com.sist.java;

import java.util.Arrays;

public class 자리정렬 {
	public static void main(String[] args) {
		int[] numArr=new int[10];
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]=(int)(Math.random()*10));
		}System.out.println();
		
		for(int i=0;i<numArr.length-1;i++) {
			boolean changed=false;	//자리바꿈 체크
			for(int j=0;j<numArr.length-1-i;j++) {
				if(numArr[j]>numArr[j+1]) {
					int tmp=numArr[j];
					numArr[j]=numArr[j+1];
					numArr[j+1]=tmp;
					changed=true;
				}
			}//j 반복문 end
			if(!changed) break;	//자리바꿈 없으면 반복문 벗어남
			for(int k=0;k<numArr.length;k++) {
				System.out.print(numArr[k]);
			}System.out.println();
		}//end for i
		System.out.println("다시");
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]=(int)(Math.random()*10));
		}System.out.println();
		
		for(int i=0;i<numArr.length;i++) {
			boolean changed=false;	//자리바꿈 체크			
			for(int j=i+1;j<numArr.length;j++) {
				if(numArr[i]>numArr[j]) {
					int tmp=numArr[i];
					numArr[i]=numArr[j];
					numArr[j]=tmp;
					changed=true;
				}
			}//j for end
			if(!changed)break;
			for(int k=0;k<numArr.length;k++) {
				System.out.print(numArr[k]);
			}System.out.println();
		}
		
		
	}
	
}
