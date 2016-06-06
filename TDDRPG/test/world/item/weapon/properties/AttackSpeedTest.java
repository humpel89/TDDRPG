package world.item.weapon.properties;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import world.item.weapon.properties.AttackSpeed;

public class AttackSpeedTest {

	AttackSpeed speed;	

	@Test
	public void testGetAttackSpeedSlow() {
		speed = AttackSpeed.SLOW;
		assertEquals(0.5, speed.getAttackSpeed(), 0.001);
	}
	
	@Test
	public void testGetAttackSpeedModerate() {
		speed = AttackSpeed.MODERATE;
		assertEquals(1.0, speed.getAttackSpeed(), 0.001);
	}
	
	@Test
	public void testGetAttackSpeedFast() {
		speed = AttackSpeed.FAST;
		assertEquals(2.0, speed.getAttackSpeed(), 0.001);
	}
	
}
