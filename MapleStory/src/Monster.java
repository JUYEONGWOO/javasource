
public class Monster {
	int demage;
	int hp;
	int php;
	int exp = 1;
	
	public Monster() {
		hp = 10;
		php = hp;
		demage = 1;
	}
	public void userAttack(Character user) {
		if((user.php-demage)>0) {
			user.php -= demage;
			user.getState();
		}
		else {
			user.php = 0;
			user.death();
		}
	}
	public int getDemage() {
		return demage;
	}

	public void setDemage(int demage) {
		this.demage = demage;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPhp() {
		return php;
	}

	public void setPhp(int php) {
		this.php = php;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
		
	public void getState() {
		System.out.println("hp"+getPhp()+"/"+getHp());
	}
}
