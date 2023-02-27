package DTO;

public class Painting extends Item {

    int height, width;
    boolean isWatercolour, isFramed;

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public Painting() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isWatercolour() {
        return isWatercolour;
    }

    public void setWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void outputPainting() {
        System.out.println("Height: " + height);
        System.out.println("width: " + width);
        System.out.println("isWatercolour: " + isWatercolour);
        System.out.println("isFramed: " + isFramed);
    }

    public void inputPainting() {
        input();
        System.out.print("Height: ");
        setHeight(sc.nextInt());
        sc.nextLine();
        System.out.print("Width: ");

        setWidth(sc.nextInt());
        sc.nextLine();

        System.out.print("Watercolour: ");
        setWatercolour(sc.nextBoolean());
        System.out.print("Framed: ");
        setFramed(sc.nextBoolean());
    }
}