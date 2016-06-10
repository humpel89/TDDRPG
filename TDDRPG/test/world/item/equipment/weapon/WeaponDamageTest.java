package world.item.equipment.weapon;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeaponDamageTest {

	WeaponDamage weaponDamage;
	double weaponsBaseDamage = 3.8;
	AttackSpeed attackSpeed;


	@Before
	public void setUp() throws Exception {
		attackSpeed = AttackSpeed.SLOW;
		weaponDamage = new WeaponDamage(weaponsBaseDamage, attackSpeed);
	}

	@Test
	public void testGetMaxWeaponDamage() {
		assertEquals(4.18, weaponDamage.getMax(), 0.001);
	}

	@Test
	public void testGetMinWeaponDamage() {
		assertEquals(3.4545, weaponDamage.getMin(), 0.0001);
	}
	
	@Test
	public void testGetDamagePerSecond() {
		assertEquals(1, weaponDamage.getDamagePerSecond(), 0.0001);
	}

}
