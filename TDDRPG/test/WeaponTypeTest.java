import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import world.item.weapon.WeaponType;

public class WeaponTypeTest {

	WeaponType axe;	
	
	@Before
	public void setUp() throws Exception {
		axe = WeaponType.AXE;
	}

	@Test
	public void testIsCorrectObject() {
		assertEquals(WeaponType.AXE, axe);
	}

}
