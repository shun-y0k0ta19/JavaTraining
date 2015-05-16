package ex02_13;

import static org.junit.Assert.*;
import org.junit.Test;

import java.lang.reflect.Field;

public class Vehicle13Test {

	@Test
	public void testSetSpeed() throws Exception {
		int speed = 100;
		Vehicle tester = new Vehicle();
		tester.SetSpeed(speed);
		Field field = tester.getClass().getDeclaredField("speed");
        field.setAccessible(true);	// privateなフィールドに直接アクセスを可能にする
		assertEquals(speed,(int)field.get(tester));
	}
	
	@Test
	public void testSetAngle() throws Exception {
		int angle = 100;
		Vehicle tester = new Vehicle();
		tester.SetAngle(angle);
		Field field = tester.getClass().getDeclaredField("angle");
        field.setAccessible(true);	// privateなフィールドに直接アクセスを可能にする
		assertEquals(angle,(int)field.get(tester));
	}
	
	@Test
	public void testSetOwner() throws Exception {
		String owner = "Test";
		Vehicle tester = new Vehicle();
		tester.SetOwner(owner);
		Field field = tester.getClass().getDeclaredField("owner");
        field.setAccessible(true);	// privateなフィールドに直接アクセスを可能にする
		assertEquals(owner,(String)field.get(tester));
	}
	
	@Test
	public void testGetSpeed() throws Exception {
		int speed = 100;
		Vehicle tester = new Vehicle();
		tester.SetSpeed(speed);
		assertEquals(speed,tester.GetSpeed());
	}
	
	@Test
	public void testGetAngle() throws Exception {
		int angle = 100;
		Vehicle tester = new Vehicle();
		tester.SetAngle(angle);
		assertEquals(angle, tester.GetAngle());
	}
	
	@Test
	public void testGetOwner() throws Exception {
		String owner = "Test";
		Vehicle tester = new Vehicle();
		tester.SetOwner(owner);
		assertEquals(owner,tester.GetOwner());
	}

	@Test
	public void testGetVehicleID() throws Exception {
		long id = 100;
		Vehicle tester = new Vehicle();
		Field field = tester.getClass().getDeclaredField("vehicleID");
        field.setAccessible(true);	// privateなフィールドに直接アクセスを可能にする
        field.set(tester, id);
		assertEquals(id, tester.GetVehicleID());
	}

}
