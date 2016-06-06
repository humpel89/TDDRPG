package world.item.equipment.weapon;

interface Weapon {
	
	WeaponDamage getDamage();

	String getSpeed();

	WeaponType getType();
	
	boolean hasRangedAttack();
	
}
