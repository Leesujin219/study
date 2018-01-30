package com.sist.java;

import java.util.Scanner;

public class Bingo {
	public static void main(String[] args) {
		final int SIZE=5;
		int[][] bingo=new int[SIZE][SIZE];
		int num=1;
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				bingo[i][j]=num;
				num++;
				System.out.printf("%3d",bingo[i][j]);
			}System.out.println();
		}
		System.out.println();
		
		//랜덤으로 돌려버림
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				int randX=(int)(Math.random()*bingo[i].length);
				int randY=(int)(Math.random()*bingo[i].length);
				int tmp=bingo[i][j];
				bingo[i][j]=bingo[randX][randY];
				bingo[randX][randY]=tmp;
			}
		}
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				System.out.printf("%3d",bingo[i][j]);
			}System.out.println();
		}
		int input=1;
		breakpoint:
		while(input!=0) {
			Scanner scan=new Scanner(System.in);
			System.out.print("1~25까지의 번호를 입력하세요(종료0)>");
			input=scan.nextInt();
			
			if(input==0)break;
			
			for(int i=0;i<bingo.length;i++) {
				for(int j=0;j<bingo[i].length;j++) {
					if(input==bingo[i][j]) {
						bingo[i][j]=0;	//0됨
					}
				}
			}
			for(int i=0;i<bingo.length;i++) {
				for(int j=0;j<bingo[i].length;j++) {
					System.out.printf("%3d",bingo[i][j]);
				}System.out.println();
			}//빙고판 출력
			//빙고 조건(가로)
			for(int i=0;i<bingo.length;i++) {
				int binCount=0;
				for(int j=0;j<bingo[i].length;j++) {
					if(bingo[i][j]==0){
						++binCount;
					}
				}
				if(binCount==5) {
					System.out.println("가로 빙고!!");
					break breakpoint;
				}
			}
			for(int i=0;i<bingo.length;i++) {
				int binCount=0;
				for(int j=0;j<bingo[i].length;j++) {
					if(bingo[j][i]==0){
						++binCount;
					}
				}
				if(binCount==5) {
					System.out.println("세로 빙고!!");
					break breakpoint;
				}
			}
			int binCount=0;
			for(int i=0;i<bingo.length;i++) {
				if(bingo[i][i]==0){
					++binCount;
				}
				if(binCount==5) {
					System.out.println("대각선 빙고!!");
					break breakpoint;
				}
			}
			binCount=0;
			for(int i=0;i<bingo.length;i++) {
				if(bingo[i][bingo.length-1-i]==0){
					++binCount;
				}
				if(binCount==5) {
					System.out.println("대각선 빙고!!");
					break breakpoint;
				}
			}
		
		
		}
		
	}
}
