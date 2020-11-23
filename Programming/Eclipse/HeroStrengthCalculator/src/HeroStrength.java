import java.util.ArrayList;
import java.util.Scanner;
public class HeroStrength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Battle bat1 = new Battle();
		int hp, attack;
		String name;
		boolean finished = false;

		while(finished == false) {
			System.out.println("Hero name? ");
			name = in.next();
			System.out.println("Hero HP? ");
			hp = in.nextInt();
			System.out.println("Hero attack? ");
			attack = in.nextInt();
			System.out.println("Add another one? y/n");
			String answer;
			answer = in.next();

			if (answer.equals("n")) {
				finished = true;
			}


			Hero hero = new Hero(hp, attack, name);
			bat1.addHero(hero);
		}
		System.out.println(bat1.allHeroes.get(0).name);
		System.out.println(bat1.totalStrength());
	}

}
class Monster {
	int hp;
	int attack;
	String name;

	Monster(int hp, int attack, String firstName, String secondName) {
		this.hp = hp;
		this.attack = attack;
		this.name = firstName + ' ' + secondName;

	}
}

class Hero {
	int hp, attack;
	String name;

	Hero(int hp, int attack, String fullName) {
		this.hp = hp;
		this.attack = attack;
		this.name = fullName;
	}
	int getStrength() {
		return 2*hp + attack;
	}
}
class Battle {
	ArrayList<Hero> allHeroes = new ArrayList<Hero>();
	void addHero(Hero hero) {
		allHeroes.add(hero);
	}
	int totalStrength() {
		int sum = 0;
		for (int i = 0; i < allHeroes.size(); i++) {
			sum += allHeroes.get(i).getStrength();
		}
		return sum;
	}
}
