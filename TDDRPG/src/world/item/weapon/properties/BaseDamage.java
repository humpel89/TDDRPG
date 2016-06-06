package world.item.weapon.properties;

public enum BaseDamage {
	LOW(1.0), MEDIUM(1.5), HIGH(2.0);

	private final double baseDamage;
	
	BaseDamage(double baseDamage){
		this.baseDamage = baseDamage;
	}

	public double getBaseDamage() {
		return baseDamage;
	}
}
