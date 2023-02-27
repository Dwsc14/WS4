package DTO;

import java.util.Scanner;

public class Item {
    int value;
    String creator;
    Scanner sc = new Scanner(System.in);

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void output() {
        System.out.println(this.toString());
    }

    public void input() {
        while (true) {
            System.out.print("Value: ");
            this.value = sc.nextInt();
            sc.nextLine();
            if (this.value < 0) {
                System.out.println("Invalid input!");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Creator: ");
            this.creator = sc.nextLine();
            if (this.creator.trim().isEmpty()) {
                System.out.println("Invalid input!");
            } else {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "value=" + value + ", creator=" + creator;
    }

    // test
    public static void main(String[] args) {
        Item test = new Item();
        test.input();
        test.output();
    }
}