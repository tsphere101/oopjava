public class Cow extends Animal {

    double height;
    double weight;

    public Cow(int id) {
        super(id);
        this.height = 0;
        this.weight = 0;
    }

    public Cow(String name) {
        super(name);
        this.height = 0;
        this.weight = 0;
    }

    public Cow(int id, String name) {
        super(id, name);
        this.height = 0;
        this.weight = 0;
    }

    /**
     * Modifiers
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Accessors
     */
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

}
