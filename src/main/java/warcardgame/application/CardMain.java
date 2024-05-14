package warcardgame.application;

import java.util.Random;

import warcardgame.model.Card;
import warcardgame.model.Rank;
import warcardgame.model.Suit;

public class CardMain {
	
	public static void message(String texte) {
		System.out.println(texte);
	}

    public static void main(String[] args) {
        Card[] deck = createDeck();
        printDeckWithCodes(deck); // Print deck before shuffling

        message("\n--------------------");
        message("Shuffling the deck");
        message("--------------------");
        shuffleDeck(deck);

        message("\nPrinting the deck after shuffling:");
        printDeckWithCodes(deck); // Print deck after shuffling
    }

    private static Card[] createDeck() {
        Card[] deck = new Card[52];
        int index = 0;

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck[index++] = new Card(rank, suit);
            }
        }

        return deck;
    }

    private static void printDeckWithCodes(Card[] deck) {
        for (Card card : deck) {
            System.out.println(card.rank().code() + card.suit().code());
        }
    }

    private static void transformEachSuitElementIntoRightCode() {
        for (Suit suit : Suit.values()) {
            System.out.println("The display of " + suit + " is " + suit.code());
        }
    }

    private static void transformEachRankElementIntoRightCode() {
        for (Rank rank : Rank.values()) {
            System.out.println("The display of " + rank + " is " + rank.code());
        }
    }

    private static void shuffleDeck(Card[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = random.nextInt(deck.length);
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
}
