package com.sist.java;

public class MatrixMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m1= {
				{1,2,3},
				{4,5,6},
		};
		int[][] m2= {
				{1,2},
				{3,4},
				{5,6}
		};
		final int ROW=m1.length;//m1 행의 수
		final int COL=m2[0].length;//m2 열의 수
		final int M2_ROW=m2.length;//m2 행의 수
		
		int[][] m3=new int[ROW][COL];
		
		//행렬의 곱 결과 m3에 저장
		for(int i=0;i<ROW;i++) 
			for(int j=0;j<COL;j++) 
				for(int k=0;k<M2_ROW;k++) 
					m3[i][j]+=m1[i][k]*m2[k][j];
				
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++) {
				System.out.printf("%3d",m3[i][j]);
			}System.out.println();
		}
		
	}

}
