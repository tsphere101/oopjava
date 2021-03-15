public interface Animal abs{

    String name;
    int id;



    }

    /**
     * Methods
     */
    public void printName() {
        System.out.println("Name :: " + this.name);
    }
    public void printId()
    {
        System.out.println("Name::"+this.getName()+"\nID::"+this.getName());
    }

    /**
     * Modifiers
     */
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessors
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
