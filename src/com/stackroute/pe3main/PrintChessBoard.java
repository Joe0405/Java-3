package com.stackroute.pe3main;

public class PrintChessBoard {
	public String[][] printChessBoard() {
		int temp =1;
		String[][] chessBoard = new String[8][8];
		for(int i=0; i<8; i++, temp*=-1 ) {
			for(int j=0; j<8; j++) {
				if(temp == 1) {
					chessBoard[i][j] = "WW|";
					temp = -1;
				}
				else {
					chessBoard[i][j] = "BB|";
					temp = 1;
				}
			}
		}	
		return chessBoard;
	}

}
