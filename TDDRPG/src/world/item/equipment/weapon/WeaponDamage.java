package world.item.equipment.weapon;

public class WeaponDamage {

	private double maxDamage;
	private double minDamage;
	private double damagePerSecond;

	private double damageScatterMultiplier = 1.1; 

	public WeaponDamage(double weaponBaseDamage, AttackSpeed attackSpeed) {
		this.maxDamage = calculateMaxFrom(weaponBaseDamage);
		this.minDamage = calculateMinFrom(weaponBaseDamage);
		this.damagePerSecond = calculateDamagePerSecond(weaponBaseDamage, attackSpeed);
	}

	private double calculateMaxFrom(double weaponBaseDamage) {
		return weaponBaseDamage * damageScatterMultiplier;
	}

	private double calculateMinFrom(double weaponBaseDamage) {
		return weaponBaseDamage / (damageScatterMultiplier);
	}

	private double calculateDamagePerSecond(double weaponBaseDamage, AttackSpeed attackSpeed) {
		return weaponBaseDamage / attackSpeed.getAttackSpeed();
	}
	public double getMax() {
		return maxDamage;
	}

	public double getMin() {
		return minDamage;
	}

	public double getDamagePerSecond() {
		return damagePerSecond;
	}

}
