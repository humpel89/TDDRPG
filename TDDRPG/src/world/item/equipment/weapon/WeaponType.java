package world.item.equipment.weapon;

public enum WeaponType {
	
	AXE(AttackSpeed.SLOW),
	SWORD(AttackSpeed.MODERATE),
	BOW(AttackSpeed.SLOW),
	DAGGER(AttackSpeed.FAST),
	SPELLSWORD(AttackSpeed.MODERATE),
	STAFF(AttackSpeed.SLOW);
	
	private final double BASE_WEAPON_DAMAGE = 1.0;
	
	private final AttackSpeed attackSpeed;
	private final double weaponsBaseDamage;
	
	WeaponType(AttackSpeed attackSpeed){
		this.attackSpeed = attackSpeed;
		this.weaponsBaseDamage = calculateThisWeaponsBaseDamageFrom(attackSpeed);
	}
	
	private double calculateThisWeaponsBaseDamageFrom(AttackSpeed attackSpeed) {
		return attackSpeed.getAttackSpeed() * BASE_WEAPON_DAMAGE;
	}
	
	public AttackSpeed getAttackSpeed() {
		return attackSpeed;
	}

	public double getBaseDamage() {
		return weaponsBaseDamage;
	}

}
