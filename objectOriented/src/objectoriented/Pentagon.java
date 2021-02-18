//abstract
package objectoriented;

public class Pentagon extends Shapes {

    @Override
    void side() {
        System.out.println("\nPentagon has 5 sides.");
    }

    @Override
    void angle() {
        System.out.println("Square has 5 angles(equal or unequal).\n");
    }

}
