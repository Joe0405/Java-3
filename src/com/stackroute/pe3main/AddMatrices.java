package com.stackroute.pe3main;

public class AddMatrices {
	public int[][] addMatrices(int[][] matrixA, int[][] matrixB, int row, int column) {
		int[][] sumMatrix = new int[row][column];
		for(int i=0; i<row; i++)
			for(int j=0; j<column; j++)
				sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
	
		return sumMatrix;
	}

}
