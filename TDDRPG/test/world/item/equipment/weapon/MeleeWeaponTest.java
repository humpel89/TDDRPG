package world.item.equipment.weapon;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import world.item.equipment.EquipmentLevel;
import world.item.equipment.EquipmentQuality;

public class MeleeWeaponTest {

	MeleeWeapon axe;
	String axeName;
	EquipmentLevel level;
	EquipmentQuality normal;
	WeaponType axeType;
	
	@Before
	public void setUp() throws Exception {
		axeName = "Axe of the Avarage Joe";
		normal = Mockito.mock(EquipmentQuality.class);
		level = Mockito.mock(EquipmentLevel.class);
		axeType = Mockito.mock(WeaponType.class);
		
		Mockito.when(normal.getDropChanceMultiplier()).thenReturn(1.0);
		Mockito.when(level.getLevel()).thenReturn(1.0);
		Mockito.when(axeType.getAttackSpeed()).thenReturn(AttackSpeed.SLOW);
		Mockito.when(axeType.getBaseDamage()).thenReturn(3.8);
		
		axe = new MeleeWeapon(axeName, normal, level, axeType);
	}

	@Test
	public void TestGetDamage(){
		double expectedDamage = 3.8;
		assertEquals(expectedDamage, axe.getDamage());
	}

	@Test
	public void TestGetSpeed(){
		
	}

	@Test
	public void TestGetType(){
		assertEquals(WeaponType.AXE, axe.getType());
	}
	
	@Test
	public void TestHasRangedAttack(){
		
	}
}
