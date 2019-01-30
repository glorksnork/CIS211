
/**
 * @author Jin An
 * Delaware Technical Community College, Wilmington Campus
 * CIS 211, SP19
 */
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