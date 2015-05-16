package ex10_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeekDay {

	@Test
	public void test() {
		WorkDay workDay = new WorkDay();
		assertTrue(workDay.isWorkDay1(WorkDay.Days.MONDAY));
		assertTrue(workDay.isWorkDay1(WorkDay.Days.TUESDAY));
		assertTrue(workDay.isWorkDay1(WorkDay.Days.WEDNESDAY));
		assertTrue(workDay.isWorkDay1(WorkDay.Days.THURSDAY));
		assertTrue(workDay.isWorkDay1(WorkDay.Days.FRIDAY));
		assertFalse(workDay.isWorkDay1(WorkDay.Days.SATURDAY));
		assertFalse(workDay.isWorkDay1(WorkDay.Days.SUNDAY));
		
		assertTrue(workDay.isWorkDay2(WorkDay.Days.MONDAY));
		assertTrue(workDay.isWorkDay2(WorkDay.Days.TUESDAY));
		assertTrue(workDay.isWorkDay2(WorkDay.Days.WEDNESDAY));
		assertTrue(workDay.isWorkDay2(WorkDay.Days.THURSDAY));
		assertTrue(workDay.isWorkDay2(WorkDay.Days.FRIDAY));
		assertFalse(workDay.isWorkDay2(WorkDay.Days.SATURDAY));
		assertFalse(workDay.isWorkDay2(WorkDay.Days.SUNDAY));
		
	}

}
