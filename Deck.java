/**
 *
 * @author Mary Kelly
 */
public class Deck {
    private String name;
    private int numberOfCards = 0;
    
    public Deck() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    @Override
    public String toString() {
        return "Deck{" + "name=" + name + ", numberOfCards=" + numberOfCards + '}';
    }
    
    
}
