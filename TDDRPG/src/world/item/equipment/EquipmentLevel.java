package world.item.equipment;

public class EquipmentLevel {
	
	private double level = 1;

	public EquipmentLevel() {
	}
	
	public EquipmentLevel(double level) {
		//TODO Level range check
			this.level = level;
	}

	public double raiseLevelByOne() {
		//TODO Level range check
		level += 1;
		return level;
	}

	public double getLevel() {
		return level;
	}

}
