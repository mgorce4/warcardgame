package warcardgame.application;

import java.util.Random;

import warcardgame.model.Card;
import warcardgame.model.Rank;
import warcardgame.model.Suit;

public class Referee {

    private Card[] deck; // Declare deck array

    public void createDeck() {
        deck = new Card[52];
        int index = 0;

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck[index++] = new Card(rank, suit);
            }
        }
    }

    public void printDeckWithCodes() {
        for (Card card : deck) {
            Referee.message(card.rank().code() + card.suit().code());
        }
    }

    public void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = random.nextInt(deck.length);
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    private static void message(String texte) {
        System.out.println(texte);
    }
}