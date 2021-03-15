public class Chicken extends Animal {

    double height;
    double weight;

    /**
     * Create Chicken object with specified name.
     */

    public Chicken(String name) {
        super(name);
        this.weight = 0;
        this.height = 0;
    }

    public Chicken(int id) {
        super(id);
        this.weight = 0;
        this.height = 0;
    }

    public Chicken(int id, String name) {
        super(id, name);
        this.weight = 0;
        this.height = 0;
    }

    /**
     * 
     * Modifier
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Accessor
     */

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

}
