package world.item.weapon.properties;

public enum AttackSpeed {
	SLOW(0.5), MODERATE(1.0), FAST(2.0);
	
	private final double AttackSpeed;
	
	AttackSpeed(double AttackSpeed){
		this.AttackSpeed = AttackSpeed;
	}

	public double getAttackSpeed() {
		return AttackSpeed;
	}
}
