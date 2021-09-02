package katas.nextbignumber;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class NextBigNumberTest {
	
	@Test
	public void inputSingleDigit_ShouldReturnMinusOne() {
		assertEquals(-1, NextBiggerNumber.process(1));
	}
	
	@Test
	public void inputRefactorableNumber_ShouldIeldResult() {
		assertEquals(40987433, NextBiggerNumber.process(40987343));
	}
	
	
	@Test
	public void turnIntoArray() {
		assertEquals(0,Arrays.compare(new int[] {5, 8, 4, 8}, NextBiggerNumber.turnNumberIntoArray(5848L)));
	}
	
}
