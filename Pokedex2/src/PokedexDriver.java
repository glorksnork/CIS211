
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PokedexDriver {
	
	public static void main(String[] args) {
		Pokemon poke1 = new Pokemon(25,"Pikachu","Electric",null,320,35,55,40,50,50,90,1,"False");
		Pokemon poke2 = new Pokemon(6,"Charizard","Fire","Flying",534,78,84,78,109,85,100,1,"False");
		Pokemon poke3 = new Pokemon(1,"Bulbasaur","Grass","Poison",318,45,49,49,65,65,45,1,"False");

		Pokedex pokedex = new Pokedex();
		pokedex.addPokemon(poke1);
		pokedex.addPokemon(poke2);
		pokedex.addPokemon(poke3);

		System.out.println(pokedex);
	}

}


