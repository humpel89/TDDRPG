package world.item.weapon;

import world.item.weapon.properties.*;

public enum WeaponType {

	AXE(AttackSpeed.SLOW, BaseDamage.HIGH),
	SWORD(AttackSpeed.FAST, BaseDamage.MEDIUM);
	
	private final double attackSpeed;
	private final double baseDamage;
	
	WeaponType(AttackSpeed speed, BaseDamage damage){
		this.attackSpeed = speed.getAttackSpeed();
		this.baseDamage = damage.getBaseDamage();
	}
	
	public double getAttackSpeed() {
		return attackSpeed;
	}

	public double getBaseDamage() {
		return baseDamage;
	}

}
