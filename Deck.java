import java.util.*;

class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();

    }


    // Method to create a deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Method to print all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Method to print a specific card
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid card index.");
        }
    }

    // Method to check if two cards belong to the same suit
    public boolean sameCard(Card c1, Card c2) {
        return c1.getSuit().equals(c2.getSuit());
    }

    // Method to check if two cards have the same rank
    public boolean compareCard(Card c1, Card c2) {
        return c1.getRank().equals(c2.getRank());
    }

     // Method to find a specific card
    public boolean findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                return true;
            }
        }
        return false;
    }
// Method to deal 5 random cards
    public void dealCard() {
        Collections.shuffle(deck);
        System.out.println("Five Random Cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled.");
    }
}