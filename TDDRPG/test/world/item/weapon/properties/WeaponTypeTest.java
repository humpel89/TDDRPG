package world.item.weapon.properties;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import world.item.weapon.WeaponType;

public class WeaponTypeTest {

	WeaponType type;	

	@Test
	public void testIsCorrectObject() {
		type = WeaponType.AXE;
		assertEquals(WeaponType.AXE, type);
	}

}
