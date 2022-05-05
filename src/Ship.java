public abstract class Ship {
	private int armor;
	private int initialArmor;
	private int baseDamage;
	
}

interface MilitaryUnit{
	abstract int attack();
	abstract void takeDamage();
}
