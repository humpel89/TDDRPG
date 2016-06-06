package world.item.equipment.weapon;

public enum WeaponType {
	
	AXE(AttackSpeed.SLOW, AttackType.MELEE),
	SWORD(AttackSpeed.MODERATE, AttackType.MELEE),
	BOW(AttackSpeed.SLOW, AttackType.RANGED),
	DAGGER(AttackSpeed.FAST, AttackType.MELEE),
	SPELLSWORD(AttackSpeed.MODERATE, AttackType.MELEE),
	STAFF(AttackSpeed.SLOW, AttackType.MELEE);
	
	private final double BASE_WEAPON_DAMAGE = 1.0;
	
	private final AttackSpeed attackSpeed;
	private final double weaponsBaseDamage;
	private final AttackType attackType;
	
	WeaponType(AttackSpeed attackSpeed, AttackType attackType){
		this.attackSpeed = attackSpeed;
		this.attackType = attackType;
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
	
	public boolean isRanged(){
		return attackType.equals(AttackType.RANGED);
	}

}
