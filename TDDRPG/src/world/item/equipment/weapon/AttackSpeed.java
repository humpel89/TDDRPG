package world.item.equipment.weapon;

public enum AttackSpeed {
	SLOW(3.8), MODERATE(2.8), FAST(1.8);
	
	private final double speedMultiplier;
	
	AttackSpeed(double speedMultiplier){
		this.speedMultiplier = speedMultiplier;
	}

	public double getAttackSpeed() {
		return speedMultiplier;
	}
	
}
