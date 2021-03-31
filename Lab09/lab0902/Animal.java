package lab0902;

public abstract class Animal {

    private String name = "NONE";
    private int id;
    private double weight;
    private double height;



    public abstract void callName(String name);
    abstract int MygetWeight();
    abstract void printSomething();

    public double getHeight() {
        return height;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
