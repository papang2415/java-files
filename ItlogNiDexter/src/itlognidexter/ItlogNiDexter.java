package itlognidexter;

import java.util.Scanner;





public class ItlogNiDexter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String inventory = "";
        int total =0;
        
        String order;
        
        
        System.out.println("Enter customer name");
        String name = input.nextLine();
        System.out.println("Enter customer variant");
        String variant = input.nextLine();
        System.out.println("Enter customer quantity");
        int qty = input.nextInt();
        
        int subTotal = ItlogNiDexter.getSubTotal(variant, qty);
        
        order = "Customer name : " + name + "\n" +
                "Variant : " + variant + "\n" +
                 "Qty : " + qty + "\n" +
                "SubTotal : " + subTotal + "\n";
        
        
        
        
        System.out.println(order);
        inventory += order;
        
        System.out.println("Inventory \n" + inventory);
        
        
        

    }
    
    public static int getSubTotal(String variant,int qty){
        int subTotal = 0;
        switch(variant){
            case "penoy":
                subTotal = qty * 12;
                break;
            case "balot#16":
                subTotal = qty * 15;
                break;
            case "balot#118":
                subTotal = qty * 16;
                break;    
                
        }
 
        return  subTotal;
    }
    
    

}
