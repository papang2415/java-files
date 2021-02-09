package itlognidexter;

import java.util.Scanner;

class Order {

    String customerName;
    double amount;
    double total;
    EggVariant[] variants;

    Order() {
        this.variants = new EggVariant[5];
    }

}

class EggVariant {

    String variant;
    int qty;
    double price;
}

public class ItlogNiDexter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] variants = {"Penoy", "Balot#16", "Balot#18"};

        Order orders[] = new Order[10];

        Order order = new Order();

        order.customerName = "Loerm";

        orders[0] = order;

        System.out.println("Order 1 : Customer Name : " + orders[0].customerName);

    }

}
