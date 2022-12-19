package Enum;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        while (!deck.isEmpty()) {
            Card card = deck.drawCard();
            System.out.println(card);
        }
    }
}