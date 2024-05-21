package model.world;
import java.util.*;

public class TrapCell extends Cell {
	private int trapDamage ;
	public TrapCell(boolean isVisble){
		
	}

	public int getTrapDamage() {
		return trapDamage;
	}
	public int trapDamage (){
		return ((int)(Math.random()*3+1)*10);
	}


}
