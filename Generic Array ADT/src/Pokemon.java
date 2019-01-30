public class Pokemon implements PokemonInterface{

	
	private String name;
	private String type1;
	private int hp;
			public Pokemon(String name, String type1,int hp) 
			{
				super();
				this.name = name;
				this.type1 = type1;
				
				this.hp = hp;
				
	}

			//getters
			public String getName() {
				return name;
			}
			public String getType1() {
				return type1;
			}
			
		
			public int getHP() {
				return hp;
			}
			
			
		
		//setters
			
			
			public void setName(String name) 
			{
				this.name = name;
			}
		
			public void setType1(String type1)
			{
				this.type1 = type1;
			}

			
		
			public void setHP(int hp) {
				this.hp = hp;
			}
			
			
			@Override
			
			public String toString()
			{
				String output = "Name: " + getName()+
						"\nType: " + getType1()+
						
						"\nHP: " + getHP();
				return output;
			}
}
			
	