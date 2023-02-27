package DTO;

public class Vase extends Item {
    int height;
    String material;

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public Vase() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void outputVase() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }

    public void inputVase() {
        input();
        System.out.print("Height: ");
        setHeight(sc.nextInt());
        sc.nextLine();
        System.out.print("Material: ");
        setMaterial(sc.nextLine());
    }

    public static void main(String[] args) {
        Vase test = new Vase();
        test.inputVase();
        test.outputVase();
    }
}
