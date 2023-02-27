package DTO;

public class Statue extends Item {
    int weight;
    String colour;

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public Statue() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void outputStatue() {
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

    public void inputStatue() {
        input();
        System.out.println("Weight: ");
        setWeight(sc.nextInt());
        sc.nextLine();
        System.out.println("Colour: ");
        setColour(sc.nextLine());
    }
}
