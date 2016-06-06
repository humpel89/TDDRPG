package world.item.equipment.weapon;

import world.item.equipment.EquipmentImpl;
import world.item.equipment.EquipmentLevel;
import world.item.equipment.EquipmentQuality;

public abstract class WeaponImpl extends EquipmentImpl implements Weapon {

	private WeaponType weaponType;

	public WeaponImpl(String name, EquipmentQuality quality, EquipmentLevel level) {
		super(name, quality, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public WeaponDamage getDamage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSpeed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WeaponType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasRangedAttack() {
		return weaponType.isRanged();
	}

}
