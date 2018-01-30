package com.sist.java;

import java.util.Scanner;

public class BattleShip {
	public static void main(String[] args) {
		final int SIZE=10;
		int x=0,y=0;
		
		char[][] board=new char[SIZE][SIZE];
		byte[][] shipBoard= {
				//1 2 3 4 5 6 7 8 9
				 {0,0,0,0,0,0,1,0,0},//1
				 {1,1,1,1,0,0,1,0,0},//2
				 {0,0,0,0,0,0,1,0,0},//3
				 {0,0,0,0,0,0,1,0,0},//4
				 {0,0,0,0,0,0,0,0,0},//5
				 {1,1,0,1,0,0,0,0,0},//6
				 {0,0,0,1,0,0,0,0,0},//7
				 {0,0,0,1,0,0,0,0,0},//8
				 {0,0,0,0,0,1,1,1,0},//9
				};
		for(int i=1;i<SIZE;i++)
			board[0][i]=board[i][0]=(char)(i+'0');
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌표를 입력하세요.(종료는00)>");
			String input=scan.nextLine();
			
			if(input.length()==2) {//2글자 입력
				x=input.charAt(0)-'0';	//문자를 숫자로 변환 
				y=input.charAt(1)-'0'; //char'0'> int로 48
				if(x==0&&y==0)
					break;
			}
			if(input.length()!=2||x<=0||x>=SIZE||y<=0||y>=SIZE) {
				System.out.println("잘못된 입력입니다. 다시입력하세요.");
				continue;
			}
			board[x][y]=shipBoard[x-1][y-1]==1?'O':'X';
			for(int i=0;i<SIZE;i++) 
				System.out.println(board[i]);
			System.out.println();
				
		}
		
	}
}
