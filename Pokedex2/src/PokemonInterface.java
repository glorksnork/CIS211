
public interface PokemonInterface {
	
	String toString();
	
	void setName(String name);
	String getName();
	
	void setType1(String type);
	String getType1();
	
	void setType2(String type2
			);
	String getType2();
	
	void setTotal(int total);
	int getTotal();
	
	void setHP(int hp);
	int getHP();
	
	void setAttack(int attack);
	int getAttack();
	
	void setDefense(int defense);
	int getDefense();
	
	void setSPATTACK(int specAttack);
	int getSPATTACK();
	
	void setSPDEFENSE(int specDefense);
	int getSPDEFENSE();
	
	void setSpeed(int speed);
	int getSpeed();
	
	void setGeneration(int generation);
	int getGeneration();
	
	void setLegendary(String legendary);
	String getLegendary();
	
}
