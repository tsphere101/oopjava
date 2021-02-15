package lab0603;


public class MyMain {
    public static void main(String[] args) {
        
        Queue myq = new Queue();

        addSequence(20, myq);
        myq.showElements();
        System.out.println("The size is : " + myq.getSize());
        System.out.println("The index is : " + myq.getIndex());

        myq.enqueue(50);
        myq.showElements();
        System.out.println("The size is : " + myq.getSize());
        System.out.println("The index is : " + myq.getIndex());

        addSequence(500, myq);
        myq.showElements();
        System.out.println("The size is : " + myq.getSize());
        System.out.println("The index is : " + myq.getIndex());

        myq.dequeue();
        myq.showElements();
        System.out.println("The size is : " + myq.getSize());
        System.out.println("The index is : " + myq.getIndex());

        myq.empty();
        myq.showElements();
        System.out.println("The size is : " + myq.getSize());
        System.out.println("The index is : " + myq.getIndex());

        myq.enqueue(52);
        myq.showElements();

    }




    public static void addSequence(int num, Queue q)
    {
        for(int i = 1 ; i <= num ; i++)
        {
            q.enqueue(i);
        }
    }


}
