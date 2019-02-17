public interface PokemonInterface {
	@Override
	String toString();
	
	void setName(String name);
	String getName();
	
	void setType1(String type);
	String getType1();
	
	void setHP(int hp);
	int getHP();
}