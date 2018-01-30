package com.sist.java;

import java.util.Scanner;

public class bingoSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE=5;
		int x=0,y=0,num=0;
		
		int[][] bingo=new int[SIZE][SIZE];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				bingo[i][j]=i*SIZE+j+1;	//각 배열 초기화
			}
		}
		//배열에 저장된 값 뒤섞기
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				x=(int)(Math.random()*SIZE);
				y=(int)(Math.random()*SIZE);
				//값 자리 바꾸기
				int tmp=bingo[i][j];
				bingo[i][j]=bingo[x][y];
				bingo[x][y]=tmp;
			}
		}
		do {
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++) {
					System.out.printf("%2d ",bingo[i][j]);
				}System.out.println();
			}
			System.out.println();
			System.out.printf("1~%d의 숫자를 입력하세요(종료:0)>",SIZE*SIZE);
			String tmp=scan.nextLine();
			num=Integer.parseInt(tmp);
			
			outer:
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++) {
					if(bingo[i][j]==num) {
						bingo[i][j]=0;
						break outer;
					}	
				}
			}
			
		}while(num!=0);
		
		
		
		
	}

}
