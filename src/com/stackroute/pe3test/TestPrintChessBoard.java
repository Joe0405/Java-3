package com.stackroute.pe3test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe3main.PrintChessBoard;

public class TestPrintChessBoard {
	PrintChessBoard printBoard;

	@Before
	public void setUp() throws Exception {
		printBoard = new PrintChessBoard();
	}

	@After
	public void tearDown() throws Exception {
		printBoard = null;
	}

	@Test
	public void test() {
		String[][] expected = {
				{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
				{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
				{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
				{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}
				};
		String[][] actual = printBoard.printChessBoard();
		assertArrayEquals(expected,actual);
	}

}
