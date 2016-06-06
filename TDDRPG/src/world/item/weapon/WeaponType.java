package world.item.weapon;

import world.item.weapon.properties.*;

public enum WeaponType {
	
	AXE(AttackSpeed.SLOW, BaseDamage.HIGH),
	SWORD(AttackSpeed.MODERATE, BaseDamage.MEDIUM),
	BOW(AttackSpeed.SLOW, BaseDamage.HIGH),
	DAGGER(AttackSpeed.FAST, BaseDamage.LOW),
	SPELLSWORD(AttackSpeed.MODERATE, BaseDamage.LOW),
	STAFF(AttackSpeed.SLOW, BaseDamage.LOW);
	
	private final AttackSpeed attackSpeed;
	private final BaseDamage baseDamage;
	
	WeaponType(AttackSpeed speed, BaseDamage damage){
		this.attackSpeed = speed;
		this.baseDamage = damage;
	}
	
	public double getAttackSpeed() {
		return attackSpeed.getAttackSpeed();
	}

	public double getBaseDamage() {
		return baseDamage.getBaseDamage();
	}
	
	

}
