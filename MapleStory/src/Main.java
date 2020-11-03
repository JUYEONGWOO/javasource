import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Character user = new Character();
		Monster mon = new Monster();
		user.getState();
		user.attack(user, mon);

		user.attack(user, mon);

		user.attack(user, mon);
		user.attack(user, mon);
		user.attack(user, mon);
		user.attack(user, mon);
		user.drinkPotion();

		
	}

}

