import java.util.*;

public class CardGame {
	static ArrayList<Integer> cardsDeck = new ArrayList<>();
	static LinkedStack<Integer> cardStack = new LinkedStack<>();
	static LinkedStack<Integer> p1cards = new LinkedStack<>();
	static LinkedStack<Integer> p2cards = new LinkedStack<>();
	static LinkedStack<Integer> p1cardsWon = new LinkedStack<>();
	static LinkedStack<Integer> p2cardsWon = new LinkedStack<>();

	public static void main(String[] args) {
		initializeCards();
		shuffleCards();
		displayDeck();
		
		initializeCardStack();
		cardStack.printList();
		
		dealCards();
		
		
		System.out.println("Player 1 now has " + p1cards.length() + " cards.");
		System.out.println("Player 1 cards are: ");
		// Once the toString() method is implemented, this line should be replaced by
		 System.out.println(p1cards);
		p1cards.printList(); 
		
		
		System.out.println("Player 2 now has " + p2cards.length() + " cards.");
		System.out.println("Player 2 cards are: ");
		// Once the toString() method is implemented, this line should be replaced by
		 System.out.println(p2cards);
		p2cards.printList();
		
		// TODO: Game play logic:
		// TODO: As game progresses, the p1cards and p2cards stacks should get smaller
		// TODO: As game progresses, the p1cardsWon and p2CardsWon should get bigger, depending on who wins each round
		// TODO: When the game is over, display who won the game; in other words, is p1cardsWon or p2cardsWon bigger?
		
	}
	

	static void initializeCards() {
		// Deck of cards is filled with integers 0 through 51
		for (int i= 0; i<52; i++) {
			cardsDeck.add(i);
		}
	}
	
	static void shuffleCards() {
		// Shuffle the ArrayList holding the initial deck of cards
		Collections.shuffle(cardsDeck);
	}
	
	static void displayDeck() {
		// Simple method to display all items in deck of cards
		for (int card: cardsDeck) {
			System.out.print(card + " ");
		}
	}
	
	static void initializeCardStack() {
		// The initial ArrayList was used to facilitate shuffling, now we use the Stack ADT to implement the rest of our game
		for (int i= 0; i<52; i++) {
			cardStack.push(cardsDeck.get(i));
		}
	}
	
	static void dealCards() {
		// Deal cards to each player
		for (int i= 0; i<52; i++) {
			if (i%2 == 0) {
				p1cards.push(cardStack.pop());
			} else {
				p2cards.push(cardStack.pop());	
			}
		}
	}
	
}
