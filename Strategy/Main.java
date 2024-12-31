// the main class
class Main {
	public static void main(String[] args) {
		Character king = new King("Leonidas");
		king.sayName();
		king.useSkill();
		king.sayWeapon();
		king.useWeapon();

		Character knight = new Knight("Illiad");
		knight.sayName();
		knight.useSkill();
		knight.sayWeapon();
		knight.useWeapon();
	}
}

/**
 * Weapon
 */
interface Weapon {
	public void weaponAttack();

	public void announceWeapon();
}

// a subclass of Weapon class that creates weapons that do attack
abstract class WorkingWeapons implements Weapon {
	private String weaponName;

	private String attackName;

	public void setAttackName(String attackName) {
		this.attackName = attackName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public void weaponAttack() {
		System.out.println(attackName + "!!!");
	}

	public void announceWeapon() {
		System.out.println(weaponName + "!!!");
	}

}

// a child class of the working weapons class
class Knife extends WorkingWeapons {
	public Knife() {
		this.setWeaponName("Knife");
		this.setAttackName("stab");
	}
}

//
// a child class of the working weapons class
class Sword extends WorkingWeapons {
	public Sword() {
		this.setWeaponName("Sword");
		this.setAttackName("Slash");
	}
}

/**
 * Skill
 */
interface Skill {
	public void skillAttack();
}

// implementation of the skill interfact
class Run implements Skill {
	public void skillAttack() {
		System.out.println("Run (3x speed)");
	}
}

// implementation of the skill interfact
class VerticalSlash implements Skill {
	public void skillAttack() {
		System.out.println("From top to bottom, the heavens shall split!");
	}
}

// Character abstract class
abstract class Character {
	protected String name;
	protected String role;
	protected Weapon weapon;
	protected Skill skill;

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public void sayName() {
		System.out.println("I am " + this.name + ". A " + this.role);
	}

	public void useSkill() {
		this.skill.skillAttack();
	}

	public void useWeapon() {
		this.weapon.weaponAttack();
	}

	public void sayWeapon() {
		this.weapon.announceWeapon();
	}
}

// a new character
class King extends Character {
	public King(String characterName) {
		this.name = characterName;
		this.role = "King";
		this.weapon = new Knife();
		this.skill = new Run();
	}
}

// a new character
class Knight extends Character {
	public Knight(String characterName) {
		this.name = characterName;
		this.role = "Knight";
		this.weapon = new Sword();
		this.skill = new VerticalSlash();
	}
}
