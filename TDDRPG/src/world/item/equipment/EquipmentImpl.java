package world.item.equipment;

import world.item.Item;

public class EquipmentImpl extends Item implements Equipment {
	
	private final EquipmentQuality quality;
	private final EquipmentLevel level;
	
	public EquipmentImpl(String name, EquipmentQuality quality, EquipmentLevel level) {
		super(name);
		this.quality = quality;
		this.level = level;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double raiseEquipmentLevel() {
		return level.raiseLevelByOne();
	}

	@Override
	public EquipmentLevel getEquipmentLevel() {
		return level;
	}

	@Override
	public EquipmentQuality getQuality() {
		return quality;
	}

}
