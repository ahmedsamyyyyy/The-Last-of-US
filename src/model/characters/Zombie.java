package model.characters;

public class Zombie extends Character {
	static int ZOMBIES_COUNT;
	
    public Zombie(String name, int maxHp, int attackDmg){
		super(name,maxHp,attackDmg);
		maxHp=40;
		attackDmg=10;
    }	
}
