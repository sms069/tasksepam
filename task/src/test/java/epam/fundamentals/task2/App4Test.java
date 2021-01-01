package epam.fundamentals.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class App4Test {

	@Test
	public void removeMax() {
		int[][] numbers = {
				{6, 6, 6, 2, 3},
				{2, 4, 3, 4, 2},
				{2, 4, 2, 6, 7},
				{2, 7, 2, 3, 3},
				{6, 7, 7, 5, 7},
		};
		int[][] result = App4.removeMax(numbers);
		int[][] expected = {
				{6, 2},
				{2, 4}
		};
		assertArrayEquals("not expected result", expected, result);
	}

	@Test
	public void removeMaxExpectEmpty() {
		int[][] numbers = {
				{7, 6, 6, 2, 3},
				{5, 4, 3, 7, 2},
				{2, 4, 2, 6, 7},
				{2, 7, 2, 3, 3},
				{7, 7, 7, 5, 7},
		};
		int[][] result = App4.removeMax(numbers);
		int[][] expected = new int[1][1];
		assertArrayEquals("not expected result", expected, result);
	}
}