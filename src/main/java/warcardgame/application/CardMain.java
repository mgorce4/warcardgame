package warcardgame.application;

import warcardgame.model.Card;
import warcardgame.model.Rank;
import warcardgame.model.Suit;

public class CardMain {
	
	public static void message(String texte) {
		System.out.println(texte);
	}


    public static void main(String[] args) {
        Referee referee = new Referee(); // Create an instance of Referee

        referee.createDeck(); // Call methods from Referee class
        referee.printDeckWithCodes();
        referee.shuffleDeck();
        message("mélangé:");
        referee.printDeckWithCodes();
    }
}