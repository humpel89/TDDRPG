package world.item.equipment.weapon;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import world.item.equipment.weapon.WeaponType;

public class WeaponTypeTest {

	WeaponType axe;	

	@Before
	public void setUp(){
		axe = WeaponType.AXE;
	}
	
	@Test
	public void testIsCorrectObject() {
		assertEquals(WeaponType.AXE, axe);
	}
	
	@Test
	public void testGetBaseDamage() {
		assertEquals(3.8, axe.getBaseDamage(), 0.001);
	}

}
