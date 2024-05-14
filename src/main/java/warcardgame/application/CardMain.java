package warcardgame.application;

import warcardgame.model.Card;
import warcardgame.model.Rank;
import warcardgame.model.Suit;

public class CardMain {

    public static void main(String[] args) {
        Card[] deck = createDeck();
        printDeckWithCodes(deck); // Call the modified printDeckWithCodes method

        System.out.println("\n--------------------");
        System.out.println("Transform each suit element into right code");
        System.out.println("--------------------");
        transformEachSuitElementIntoRightCode();

        System.out.println("\n--------------------");
        System.out.println("Transform each rank element into right code");
        System.out.println("--------------------");
        transformEachRankElementIntoRightCode();
    }

    private static Card[] createDeck() {
        Card[] deck = new Card[52]; // Initialize deck with size 52
        int index = 0;

        // Create cards for each suit and rank
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck[index++] = new Card(rank, suit); // Create card and add to deck
            }
        }

        return deck;
    }

    private static void printDeckWithCodes(Card[] deck) {
        System.out.println("Printing the deck with codes:");
        for (Card card : deck) {
            System.out.println(card.rank().code() + card.suit().code()); // Use codes instead of full names
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
}
