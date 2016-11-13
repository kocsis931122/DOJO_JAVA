package minesweeper;

import java.util.Random;

public class MineSweeperRandom {

	public static final char EMPTY_FIELD = '.';
	public static final char MINE = '*';
	public static final int[][] DIRECTIONS = new int[][] { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 },
			{ 1, -1 }, { 1, 0 }, { 1, 1 } };
	private char[][] field;

	public char[][] getField() {
		return field;
	}

	public MineSweeperRandom(int fieldLength) {
		field = new char[fieldLength][];
		generateMineField();
		fillField();
	}

	private void generateMineField() {
		Random rand = new Random();
		for (int i = 0; i < field.length; i++) {
			int rowLength = rand.nextInt(9);
			field[i] = new char[rowLength + 1];
		}
	}

	private void fillField() {
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = Math.random() > 0.8 ? MINE : EMPTY_FIELD;
			}
		}
	}

	public void scanField() {
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j] == EMPTY_FIELD) {
					int mineCount = countNeighbours(i, j);
					if (mineCount > 0) {
						field[i][j] = Integer.toString(mineCount).charAt(0);
						// field[i][j] = Character.forDigit(mineCount, 10);
						// field[i][j] = (char)(mineCount + 48);
					}
				}
			}

		}
	}

	private int countNeighbours(int i, int j) {
		int count = 0;
		for (int[] dir : DIRECTIONS) {
			int di = i + dir[0]; // szomszéd mezõ koordinátája(függõleges)
			int dj = j + dir[1]; // (vizszintesen)
			if (di >= 0 && di < field.length && dj >= 0 && dj < field[di].length && field[di][dj] == MINE) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		MineSweeperRandom ms = new MineSweeperRandom(10);
		ms.scanField();
		char[][] field = ms.getField();
		for (char[] is : field) {
			for (char c : is) {
				System.out.print(c);
			}
			System.out.println(is);
		}
		// int[][] a = new int[5][];
		// Random rand = new Random();
		// for (int i = 0; i < a.length; i++) {
		// int rowLength = rand.nextInt(9);
		// a[i] = new int[rowLength + 1];
		// }
	}

}
