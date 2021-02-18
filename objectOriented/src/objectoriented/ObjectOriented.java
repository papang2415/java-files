package objectoriented;

public class ObjectOriented {

    public static void main(String[] args) {
        //Abstract
        Shapes square = new Square();
        System.out.println("Abstract");
        square.data();
        square.side();
        square.angle();

        Shapes penta = new Pentagon();
        System.out.println("Abstract");
        penta.data();
        penta.side();
        penta.angle();

        //Encapsulation
        Encapsulation hexagon = new Encapsulation();

        hexagon.setName("Hexagon");
        hexagon.setNumberOfAngles(6);
        hexagon.setNumberOfSides(6);
        
        System.out.println("Encapsulation");
        System.out.println("Name: " + hexagon.getName());
        System.out.println("Average Angles: " + hexagon.getNumberOfAngles() + " (equal or unequal).");
        System.out.println("Number of Sides: " + hexagon.getNumberOfSides()+ " sides.");
        
        
        //Inheritance
        animalInheritance newAnimal = new animalInheritance();
        Horse horse1 = new Horse();
        
        System.out.println("Inheritance");
        System.out.println("Name: " + horse1.name);
        System.out.println("Numbers of Legs: " + horse1.numbersOfLegs + " legs.\n");
        horse1.Sound();
        horse1.Eat();
        
        
        
    }

}
