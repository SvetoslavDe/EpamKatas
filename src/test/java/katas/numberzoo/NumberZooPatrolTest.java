package katas.numberzoo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumberZooPatrolTest {

	@Test
	public void findMissingNumberTest() {
		assertEquals(1, NumberZooPatrol.findMissingNumber(new int[] {2,3,4}));
	}
}
