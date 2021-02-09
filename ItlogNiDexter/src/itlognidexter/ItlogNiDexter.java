package itlognidexter;

import java.util.Scanner;

class Inventory {

    static boolean customer;
    String name;
    int penoy, balut16, balut18;

    public Inventory(String name, int penoy, int balut16, int balut18) {
        this.name = name;
        this.penoy = penoy;
        this.balut16 = balut16;
        this.balut18 = balut18;
    }
}

public class ItlogNiDexter {

    public static void main(String[] args) {
        String name = " ";
        int egg = 0, egg1 = 0, egg2 = 0, egg3 = 0;
        String[] balut = {"Penoy", "Balut#16", "Balut18"};
        Scanner in = new Scanner(System.in);
//        Inventory customer = new Inventory;
        Inventory customer = new Inventory("Dexter", 12, 15, 26);
        System.out.println(Inventory.customer);
        
    }
}
