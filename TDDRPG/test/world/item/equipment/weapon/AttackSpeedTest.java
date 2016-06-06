package world.item.equipment.weapon;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import world.item.equipment.weapon.AttackSpeed;

public class AttackSpeedTest {

	AttackSpeed speed;	

	@Test
	public void testGetAttackSpeedSlow() {
		speed = AttackSpeed.SLOW;
		assertEquals(3.8, speed.getAttackSpeed(), 0.001);
	}
	
	@Test
	public void testGetAttackSpeedModerate() {
		speed = AttackSpeed.MODERATE;
		assertEquals(2.8, speed.getAttackSpeed(), 0.001);
	}
	
	@Test
	public void testGetAttackSpeedFast() {
		speed = AttackSpeed.FAST;
		assertEquals(1.8, speed.getAttackSpeed(), 0.001);
	}
	
	@Test
	public void testToString(){
		speed = AttackSpeed.FAST;
		System.out.println(speed);
		assertEquals("FAST", speed.toString());
	}
}
