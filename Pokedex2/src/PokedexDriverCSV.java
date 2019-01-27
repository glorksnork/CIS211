import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PokedexDriverCSV {
	public static void main(String[] args) throws NumberFormatException{
		
		Pokedex pokedex = new Pokedex();

		BufferedReader br = null;
		try
		{
			//Reading the csv file
			br = new BufferedReader(new FileReader("Pokemon.csv"));

			//Create List for holding Pokemon objects
			List<Pokemon> pokemonList = new ArrayList<Pokemon>();

			String line = "";
			//Read to skip the header
			br.readLine();
			 while ((line= br.readLine())!= null)
			{
				//String[] pokemonDetails = fileRead.split(",");
				 String[] pokemonDetails = line.split(",");				
				if(pokemonDetails.length > 0 )
				{
					
					
					
					//Create a temporary pokemon
					
					//System.out.println("pokemonDetails[0]'s value is '" + pokemonDetails[0] + "'");
					System.out.println(Arrays.toString(pokemonDetails));
					int tempNum = Integer.parseInt(pokemonDetails[0].toString());
					String tempName = pokemonDetails[1].toString();
					String tempType1 = pokemonDetails[2].toString();
					String tempType2 = pokemonDetails[3].toString();
					int tempTotal = Integer.parseInt(pokemonDetails[4].toString());
					int tempHP = Integer.parseInt(pokemonDetails[5].toString());
					int tempAttack = Integer.parseInt(pokemonDetails[6].toString());;
					int tempDefense = Integer.parseInt(pokemonDetails[7].toString());
					int tempSpecAttack = Integer.parseInt(pokemonDetails[8].toString());
					int tempSpecDefense = Integer.parseInt(pokemonDetails[9].toString());;
					int tempSpeed = Integer.parseInt(pokemonDetails[10].toString());
					int tempGeneration = Integer.parseInt(pokemonDetails[11].toString());
					String tempLegendary = pokemonDetails[12].toString();
					
					
					/*
					Pokemon tempPoke = new Pokemon(Integer.parseInt(pokemonDetails[0]),
                            pokemonDetails[1],pokemonDetails[2],pokemonDetails[3],
                            Integer.parseInt(pokemonDetails[4]),Integer.parseInt(pokemonDetails[5]),Integer.parseInt(pokemonDetails[6]),Integer.parseInt(pokemonDetails[7]),
                            Integer.parseInt(pokemonDetails[8]),Integer.parseInt(pokemonDetails[9]),Integer.parseInt(pokemonDetails[10]),Integer.parseInt(pokemonDetails[11]),
                            pokemonDetails[12]); 
					*/
					//Save the Pokemon details in Pokemon object
					
					
					
					Pokemon tempPoke = new Pokemon(tempNum,tempName, tempType1, tempType2,tempTotal,tempHP,tempAttack,tempDefense,tempSpecAttack,tempSpecDefense,
							tempSpeed,tempGeneration,tempLegendary);
							
					
					
					
					
					
					pokedex.addPokemon(tempPoke);
					line = br.readLine();
				
				
				
				}
				
			}
			 br.close();
			 for(Pokemon p : pokemonList)
	            {
				 System.out.println("############ POKEDEX CONTENTS ############");
	                System.out.println("Name: " + p.getName()+
							"\nType: " + p.getType1()+
							"\nType2: " + p.getType2()+ "\n"+"Total: " +p.getTotal()+
							"\nHP: " + p.getHP()+
							"\nAttack: " + p.getAttack()+ "\n"+
							"Defense: " + p.getDefense()+
							"\nS.Attack: " + p.getSPATTACK()+
							"\nS. Defense: " + p.getSPDEFENSE()+ "\n"+ 
							"Speed: " + p.getSpeed()+
							"\nGeneration: " + p.getGeneration()+
							"\nLegendary: " + p.getLegendary()+ "\n");
	                System.out.println(pokedex);
	            }
			
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
	
		
		
		{
			try
			{
				br.close();
			}
			catch(IOException ie)
			{
				System.out.println("Error occured while closing the BufferedReader");
				ie.printStackTrace();
			}
		
		}
		
		
	}

		
		// End of code adapted from Example 1. Using Buffered Reader and String.split() from https://www.javainterviewpoint.com/how-to-read-and-parse-csv-file-in-java/


	}


