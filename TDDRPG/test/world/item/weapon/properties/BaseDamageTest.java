package world.item.weapon.properties;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import world.item.weapon.properties.BaseDamage;

public class BaseDamageTest {

	BaseDamage baseDamage;

	@Test
	public void testGetBaseDamageHigh() {
		baseDamage = BaseDamage.HIGH;
		assertEquals(2.0, baseDamage.getBaseDamage(), 0.001);
	}
	
	@Test
	public void testGetBaseDamageMedium() {
		baseDamage = BaseDamage.MEDIUM;
		assertEquals(1.5, baseDamage.getBaseDamage(), 0.001);
	}
	
	@Test
	public void testGetBaseDamageLow() {
		baseDamage = BaseDamage.LOW;
		assertEquals(1, baseDamage.getBaseDamage(), 0.001);
	}

}
