package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion() {
	}

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	// metodos

	public void takeDamage(Champion other) {
		int damage = other.getAttack() - this.getArmor();
		if (damage < 1) {
			damage = 1; // Pelo menos 1 de vida o campeão A deve perder
		}
		this.life -= damage;
		if (this.life < 0) {
			this.life = 0; // A vida não deve ser negativa
		}
	}

	public String status() {
		if (life > 0) {
			return getName() + ": " + getLife() + " de vida.";
		} else {
			return getName() + ": 0 de vida (Morreu)";
		}
	}
}
