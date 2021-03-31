package lab0902;

public class Cat extends Animal{
    
    public Cat(String name)
    {
        super.setName(name);
    }

    
    

    /**
     * Call the name of the cat.
     * @param name name of your cat.
     */
    @Override
    public void callName(String name) {
        // TODO Auto-generated method stub
        System.out.println("HELLO I am cat" + name);
        
    }








    @Override
    void printSomething() {
        // TODO Auto-generated method stub
        
    }




    @Override
    int MygetWeight() {return 0;}


}
