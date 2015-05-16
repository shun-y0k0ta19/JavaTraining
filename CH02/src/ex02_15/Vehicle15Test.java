package ex02_15;

import static org.junit.Assert.*;
import org.junit.Test;

import java.lang.reflect.Field;

public class Vehicle15Test {

	@Test
	public void testChangeSpeed() throws Exception {
		int speed = 100;
		Vehicle tester = new Vehicle();
		tester.ChangeSpeed(speed);
		Field field = tester.getClass().getDeclaredField("speed");
        field.setAccessible(true);	// privateなフィールドに直接アクセスを可能にする
		assertEquals(speed, (int)field.get(tester));
	}

	@Test
	public void testStop() throws Exception {
		int speed = 0;
		Vehicle tester = new Vehicle();
		tester.Stop();
		Field field = tester.getClass().getDeclaredField("speed");
        field.setAccessible(true);	// privateなフィールドに直接アクセスを可能にする
		assertEquals(speed, (int)field.get(tester));
	}
}
