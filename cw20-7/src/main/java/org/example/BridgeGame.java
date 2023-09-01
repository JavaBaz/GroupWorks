package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BridgeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<Card> deck = initializeDeck();
        int dealer = random.nextInt(2); // 0 or 1
        int currentPlayer = dealer;
        int[] scores = new int[2];

        while (true) {
            System.out.println("------ New Hand ------");
            dealer = (dealer + 1) % 2;
            List<Card>[] hands = dealHands(deck);
            Contract contract = bidding(scanner, hands, dealer);
            System.out.println("Contract: " + contract);
            int tricksTaken = playHand(scanner, hands, contract, dealer);
            scores[dealer] += tricksTaken;
            System.out.println("Hand Over");
            System.out.println("Scores: Player 1 - " + scores[0] + ", Player 2 - " + scores[1]);

            System.out.print("Do you want to play another hand? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Game Over");
        System.out.println("Final Scores: Player 1 - " + scores[0] + ", Player 2 - " + scores[1]);
        scanner.close();
    }

    private static List<Card> initializeDeck() {
        List<Card> deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }

        Collections.shuffle(deck);
        return deck;
    }

    private static List<Card>[] dealHands(List<Card> deck) {
        List<Card>[] hands = new List[2];
        hands[0] = new ArrayList<>();
        hands[1] = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                hands[j].add(deck.remove(0));
            }
        }

        return hands;
    }

    private static Contract bidding(Scanner scanner, List<Card>[] hands, int dealer) {
        int currentBidder = dealer;
        int opponent = (dealer + 1) % 2;
        Contract currentContract = null;

        while (true) {
            System.out.println("Bidding: Player " + (currentBidder + 1));
            System.out.print("Enter your bid (e.g., 'pass', 'one club', 'two spades'): ");
            String bid = scanner.nextLine().toLowerCase();

            if (bid.equals("pass")) {
                if (currentContract != null) {
                    break;
                }
            } else if (Contract.isValidBid(bid)) {
                currentContract = Contract.parse(bid);
            } else {
                System.out.println("Invalid bid. Try again.");
                continue;
            }

            // Swap the bidder
            currentBidder = opponent;
            opponent = (opponent + 1) % 2;
        }

        return currentContract;
    }

    private static int playHand(Scanner scanner, List<Card>[] hands, Contract contract, int dealer) {
        int tricksTaken = 0;
        int currentTrickTaker = dealer;
        List<Card> trick = new ArrayList<>();

        for (int i = 0; i < 13; i++) {
            int currentPlayer = (dealer + i) % 2;

            System.out.println("Player " + (currentPlayer + 1) + "'s turn");
            System.out.println("Your hand:");
            for (Card card : hands[currentPlayer]) {
                System.out.println(card);
            }

            if (currentPlayer == currentTrickTaker) {
                System.out.print("Lead a card: ");
            } else {
                System.out.print("Play a card: ");
            }

            String input = scanner.nextLine();
            Card selectedCard = findCardInHand(input, hands[currentPlayer]);

            if (selectedCard == null) {
                System.out.println("Invalid card. Try again.");
                i--;
                continue;
            }

            hands[currentPlayer].remove(selectedCard);
            trick.add(selectedCard);

            if (currentPlayer == currentTrickTaker && trick.size() == 1) {
                contract.setTrumpSuit(selectedCard.getSuit());
            }

            if (trick.size() == 2) {
                System.out.println("Trick: " + trick.get(0) + " vs. " + trick.get(1));
                int winnerIndex = contract.getTrickWinner(trick);
                currentTrickTaker = (currentTrickTaker + winnerIndex) % 2;
                System.out.println("Player " + (currentTrickTaker + 1) + " wins the trick.");
                trick.clear();
                tricksTaken++;
            }
        }

        return tricksTaken;
    }

    private static Card findCardInHand(String cardName, List<Card> hand) {
        for (Card card : hand) {
            if (card.toString().equalsIgnoreCase(cardName)) {
                return card;
            }
        }
        return null;
    }
}

class Card {
    private final String rank;
    private final String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class Contract {
    private String level;
    private String suit;

    public Contract(String level, String suit) {
        this.level = level;
        this.suit = suit;
    }

    public static boolean isValidBid(String bid) {
        // Implement your own validation logic here
        return true;
    }

    public static Contract parse(String bid) {
        // Implement parsing logic here
        return new Contract("level", "suit");
    }

    public void setTrumpSuit(String suit) {
        this.suit = suit;
    }

    public int getTrickWinner(List<Card> trick) {
        // Implement logic to determine the winner of a trick
        return 0; // Return the index of the winning player
    }

    @Override
    public String toString() {
        return level + " " + suit;
    }
}