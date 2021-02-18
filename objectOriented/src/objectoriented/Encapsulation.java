package objectoriented;

public class Encapsulation {

    private String shapeName;
    private int numberOfAngles;
    private int numberOfSides;

    // Getter methods
    public String getName() {
        return shapeName;
    }

    public int getNumberOfAngles() {
        return numberOfAngles;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    // Setter methods
    public void setName(String name) {
        this.shapeName = name;
    }

    public void setNumberOfAngles(int numberOfAngles) {
        this.numberOfAngles = numberOfAngles;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
}
