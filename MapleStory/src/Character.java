
public class Character {

	int level;
	int hp ;
	int php;
	int str;
	int dex;
	int luck;
	int intel;
	int pexp;
	int exp;
	int demage;
	public Character() {
		level = 1;
		hp = 10;
		php = 10;
		str = 5;
		dex = 5;
		luck = 5;
		intel = 5;
		pexp = 0;
		exp = 10;
		demage = 1;
	}
	
	public void levelUp() {
		this.level += 1 ;
		hp += 10;
		php = hp;
		str += 1;
		dex = 1;
		luck = 1;
		intel = 1;
		pexp = 0;
		exp *=2 ;
		getState();
	
	}
	public void attack(Character user,Monster mon) {
		if((mon.php-demage)>0) {
			mon.php -= demage;
			System.out.print("ÆÜ! ");
			mon.getState();
			mon.userAttack(user);
			
		}
		else {
			mon.php = 0;

			System.out.print("ÆÜ! ");
			mon.getState();
			pexp += mon.exp;
			if(exp == pexp)
				levelUp();


		}
			
	}
	public void death() {
		php = 1;
		if(pexp > exp/10) {
			pexp -= exp/10;
		}
		else
			pexp = 0 ;
		
	}
	public void drinkPotion() {
		System.out.println("ÆÄ¿ö¿¤¸¯¼­¸¦ º¹¿ëÇÏ¼Ì½À´Ï´Ù.");
		php = hp;
		getState();
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getPexp() {
		return pexp;
	}

	public void setPexp(int pexp) {
		this.pexp = pexp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getDemage() {
		return demage;
	}

	public void setDemage(int demage) {
		this.demage = demage;
	}
	public void getState() {
		System.out.println("Lv : "+ getLevel() +" H.P : " + getPhp() + " / " + getHp() + " Exp " + getPexp() + " / " + getExp());
	}
}
