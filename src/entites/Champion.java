package entites;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;
	
	
	public Champion(String name, int life, int damage, int armor) {
		super();
		this.name = name;
		this.life = life;
		this.armor = armor;
		setAttack(damage);
		
		
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
	
	public void takeDamage(int damage) {
		 if (armor >= damage) {
	            this.life --;
	    }
	    int damageTaken = damage - this.armor;
	    this.life = Math.max(this.life - damageTaken, 0);
	    }
	
	public String status() {
		  if (life == 0) {
	            return this.name + ": " + this.life + " de " + "vida (morreu)";
	        }else {
	            return  this.name + ": " + this.life + " de " + "vida";
	        }

	    }
	}

