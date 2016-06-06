package world.item.equipment.weapon;

import world.item.equipment.EquipmentLevel;
import world.item.equipment.EquipmentQuality;

public class RangedWeapon extends WeaponImpl {

	public RangedWeapon(String name, EquipmentQuality quality, EquipmentLevel level) {
		super(name, quality, level);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean hasRangedAttack(){
		return true;
	}
	
}
