import java.util.Arrays;

public class Pokedex implements PokedexInterface {
	private Pokemon pokedex[] = new Pokemon[1000];
	private int pokemonCount = 0;
	
	
	


	
	 @Override
	public String toString() {
		 String output ="";
		 // loop through pokedex
		 // add each item of the pokedex to the output variable
		
		 for(Pokemon count: pokedex){
			
			 output += count;	
			 System.out.println(pokedex);
		 }
		return output;	
		}
	
	public void addPokemon(Pokemon pokemon) {
		return;
	}
}
