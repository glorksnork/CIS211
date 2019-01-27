public class Pokemon implements PokemonInterface{

	
	private String name;
	private String type1;
	private int hp;
	private String type2;
	private int total;
	private int attack;
	private int defense;
	private int specAttack;
	private int specDefense;
	private int speed;
	private int generation;
	private String legendary;

			public Pokemon(int tempNum, String name, String type1, String type2, int Total, int HP, int Attack, int Defense, int SpecAttack, int SpecDefense, int Speed, int Generation, String legendary) {
				super();
				this.name = name;
				this.type1 = type1;
				this.type2 = type2;
				this.hp = hp;
				this.total = total;
				this.attack = attack;
				this.defense = defense;
				this.specAttack = specAttack;
				this.specDefense = specDefense;
				this.speed = speed;
				this.generation = generation;
				this.legendary = legendary;
	}

			//getters
			public String getName() {
				return name;
			}
			public String getType1() {
				return type1;
			}
			
			public String getType2() {
				
				return type2;
			}
			

			
			public int getTotal() {
				
				return total;
			}
			public int getHP() {
				return hp;
			}
			
			
			public int getAttack() {
				return attack;
			}
			
			public int getDefense() {
				return defense;
			}
			
			public int getSPATTACK() {
				return specAttack;
			}
			
			public int getSPDEFENSE() {
				return specDefense;
			}
			
			
			public int getSpeed() {
				return speed;
			}
			

			
			public int getGeneration() {
				return generation;
			}
			
			public String getLegendary() {
				return legendary;
			}
		//setters
			
			
			public void setName(String name) 
			{
				this.name = name;
			}
			public void setType2(String type2) {
				this.type2 = type2;
				
			}
			public void setType1(String type1)
			{
				this.type1 = type1;
			}

			
			public void setTotal(int total) {
				this.total = total;
			}
			public void setHP(int hp) {
				this.hp = hp;
			}
			
			public void setAttack(int attack) {
				this.attack = attack;
			}
			
			
			public void setDefense(int defense) {
				this.defense = defense;				
			}
			
			
			public void setSPATTACK(int specAttack) {
				this.specAttack = specAttack;
			}
			
			public void setSPDEFENSE(int specDefense) {
				this.specDefense = specDefense;
			}
			
			public void setSpeed(int speed) {
				this.speed = speed;
			}
			
			
			public void setGeneration(int generation) {
				this.generation = generation;
			}

			public void setLegendary(String legendary) {
				this.legendary = legendary;
			}
			@Override
			
			public String toString()
			{
				String output = "Name: " + getName()+
						"\nType: " + getType1()+
						"\nType2: " + getType2()+ "\n"+"Total: " + getTotal()+
						"\nHP: " + getHP()+
						"\nAttack: " + getAttack()+ "\n"+
						"Defense: " + getDefense()+
						"\nS.Attack: " + getSPATTACK()+
						"\nS. Defense: " + getSPDEFENSE()+ "\n"+ 
						"Speed: " + getSpeed()+
						"\nGeneration: " + getGeneration()+
						"\nLegendary: " + getLegendary()+ "\n";
				return output;
			}
			
			
			
			

			

			


			

			

		

			

			
			

			

			

			
			

			


			

			

}
