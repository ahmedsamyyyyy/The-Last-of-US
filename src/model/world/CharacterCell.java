package model.world;

public class CharacterCell extends Cell  {
	private Character Character ;
	private boolean isSafe ;
	public boolean isSafe() {
		return isSafe;
	}
	public void setSafe(boolean isSafe) {
		this.isSafe = isSafe;
	}
	public Character getCharacter() {
		return Character;
	}
	public void setCharacter(Character character) {
		Character = character;
	}

}
